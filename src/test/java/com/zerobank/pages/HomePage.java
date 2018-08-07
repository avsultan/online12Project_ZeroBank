package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerobank.utilities.Driver;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="signin_button")
	public WebElement signinButton;

}
