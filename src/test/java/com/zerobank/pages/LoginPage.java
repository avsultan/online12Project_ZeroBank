package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath = "//*[@id=\"settingsBox\"]/ul/li[3]/a")
	public WebElement profileBox;
	
	public void signin(String username, String password) {
		new HomePage().signinButton.click();
		loginInputBox.sendKeys(username);
		passwordInputBox.sendKeys(password);
		submitButton.click();
	}
}
