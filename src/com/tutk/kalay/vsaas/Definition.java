package com.tutk.kalay.vsaas;

import java.util.ArrayList;

public class Definition {
	LoadDeviceInformation infor = new LoadDeviceInformation();
	String appPackage = "com.tutk.kalayvsaas";// appPackage
	String appActivity = "com.tutk.kalayvsaas.SplashScreenActivity";// appActivity

	ArrayList<String> deviceName = infor.deviceName; // deviceName
	ArrayList<String> platformVersion = infor.platformVersion; // platformVersion

	int port = 8889;// Appium port number
	int sec = 60;// ���ݮɶ�

	String resource_id = appPackage + ":id";
	String id_WebView = "//*[@class='android.webkit.WebView']";
	String id_email = "//*[@id='id_email']";// "//android.widget.EditText[contains(@resource-id='id_email')]";
	String id_password = "//*[@id='id_password']";
	String id_username = "//*[@resource-id='id_username']";
	String id_password1 = "//*[@id='id_password1']";
	String id_password2 = "//*[@id='id_password2']";
	String submit = "//*[@id='submit']";
	String CheckTermofUse = "//*[@resource-id='agree-cb']";
	
	String Login_Error_msg_email = "//*[@content-desc='�п�J�z���H�c']";
	String Login_Error_msg_password = "//*[@content-desc='�п�J�z���K�X']";
	String Login_WrongPssword_msg = "//*[@content-desc='�q�l�l��αK�X���~']";
	String btn_Forgotpassword = "//*[@contentDescription='�ѰO�K�X?']";
	String ForgotPwd_Error_msg = "//*[@content-desc='�п�J�z���H�c']";
	String ForgotPwd_Error_msg_inval = "//*[@content-desc='�q�l�l����~']";
	String ForgotPwd_Success_msg = "//*[@content-desc='�T�{']";
	String SignUp = "//*[@contentDescription='���U']";
	String TermsOfUse = "//*[@content-desc=concat('�ФĿ�', \"'\", '�ڦP�N�A�ȱ���', \"'\", '�H�i����U')]";
	String CreateAccount_nickname_error_msg = "//*[@content-desc='�п�J�z���W�r.']";
	String CreateAccount_pwd1_error_msg = "//*[@content-desc='�п�J�z���K�X']";// NewPwd
	String CreateAccount_pwd2_error_msg = "//*[@content-desc='�K�X�P�T�{�K�X���@�P']";// ConfirmPwd
	String CreateAccount_email_error_msg = "//*[@content-desc='�п�J�z���H�c']";
	String CreateAccount_pwd1andpwd2notmatch_msg = "//*[@content-desc='�K�X�P�T�{�K�X���@�P']";
	String CreateAccount_ExstedAccount_msg = "//*[@content-desc='�ӱb���w�s�b']";
	String CreateAccount_invalied_msg = "//*[@content-desc='�q�l�l����~']";
	String CreateAccount_WrongPwdRule_msg = "//*[@content-desc='�Шϥ�8��20�Ӧr���ӫإ߱K�X, �ܤֻݥ]�t1�Ӥj�g�r��, 1�Ӥp�g�r���P1�ӼƦr']";
	String CreateAccount_ResendEmail = "//*[@content-desc='���e�{�ҫH']";
	
	String btn_adding = resource_id + "/btn_adding";
	String btn_QRCode = resource_id + "/btn_QRCode";

}
