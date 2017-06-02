package com.tutk.kalay.vsaas;

import java.util.ArrayList;

public class Definition {
	LoadDeviceInformation infor = new LoadDeviceInformation();
	String appPackage = "com.tutk.kalayvsaas";// appPackage
	String appActivity = "com.tutk.kalayvsaas.SplashScreenActivity";// appActivity

	ArrayList<String> deviceName = infor.deviceName; // deviceName
	ArrayList<String> platformVersion = infor.platformVersion; // platformVersion

	int port = 8889;// Appium port number
	int sec = 60;// 等待時間

	String resource_id = appPackage + ":id";
	String id_WebView = "//*[@class='android.webkit.WebView']";
	String id_email = "//*[@id='id_email']";// "//android.widget.EditText[contains(@resource-id='id_email')]";
	String id_password = "//*[@id='id_password']";
	String id_username = "//*[@resource-id='id_username']";
	String id_password1 = "//*[@id='id_password1']";
	String id_password2 = "//*[@id='id_password2']";
	String submit = "//*[@id='submit']";
	String CheckTermofUse = "//*[@resource-id='agree-cb']";
	
	String Login_Error_msg_email = "//*[@content-desc='請輸入您的信箱']";
	String Login_Error_msg_password = "//*[@content-desc='請輸入您的密碼']";
	String Login_WrongPssword_msg = "//*[@content-desc='電子郵件或密碼錯誤']";
	String btn_Forgotpassword = "//*[@contentDescription='忘記密碼?']";
	String ForgotPwd_Error_msg = "//*[@content-desc='請輸入您的信箱']";
	String ForgotPwd_Error_msg_inval = "//*[@content-desc='電子郵件錯誤']";
	String ForgotPwd_Success_msg = "//*[@content-desc='確認']";
	String SignUp = "//*[@contentDescription='註冊']";
	String TermsOfUse = "//*[@content-desc=concat('請勾選', \"'\", '我同意服務條款', \"'\", '以進行註冊')]";
	String CreateAccount_nickname_error_msg = "//*[@content-desc='請輸入您的名字.']";
	String CreateAccount_pwd1_error_msg = "//*[@content-desc='請輸入您的密碼']";// NewPwd
	String CreateAccount_pwd2_error_msg = "//*[@content-desc='密碼與確認密碼不一致']";// ConfirmPwd
	String CreateAccount_email_error_msg = "//*[@content-desc='請輸入您的信箱']";
	String CreateAccount_pwd1andpwd2notmatch_msg = "//*[@content-desc='密碼與確認密碼不一致']";
	String CreateAccount_ExstedAccount_msg = "//*[@content-desc='該帳號已存在']";
	String CreateAccount_invalied_msg = "//*[@content-desc='電子郵件錯誤']";
	String CreateAccount_WrongPwdRule_msg = "//*[@content-desc='請使用8到20個字元來建立密碼, 至少需包含1個大寫字母, 1個小寫字母與1個數字']";
	String CreateAccount_ResendEmail = "//*[@content-desc='重送認證信']";
	
	String btn_adding = resource_id + "/btn_adding";
	String btn_QRCode = resource_id + "/btn_QRCode";

}
