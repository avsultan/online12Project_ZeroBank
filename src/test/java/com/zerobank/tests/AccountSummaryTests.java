package com.zerobank.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import org.openqa.selenium.WebElement;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.testBase.TestBase;

public class AccountSummaryTests extends TestBase {
	
	AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
	LoginPage loginPage = new LoginPage();
	
	@Test
	public void TC001_TC005() {
		loginPage.login(System.getProperty("username"), System.getProperty("password"));
		TC001();
		TC002();
		TC003();
		TC004();
		TC005();
		loginPage.logout();
	}
	
	public void TC001() {
		AssertJUnit.assertTrue(accountSummaryPage.accountSummaryNavTab.getAttribute("class").equals("active"));
		AssertJUnit.assertTrue(accountSummaryPage.cashAccountsText.isDisplayed());
		AssertJUnit.assertTrue(accountSummaryPage.creditAccountsText.isDisplayed());
		AssertJUnit.assertTrue(accountSummaryPage.investmentAccountsText.isDisplayed());
		AssertJUnit.assertTrue(accountSummaryPage.loanAccountsText.isDisplayed());
	}
	
	public void TC002() {
		AssertJUnit.assertTrue(accountSummaryPage.accountSummaryNavTab.getAttribute("class").equals("active"));
		AssertJUnit.assertTrue(accountSummaryPage.cashAccountsText.isDisplayed());
		for (WebElement each : accountSummaryPage.savingsLinksUnderCashAccount) {
			AssertJUnit.assertTrue(each.isDisplayed() && each.isEnabled());
		}
	}
	
	public void TC003() {
		AssertJUnit.assertTrue(accountSummaryPage.accountSummaryNavTab.getAttribute("class").equals("active"));
		AssertJUnit.assertTrue(accountSummaryPage.investmentAccountsText.isDisplayed());
		AssertJUnit.assertTrue(accountSummaryPage.brokerageLinkUnderInvestments.isDisplayed() && accountSummaryPage.brokerageLinkUnderInvestments.isEnabled());
	}
	
	public void TC004() {
		AssertJUnit.assertTrue(accountSummaryPage.accountSummaryNavTab.getAttribute("class").equals("active"));
		AssertJUnit.assertTrue(accountSummaryPage.creditAccountsText.isDisplayed());
		AssertJUnit.assertTrue(accountSummaryPage.checkingLinkUnderCredit.isDisplayed() && accountSummaryPage.checkingLinkUnderCredit.isEnabled());
		AssertJUnit.assertTrue(accountSummaryPage.creditCardLinkUnderCredit.isDisplayed() && accountSummaryPage.creditCardLinkUnderCredit.isEnabled());
	}
	
	public void TC005() {
		AssertJUnit.assertTrue(accountSummaryPage.accountSummaryNavTab.getAttribute("class").equals("active"));
		AssertJUnit.assertTrue(accountSummaryPage.loanAccountsText.isDisplayed());
		AssertJUnit.assertTrue(accountSummaryPage.loanLinkUnderLoan.isDisplayed() && accountSummaryPage.loanLinkUnderLoan.isEnabled());
	}

}
