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
	
	@FindBy(xpath = "//div[@id='all_transactions_for_account']")
	public WebElement transactionDetails;
	
	@FindBy(xpath = "//tr/th")
	public List<WebElement> tableHead;
	
	@FindBy(xpath = "//tr[1]/td")
	public List<WebElement> tableRow1;
	
	@FindBy(xpath = "//tr[2]/td")
	public List<WebElement> tableRow2;
	
	@FindBy(xpath = "//tr[3]/td")
	public List<WebElement> tableRow3;
	
	
	@FindBy(linkText="Show Transactions")
	public WebElement showTransactionsTab;
	
	@FindBy(linkText="Find Transactions")
	public WebElement findTransactonsTab;
	
	@FindBy(id="aa_description")
	public WebElement descriptionField;
	
	@FindBy(id="aa_fromDate")
	public WebElement datesFromField;
	
	@FindBy(id="aa_toDate")
	public WebElement datesToFielsd;
	
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td")
	public List<WebElement> calendar;
	
	@FindBy(xpath="//span[@class='ui-icon ui-icon-circle-triangle-w']")
	public WebElement arrowOnCalendar;
	
	@FindBy(id="aa_fromAmount")
	public WebElement amountsFrom;
	
	@FindBy(id="aa_toAmount")
	public WebElement amountsTo;
	
	@FindBy(id="aa_type")
	public WebElement transactionType;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	public WebElement findButton;
	
	@FindBy(id="filtered_transactions_for_account")
	public WebElement resultTransDetails;
	
	public void goToAccountActivityPage() {
		new LoginPage().login(System.getProperty("username"), "password");
		new AccountPage().accountActivityNavTab.click();
	}
}
