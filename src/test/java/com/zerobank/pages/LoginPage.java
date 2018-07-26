package com.zerobank.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.zerobank.utilities.*;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="signin_button")
	public WebElement signinButton;
	
	@FindBy(id="user_login")
	public WebElement login;
	
	@FindBy(id="user_password")
	public WebElement passwrd;
	
	@FindBy(name="submit")
	public WebElement submitButton;
	
	
	

}
