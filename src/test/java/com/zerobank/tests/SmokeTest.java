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
		extentLogger = report.createTest("Smoke Tests");
		LoginPage loginPage = new LoginPage();
		HomePage homePage = new HomePage();
		extentLogger.info("Verifying home page");
		assertEquals(Driver.getDriver().getTitle(), "Zero - Personal Banking - Loans - Credit Cards");
		extentLogger.pass("Home page verified");
		homePage.signinButton.click();
		extentLogger.info("Verifying login page");
		assertEquals(Driver.getDriver().getTitle(), "Zero - Log in");
		assertTrue(loginPage.LogInToZeroBankText.isDisplayed());
		extentLogger.pass("Login page verified");
		extentLogger.info("Entering user credentials");
		loginPage.loginInputBox.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
		loginPage.submitButton.click();
		assertEquals(Driver.getDriver().getTitle(), "Zero - Account Summary");
		assertEquals(new AccountPage().profileBox.getText().trim(), "username");
		extentLogger.pass("Logged in");
	}
	
}
