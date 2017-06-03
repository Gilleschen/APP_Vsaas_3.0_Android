# APP_Vsaas_3.0_Android 登入介面自動化測試使用說明

#### 測試前設定:

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

=================================================================================

#### 測試案例情境:

##### A. 登入 (Login_Junit):

	1. WrongEmail
	2. WrongPassword
	3. EmailBlank
	4. PasswordBlank

##### B. 創立帳號 (CreateAccount_Junit)
	
	1. CreateAccount
	2. InvaliedEmail
	3. ExistedAccount
	4. EmailBlank
	5. ConfirmPwdBlank
	6. NewPwdBlank
	7. NewPwdAndConfirmPwdNotMatch
	8. NicknameBlank
	9. DonotCheckTermsofUser
	10. WrongPwdRule
	
##### C. 忘記密碼 (ForgotPassword_Junit)
	
	1. EmailBlank
	2. InvalidEmail
	3. ForgotPwd
	
=================================================================================

#### 建立測試期望結果

	1. 開啟StringTable.xls
	2. *_ExpectResult為期望結果;*_CaseName為案例名稱
	3. 根據*_CaseName內個案例順序，於*_ExpectResult填入期望結果 (e.g. Login_CaseName內第一列案例為WrongEmail，則在Login_ExpectResult的第一列第一欄輸入期望結果"電子郵件或密碼錯誤")
	

