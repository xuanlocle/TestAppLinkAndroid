# TestAppLinkAndroid

Use adb or android device test with URLs below after installed:
http://www.example.com/link1
https://www.example.com/link1
http://www.example.com/link2
https://www.example.com/link2?data=12345&test=123&test2=456
app://www.example.com/link1

The way to test by adb: 
1. Run cmd.
2. $ cd C:\Users\<USER>\AppData\Local\Android\Sdk\platform-tools> 
3. $ adb shell am start -a android.intent.action.VIEW -d <URL> com.example.testapplink
