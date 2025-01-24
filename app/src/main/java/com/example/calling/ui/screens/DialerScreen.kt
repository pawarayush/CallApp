package com.example.calling.ui.screens

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource
import com.example.callingapp.R
import androidx.core.content.ContextCompat
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign

@Composable
fun DialerScreen() {
    var phoneNumber by remember { mutableStateOf("") }
    var showPermissionDialog by remember { mutableStateOf(false) }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Static phone number display at top
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp) // Fixed height for number display
                .padding(horizontal = 24.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = if (phoneNumber.isEmpty()) "Enter phone number" else phoneNumber.chunked(3).joinToString(" "),
                style = MaterialTheme.typography.headlineLarge,
                textAlign = TextAlign.Center,
                color = if (phoneNumber.isEmpty()) 
                    MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                else 
                    MaterialTheme.colorScheme.onSurface,
                maxLines = 1
            )
        }

        Spacer(modifier = Modifier.weight(1f)) // This will push the dialpad to the bottom

        // Dial pad grid
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(bottom = 24.dp)
        ) {
            val dialpadItems = listOf(
                DialpadItem("1", ""),
                DialpadItem("2", "ABC"),
                DialpadItem("3", "DEF"),
                DialpadItem("4", "GHI"),
                DialpadItem("5", "JKL"),
                DialpadItem("6", "MNO"),
                DialpadItem("7", "PQRS"),
                DialpadItem("8", "TUV"),
                DialpadItem("9", "WXYZ"),
                DialpadItem("*", ""),
                DialpadItem("0", "+"),
                DialpadItem("#", "")
            )

            (0..3).forEach { row ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    (0..2).forEach { col ->
                        val index = row * 3 + col
                        if (index < dialpadItems.size) {
                            EnhancedDialpadButton(
                                number = dialpadItems[index].number,
                                letters = dialpadItems[index].letters,
                                onClick = { phoneNumber += dialpadItems[index].number }
                            )
                        }
                    }
                }
            }
        }

        // Bottom row with call and delete buttons
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = {
                    if (phoneNumber.isNotEmpty()) {
                        phoneNumber = phoneNumber.dropLast(1)
                    }
                },
                modifier = Modifier.size(56.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_backspace),
                    contentDescription = "Delete",
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.size(28.dp)
                )
            }

            FloatingActionButton(
                onClick = {
                    if (phoneNumber.isNotEmpty()) {
                        if (ContextCompat.checkSelfPermission(
                                context,
                                Manifest.permission.CALL_PHONE
                            ) == PackageManager.PERMISSION_GRANTED
                        ) {
                            val intent = Intent(Intent.ACTION_CALL).apply {
                                data = Uri.parse("tel:$phoneNumber")
                            }
                            context.startActivity(intent)
                        } else {
                            showPermissionDialog = true
                        }
                    }
                },
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier.size(72.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_call),
                    contentDescription = "Call",
                    modifier = Modifier.size(32.dp)
                )
            }

            // Invisible view for symmetry
            Spacer(modifier = Modifier.size(56.dp))
        }
    }

    if (showPermissionDialog) {
        AlertDialog(
            onDismissRequest = { showPermissionDialog = false },
            title = { Text("Permission Required") },
            text = { Text("Phone permission is required to make calls.") },
            confirmButton = {
                TextButton(onClick = { showPermissionDialog = false }) {
                    Text("OK")
                }
            }
        )
    }
}

private data class DialpadItem(
    val number: String,
    val letters: String
)

@Composable
private fun EnhancedDialpadButton(
    number: String,
    letters: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(84.dp)
            .clip(CircleShape)
            .clickable(onClick = onClick)
            .background(MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.7f)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = number,
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                fontWeight = FontWeight.Medium
            )
            if (letters.isNotEmpty()) {
                Text(
                    text = letters,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.7f),
                    fontSize = 10.sp,
                    modifier = Modifier.padding(top = 2.dp)
                )
            }
        }
    }
} 