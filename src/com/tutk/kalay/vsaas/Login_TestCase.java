package com.tutk.kalay.vsaas;

import org.openqa.selenium.By;

public class Login_TestCase {
	method method = new method();
	String[] element = new String[method.app.driver.length];
	LoadStringTable st = new LoadStringTable();

	public boolean WrongEmail() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		// String list[] = { "電子郵件或密碼錯誤" };
		for (int i = 0; i < method.app.driver.length; i++) {

			method.app.driver[i].findElement(By.xpath(method.app.def.id_password)).sendKeys("888888ii");
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("jhih_chen@sina.co");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.submit)).click();
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.Login_WrongPssword_msg))
					.getAttribute("content-desc");
		}
		// method.QuitDriver();
		return method.result(element, st.LoadStingTable("Login_ExpectResult", 0), methodname);
	}

	public boolean WrongPassword() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		// String list[] = { "電子郵件或密碼錯誤" };
		for (int i = 0; i < method.app.driver.length; i++) {
			method.app.driver[i].findElement(By.xpath(method.app.def.id_password)).sendKeys("1234abcd");
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("jhih_chen@sina.com");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.submit)).click();
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.Login_WrongPssword_msg))
					.getAttribute("content-desc");
		}
		// method.QuitDriver();
		return method.result(element, st.LoadStingTable("Login_ExpectResult", 1), methodname);
	}

	public boolean EmailBlank() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		// String list[] = { "請輸入您的信箱" };

		for (int i = 0; i < method.app.driver.length; i++) {
			method.app.driver[i].findElement(By.xpath(method.app.def.id_password)).sendKeys("888888ii");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.submit)).click();
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.Login_Error_msg_email))
					.getAttribute("content-desc");
		}
		// method.QuitDriver();
		return method.result(element, st.LoadStingTable("Login_ExpectResult", 2), methodname);
	}

	public boolean PasswordBlank() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		// String list[] = { "請輸入您的密碼" };

		for (int i = 0; i < method.app.driver.length; i++) {
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("jhih_chen@sina.com");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.submit)).click();
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.Login_Error_msg_password))
					.getAttribute("content-desc");
		}
		// method.QuitDriver();
		return method.result(element, st.LoadStingTable("Login_ExpectResult", 3), methodname);
	}

	public boolean Login() {
		// String list[] = { "QRCode" };
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < method.app.driver.length; i++) {

			method.app.driver[i].findElement(By.xpath(method.app.def.id_password)).sendKeys("888888ii");
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("jhih_chen@sina.com");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.submit)).click();
			method.Wait_Element_ById(method.app.def.btn_adding, i, methodname);
			method.sleep(3);
			method.app.driver[i].findElement(By.id(method.app.def.btn_adding)).click();
			element[i] = method.app.driver[i].findElement(By.id(method.app.def.btn_QRCode)).getText();

		}
		// method.QuitDriver();
		return method.result(element, st.LoadStingTable("Login_ExpectResult", 4), methodname);
	}

}
