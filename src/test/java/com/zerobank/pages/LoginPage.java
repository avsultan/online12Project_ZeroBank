package com.zerobank.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerobank.pages.AccountPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="user_login")
	public WebElement loginInputBox;
	
	@FindBy(id="user_password")
	public WebElement passwordInputBox;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	public WebElement submitButton;
	
	@FindBy(xpath = "//h3[.='Log in to ZeroBank']")
	public WebElement LogInToZeroBankText;
	
	@FindBy(xpath = "//h3[.='Troubles entering the site?']")
	public WebElement troublesEnetringTheSiteText;
	
	@FindBy(xpath = "//div[@class='alert alert-error']")
	public WebElement loginPasswordAreWrongText;
	
	public void login(String username, String password) {
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
	
	public void logout() {
		new AccountPage().profileBox.click();
		new AccountPage().logout.click();
		assertEquals(Driver.getDriver().getTitle(), "Zero - Personal Banking - Loans - Credit Cards");
	}
}
