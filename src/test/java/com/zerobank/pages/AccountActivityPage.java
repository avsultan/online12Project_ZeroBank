package com.zerobank.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerobank.utilities.Driver;

public class AccountActivityPage {
	
	public AccountActivityPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//h2[.='Show Transactions']")
	public WebElement showTransactionsText;
	
	@FindBy(xpath = "//select[@id='aa_accountId']")
	public WebElement accountTypeBox;
	
	@FindBy(xpath = "//table[@class='table table-condensed table-hover']")
	public WebElement transactionDetails;
	
	@FindBy(xpath = "//tr/th")
	public List<WebElement> tableHead;
	
	@FindBy(xpath = "//tr[1]/td")
	public List<WebElement> tableRow1;
	
	@FindBy(xpath = "//tr[2]/td")
	public List<WebElement> tableRow2;
	
	@FindBy(xpath = "//tr[3]/td")
	public List<WebElement> tableRow3;
	
	public void goToAccountActivityPage() {
		new LoginPage().login(System.getProperty("username"), "password");
		new AccountPage().accountActivityNavTab.click();
	}

}
