package com.zerobank.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerobank.utilities.Driver;

public class AccountSummaryPage {
	
	public AccountSummaryPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//h2[.='Cash Accounts']")
	public WebElement cashAccountsText;
	
	@FindBy(xpath = "//h2[.='Investment Accounts']")
	public WebElement investmentAccountsText;
	
	@FindBy(xpath = "//h2[.='Credit Accounts']")
	public WebElement creditAccountsText;
	
	@FindBy(xpath = "//h2[.='Loan Accounts']")
	public WebElement loanAccountsText;
	
	@FindBy(xpath = "//li[@id='account_summary_tab']")
	public WebElement accountSummaryNavTab;
	
	@FindBy(xpath = "//*[.='Savings']")
	public List<WebElement> savingsLinksUnderCashAccount;
	
	@FindBy(xpath = "//*[.='Brokerage']")
	public WebElement brokerageLinkUnderInvestments;
	
	@FindBy(xpath = "//*[.='Checking']")
	public WebElement checkingLinkUnderCredit;
	
	@FindBy(xpath = "//a[.='Credit Card']")
	public WebElement creditCardLinkUnderCredit;
	
	@FindBy(xpath = "//*[.='Loan']")
	public WebElement loanLinkUnderLoan;

}
