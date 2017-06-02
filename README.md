# APP_Vsaas_3.0_Android 使用說明

#### 步驟：

1. 於c槽新增txt文字文件，命名為device (路徑：c:\device.txt)
2. 開啟device.txt

3. 輸入手機udid及Android版本

	3.1 假設第一支手機的udid為HT4C4YC01143及Android版本為4.4.4；第二支手機的udid為N2K7N15601001087及Android版本為5.0.1

	3.2 先輸入所有udid後，在依udid順序輸入Android版本，如下圖 (使用逗點區隔)
	
	![image](https://github.com/Gilleschen/APP_Vsaas2.0_Windows/blob/master/picture/device.png)
	
4. 啟動與測試手機數量相同的Appium (例如：要測試兩支手機，則啟動兩組Appium)
        
	4.1 進入General Settings (設定Server Address及Port)
        
	4.2 所有的Appium均設定Server Address為127.0.0.1
        
	4.3 第一組Appium Port設定為4723；第二組Appium Port設定為4725，如下圖 (若有第三組Appium，則Port設定為4727(即4725+2)，每次port都+2，依此類推)
	
	![image](https://github.com/Gilleschen/APP_Vsaas2.0_Windows/blob/master/picture/appium_general_settings.png)

5. 步驟4替代方案：使用終端機方式啟動Appium
	
	5.1 啟動與測試手機數量相同的終端機 (例如：要測試兩支手機，則啟動兩組終端機)
	
	5.2 設定所有終端機路徑，範例路徑如下圖：# cd C:\Program Files (x86)\Appium\node_modules\appium\bin 
	
	![image](https://github.com/Gilleschen/APP_Vsaas2.0_Windows/blob/master/picture/appium.js_path.png)
	
	5.3 第一組終端機輸入：# node appium.js -a 127.0.0.1 -p 4723 
	
	5.4 第二組終端機輸入：# node appium.js -a 127.0.0.1 -p 4725
	
	5.5 若有第三組終端機，則輸入：# node appium.js -a 127.0.0.1 -p 4727 (每次port都+2，依此類推)
