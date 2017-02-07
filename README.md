# DeepLinkDemo操作说明（详细见demo）
###在AndroidManifest.xml中加入如下代码：

	<intent-filter>
    	<action android:name="android.intent.action.VIEW"/>
        <category android:name="android.intent.category.DEFAULT"/>
        <category android:name="android.intent.category.BROWSABLE"/>
        <data android:scheme="avidly" android:host="sober" android:pathPrefix="/deeplink"/>
    </intent-filter>

###将deeplink.html（DeepLinkDemo/deeplink.html）文件导入手机,在该文件所在目录打开命令窗口，执行以下命令：
	adb push deeplink.html /sdcard/
###将demo安装到手机，在手机上找到deeplink.html文件，打开，点击click，进入activity
	

