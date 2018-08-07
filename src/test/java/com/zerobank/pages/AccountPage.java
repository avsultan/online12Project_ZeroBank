package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerobank.utilities.Driver;

public class AccountPage {
	
	public AccountPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\"settingsBox\"]/ul/li[3]/a")
	public WebElement profileBox;
	
	@FindBy(xpath = "//a[@id='logout_link']")
	public WebElement logout;
	
	@FindBy(xpath = "//li[@id='account_summary_tab']")
	public WebElement accountSummaryNavTab;
	
	@FindBy(xpath = "//li[@id='account_activity_tab']")
	public WebElement accountActivityNavTab;
	
	@FindBy(xpath = "//li[@id='transfer_funds_tab']")
	public WebElement transferFundsNavTab;
	
	@FindBy(xpath = "//li[@id='pay_bills_tab']")
	public WebElement payBillsNavTab;
	
	@FindBy(xpath = "//li[@id='money_map_tab']")
	public WebElement myMoneyMapNavTab;
	
	@FindBy(xpath = "//li[@id='online_statements_tab']")
	public WebElement onlineStatementsNavTab;

}
