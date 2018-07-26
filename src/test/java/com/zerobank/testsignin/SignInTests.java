package com.zerobank.testsignin;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.zerobank.pages.SigninPage;
import com.zerobank.tests.TestBase;
import static com.zerobank.utilities.ConfigurationReader.*;
public class SignInTests extends TestBase {
	
	
	@Test
	public void signinSmokeTest() {
		SigninPage signinObj = new SigninPage();
		signinObj.signin(getProperty("username"), getProperty("password"));
		String expected = "Zero - Account Summary";
		
		assertEquals(driver.getTitle(), expected);
	}
	
	
	
	
	

}
