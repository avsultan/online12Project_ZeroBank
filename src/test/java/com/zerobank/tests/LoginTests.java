package com.zerobank.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.testBase.TestBase;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;

public class LoginTests extends TestBase {
	
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	
	@Test (priority = 1)
	public void TC001() {
		extentLogger = report.createTest("Positive Login Tests");
		extentLogger.info("Entering user credentials");
		new LoginPage().login(System.getProperty("username"), System.getProperty("password"));
		new LoginPage().logout();
		extentLogger.info("Verifying logout");
		assertEquals(Driver.getDriver().getTitle(), "Zero - Personal Banking - Loans - Credit Cards");
		extentLogger.pass("Logout verified");
	}
	
	@Test (priority = 2)
	public void TC002() {
		extentLogger = report.createTest("Negative Login Test - invalid password");
		assertEquals(Driver.getDriver().getTitle(), "Zero - Personal Banking - Loans - Credit Cards");
		homePage.signinButton.click();
		assertEquals(Driver.getDriver().getTitle(), "Zero - Log in");
		assertTrue(loginPage.LogInToZeroBankText.isDisplayed());
		loginPage.loginInputBox.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.passwordInputBox.sendKeys(new Faker().internet().password(9, 12));
		loginPage.submitButton.click();
		assertEquals(Driver.getDriver().getTitle(), "Zero - Log in");
		assertTrue(loginPage.troublesEnetringTheSiteText.isDisplayed());
		assertTrue(loginPage.loginPasswordAreWrongText.isDisplayed());
	}
	
	@Test (priority = 3)
	public void TC003() {
		extentLogger = report.createTest("Negative Login Test - invalid username");
		assertEquals(Driver.getDriver().getTitle(), "Zero - Personal Banking - Loans - Credit Cards");
		homePage.signinButton.click();
		assertEquals(Driver.getDriver().getTitle(), "Zero - Log in");
		assertTrue(loginPage.LogInToZeroBankText.isDisplayed());
		String username = new Faker().name().username();
		if(username.equals("username")) {
			while(!username.equals("username"))
				username = new Faker().name().username();
		} else
			loginPage.loginInputBox.sendKeys(username);
		loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
		loginPage.submitButton.click();
		assertEquals(Driver.getDriver().getTitle(), "Zero - Log in");
		assertTrue(loginPage.troublesEnetringTheSiteText.isDisplayed());
		assertTrue(loginPage.loginPasswordAreWrongText.isDisplayed());
	}
	
	@Test (priority = 4)
	public void TC004() {
		extentLogger = report.createTest("Negative Login Test - invalid username and password");
		assertEquals(Driver.getDriver().getTitle(), "Zero - Personal Banking - Loans - Credit Cards");
		homePage.signinButton.click();
		assertEquals(Driver.getDriver().getTitle(), "Zero - Log in");
		assertTrue(loginPage.LogInToZeroBankText.isDisplayed());
		String username = new Faker().name().username();
		if(username.equals("username")) {
			while(!username.equals("username"))
				username = new Faker().name().username();
		} else
			loginPage.loginInputBox.sendKeys(username);
		loginPage.passwordInputBox.sendKeys(new Faker().internet().password(9, 12));
		loginPage.submitButton.click();
		assertEquals(Driver.getDriver().getTitle(), "Zero - Log in");
		assertTrue(loginPage.troublesEnetringTheSiteText.isDisplayed());
		assertTrue(loginPage.loginPasswordAreWrongText.isDisplayed());
	}

}
