# APP_Vsaas_3.0_Android 登入介面自動化測試使用說明

#### 測試前設定：

1. 於c槽新增txt文字文件，命名為device (路徑：c:\device.txt)
2. 開啟device.txt

3. 輸入手機udid及Android版本

	3.1 假設第一支手機的udid為HT4C4YC01143及Android版本為4.4.4；第二支手機的udid為N2K7N15601001087及Android版本為5.0.1

	3.2 先輸入所有udid後，在依udid順序輸入Android版本，如下圖 (使用逗點區隔)
	
	![image](https://github.com/Gilleschen/APP_Vsaas2.0_Windows/blob/master/picture/device.png)
	
4. 將StringTable.xls放置c槽 (路徑：c:\StringTable.xls)

=================================================================================

#### Ant Target:
Login_Junit, CreateAccount_Junit, ForgotPassword_Junit
