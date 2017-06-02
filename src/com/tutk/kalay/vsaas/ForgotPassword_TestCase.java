package com.tutk.kalay.vsaas;

import org.openqa.selenium.By;

public class ForgotPassword_TestCase {
	method method = new method();
	String[] element = new String[method.app.driver.length];
	LoadStringTable st=new LoadStringTable();

	public boolean EmailBlank() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		//String list[] = { "�п�J�z���H�c" };
		for (int i = 0; i < method.app.driver.length; i++) {
			
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("a");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.btn_Forgotpassword)).click();
			//method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.submit)).click();
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.ForgotPwd_Error_msg))
					.getAttribute("content-desc");
			
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("ForgotPassword", 0), methodname);
	}

	public boolean InvalidEmail() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		//String list[] = { "�q�l�l����~" };
		for (int i = 0; i < method.app.driver.length; i++) {
			
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("a");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.btn_Forgotpassword)).click();
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("qoojhih123@gmail.com");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.submit)).click();
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.ForgotPwd_Error_msg_inval))
					.getAttribute("content-desc");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("ForgotPassword", 1), methodname);

	}

	public boolean ForgotPwd() {
		String methodname = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName();
		//String list[] = { "�T�{" };
		for (int i = 0; i < method.app.driver.length; i++) {
			
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("a");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.btn_Forgotpassword)).click();
			method.app.driver[i].findElement(By.xpath(method.app.def.id_email)).sendKeys("jhih_chen@sina.com");
			method.hidekeyboard(i);
			method.app.driver[i].findElement(By.xpath(method.app.def.submit)).click();
			method.Wait_Element_ByXpath(method.app.def.ForgotPwd_Success_msg, i, methodname);
			element[i] = method.app.driver[i].findElement(By.xpath(method.app.def.ForgotPwd_Success_msg))
					.getAttribute("content-desc");
		}
		//method.QuitDriver();
		return method.result(element, st.LoadStingTable("ForgotPassword", 2), methodname);

	}
}
