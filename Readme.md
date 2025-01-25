# Calling App

A modern Android dialer application built with Jetpack Compose that provides calling functionality, contact management, and call history tracking.

## Features

- 📱 Modern Material Design 3 UI
- ☎️ Dialer with numeric keypad
- 👥 Contacts management
  - View contacts
  - Add new contacts
  - Call contacts directly
- 📝 Call Logs
  - View recent calls
  - Call history with timestamps
  - Differentiate between incoming, outgoing, and missed calls
- 📞 Direct calling functionality
- 🎨 Dynamic theming support
- 🔒 Runtime permission handling

## Screenshots

![Dialer Screen](https://github.com/user-attachments/assets/61869b65-c5e6-455d-9fd0-367033d002c6)![Contact Screen](https://github.com/user-attachments/assets/6f833cef-c327-4935-adea-0074a19bd32f)
![with contact](https://github.com/user-attachments/assets/fcc7ebb9-4fd6-403d-acd8-ebba2684c390)
![call Log Screen](https://github.com/user-attachments/assets/6934e6cd-39a4-4c53-a056-ac473e29cc45)
![Screenshot_20250125_133345](https://github.com/user-attachments/assets/f4b35044-4f3d-4219-b910-02d4114931b5)






## Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM
- **Dependencies**:
  - AndroidX Core KTX
  - Jetpack Compose UI
  - Material Design 3
  - Navigation Compose
  - Runtime Permissions

## Requirements

- Android SDK 21+
- Kotlin 1.9.0+
- Android Studio Hedgehog or newer

## Permissions Required

The app requires the following permissions:
```xml
<uses-permission android:name="android.permission.CALL_PHONE" />
<uses-permission android:name="android.permission.READ_PHONE_STATE" />
<uses-permission android:name="android.permission.READ_CALL_LOG" />
<uses-permission android:name="android.permission.WRITE_CALL_LOG" />
<uses-permission android:name="android.permission.READ_CONTACTS" />
<uses-permission android:name="android.permission.WRITE_CONTACTS" />
<uses-permission android:name="android.permission.MANAGE_OWN_CALLS" />
<uses-permission android:name="android.permission.READ_PHONE_NUMBERS" />
```

## Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/calling-app.git
```

2. Open the project in Android Studio

3. Build and run the app on an emulator or physical device

## Usage

1. **Dialer**: 
   - Enter phone numbers using the numeric keypad
   - Press the call button to initiate calls
   - Use backspace to correct entries

2. **Contacts**:
   - View all contacts in a scrollable list
   - Tap the + button to add new contacts
   - Tap on a contact to call them
   - Each contact shows name and phone number

3. **Call Logs**:
   - View recent calls with contact names/numbers
   - See call duration and timestamps
   - Different indicators for incoming/outgoing/missed calls
   - Tap on any entry to call back

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

- Material Design Icons
- Android Developer Documentation
- [Add any other acknowledgments]

## Contact

Your Name - Ayush Pawar

Project Link: [https://github.com/yourusername/calling-app](https://github.com/yourusername/calling-app)
