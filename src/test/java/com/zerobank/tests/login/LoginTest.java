package com.zerobank.tests.login;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;
import com.zerobank.pages.*;
import com.zerobank.tests.TestBase;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;

public class LoginTest extends TestBase {
	
	LoginPage lp;
	
	@Test(priority=1)
	public void mainPage() {	
		String actual = Driver.getDriver().getTitle();
		String expected = "Zero - Personal Banking - Loans - Credit Cards";
		assertEquals(actual, expected, "Error is occurred, actual is not equal to expected");	
	}
	
	@Test(priority=2)
	public void singinTest() {
		lp = new LoginPage();
		lp.signinButton.click();
		String actual = Driver.getDriver().getTitle();
		String expected = "Zero - Log in";
		assertEquals(actual, expected, "Error is occurred, actual is not equal to expected");
	}
	
	@Test(priority=3)
	public void loginTest() {
		lp.signinButton.click();
		lp.login.sendKeys(ConfigurationReader.getProperty("username"));
		lp.passwrd.sendKeys(ConfigurationReader.getProperty("password"));
		lp.submitButton.click();
		String actual = Driver.getDriver().getTitle();
		String expected = "Zero - Account Summary";
		assertEquals(actual, expected, "Error is occurred, actual is not equal to expected");
	}

}
