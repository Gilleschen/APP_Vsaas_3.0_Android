package com.tutk.kalay.vsaas;

import static org.junit.Assert.*;

import org.junit.Test;

public class Login_Junit {
	Login_TestCase testcase = new Login_TestCase();

	@Test
	public void WrongEmail() {
		assertTrue(testcase.WrongEmail());
	}

	@Test
	public void WrongPassword() {
		assertTrue(testcase.WrongPassword());
	}

	@Test
	public void EmailBlank() {
		assertTrue(testcase.EmailBlank());
	}
	@Test
	public void PasswordBlank() {
		assertTrue(testcase.PasswordBlank());
	}
	
	
	public void Login() {
		assertTrue(testcase.Login());
	}

}
