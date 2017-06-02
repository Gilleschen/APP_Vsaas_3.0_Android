package com.tutk.kalay.vsaas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ForgotPassword_Junit {
	ForgotPassword_TestCase testcase = new ForgotPassword_TestCase();

	@Test
	public void InvalidEmail() {
		assertTrue(testcase.InvalidEmail());
	}

	@Test
	public void EmailBlank() {
		assertTrue(testcase.EmailBlank());
	}
	@Test
	public void ForgotPwd() {

		assertTrue(testcase.ForgotPwd());
	}

}
