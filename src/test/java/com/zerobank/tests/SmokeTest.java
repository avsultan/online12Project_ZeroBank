package com.zerobank.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.zerobank.pages.AccountPage;
import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.testBase.TestBase;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;

public class SmokeTest extends TestBase {
	
	
	@Test
	public void signinSmokeTest() {
		LoginPage loginPage = new LoginPage();
		HomePage homePage = new HomePage();
		assertEquals(Driver.getDriver().getTitle(), "Zero - Personal Banking - Loans - Credit Cards");
		homePage.signinButton.click();
		assertEquals(Driver.getDriver().getTitle(), "Zero - Log in");
		assertTrue(loginPage.LogInToZeroBankText.isDisplayed());
		loginPage.loginInputBox.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
		loginPage.submitButton.click();
		assertEquals(Driver.getDriver().getTitle(), "Zero - Account Summary");
		assertEquals(new AccountPage().profileBox.getText().trim(), "username");
	}
	
	
	
	
	

}
