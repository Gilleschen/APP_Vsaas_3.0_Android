package com.tutk.kalay.vsaas;

import org.openqa.selenium.By;


public class CreateAccount_TestCase {
	method method = new method();
	String[] element = new String[method.app.driver.length];
	LoadStringTable st = new LoadStringTable();

	public boolean CreateAccount() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		//String list[] = { "重送認證信" };
		for (int i = 0; i < method.app.driver.length; i++) {
			//method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("a");
			method.hidekeyboard(i);
			method.CreateAccount_initialize(i, method.CreateAnNewEmail(), "abc", "888888iiI", "888888iiI", true);
			method.hidekeyboard(i);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_ResendEmail))
					.getAttribute("content-desc");
		}

		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount", 0), methodname);
	}

	public boolean InvaliedEmail() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		//String list[] = { "電子郵件錯誤" };
		for (int i = 0; i < method.app.driver.length; i++) {
			//method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("a");
			method.hidekeyboard(i);
			method.CreateAccount_initialize(i, "jhih_chensina.com", "abc", "888888iiI", "888888iiI", true);
			method.hidekeyboard(i);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_invalied_msg))
					.getAttribute("content-desc");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount", 1), methodname);
	}

	public boolean ExistedAccount() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		//String list[] = { "該帳號已存在" };
		for (int i = 0; i < method.app.driver.length; i++) {
			//method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("a");
			method.hidekeyboard(i);
			method.CreateAccount_initialize(i, "jhih_chen@sina.com", "abc", "888888iiI", "888888iiI", true);
			method.hidekeyboard(i);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_ExstedAccount_msg))
					.getAttribute("content-desc");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount", 2), methodname);
	}

	public boolean EmailBlank() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		//String list[] = { "請輸入您的信箱" };
		for (int i = 0; i < method.app.driver.length; i++) {
			method.app.driver[i].resetApp();// 目的清除暫存資料
			//method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("a");
			//method.hidekeyboard(i);
			method.CreateAccount_initialize(i, "", "abc", "888888iiI", "888888iiI", true);
			method.hidekeyboard(i);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_email_error_msg))
					.getAttribute("content-desc");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount", 3), methodname);
	}

	public boolean ConfirmPwdBlank() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		//String list[] = { "密碼與確認密碼不一致" };
		for (int i = 0; i < method.app.driver.length; i++) {
			//method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("a");
			//method.hidekeyboard(i);
			method.CreateAccount_initialize(i, method.CreateAnNewEmail(), "abc", "888888iiI", "", true);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_pwd2_error_msg))
					.getAttribute("content-desc");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount", 4), methodname);
	}

	public boolean NewPwdBlank() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		//String list[] = { "請輸入您的密碼" };
		for (int i = 0; i < method.app.driver.length; i++) {
			//method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("a");
			//method.hidekeyboard(i);
			method.CreateAccount_initialize(i, method.CreateAnNewEmail(), "abc", "", "888888iiI", true);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_pwd1_error_msg))
					.getAttribute("content-desc");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount", 5), methodname);
	}

	public boolean NewPwdAndConfirmPwdNotMatch() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		//String list[] = { "密碼與確認密碼不一致" };
		for (int i = 0; i < method.app.driver.length; i++) {
			//method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("a");
			//method.hidekeyboard(i);
			method.CreateAccount_initialize(i, method.CreateAnNewEmail(), "abc", "abcdefgI123", "888888iiI", true);
			element[i] = method.app.driver[i]
					.findElement(By.xpath(method.app.def.CreateAccount_pwd1andpwd2notmatch_msg))
					.getAttribute("content-desc");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount", 6), methodname);
	}

	public boolean NicknameBlank() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		//String list[] = { "請輸入您的名字." };
		for (int i = 0; i < method.app.driver.length; i++) {
			//method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("a");
			//method.hidekeyboard(i);
			method.CreateAccount_initialize(i, method.CreateAnNewEmail(), "", "888888iiI", "888888iiI", true);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_nickname_error_msg))
					.getAttribute("content-desc");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount", 7), methodname);
	}

	public boolean DonotCheckTermsofUser() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		//String list[] = { "請勾選'我同意服務條款'以進行註冊" };
		for (int i = 0; i < method.app.driver.length; i++) {
			//method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("a");
			//method.hidekeyboard(i);
			method.CreateAccount_initialize(i, method.CreateAnNewEmail(), "abc", "888888iiI", "888888iiI", false);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.TermsOfUse))
					.getAttribute("content-desc");

		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount", 8), methodname);
	}

	public boolean WrongPwdRule() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		//String list[] = { "請使用8到20個字元來建立密碼, 至少需包含1個大寫字母, 1個小寫字母與1個數字" };
		for (int i = 0; i < method.app.driver.length; i++) {
			//method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("a");
			//method.hidekeyboard(i);
			method.CreateAccount_initialize(i, method.CreateAnNewEmail(), "abc", "8888ii", "8888ii", true);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.CreateAccount_WrongPwdRule_msg))
					.getAttribute("content-desc");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("CreateAccount", 9), methodname);
	}

}
