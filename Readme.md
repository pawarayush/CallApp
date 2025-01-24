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

[Add your app screenshots here]

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

Your Name - [@yourtwitter](https://twitter.com/yourtwitter)

Project Link: [https://github.com/yourusername/calling-app](https://github.com/yourusername/calling-app)
