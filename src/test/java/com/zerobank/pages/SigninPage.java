package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerobank.utilities.Driver;

public class SigninPage {

	
	public SigninPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="signin_button")
	public WebElement signinButton;
	
	
	
	
	@FindBy(id="user_login")
	public WebElement loginInputBox;
	
	
	
	@FindBy(id="user_password")
	public WebElement passwordInputBox;
	
	
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	public WebElement submitButton;
	
	
	public void signin(String username, String password) {
		signinButton.click();
		loginInputBox.sendKeys(username);
		passwordInputBox.sendKeys(password);
		submitButton.click();
	}
}
