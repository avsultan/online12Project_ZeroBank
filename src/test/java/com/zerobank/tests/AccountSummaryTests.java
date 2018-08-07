package com.zerobank.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.testBase.TestBase;

public class AccountSummaryTests extends TestBase {

	AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
	LoginPage loginPage = new LoginPage();

	@Test
	public void TC001_TC005() {
		extentLogger = report.createTest("Account summary tests");
		loginPage.login(System.getProperty("username"), System.getProperty("password"));
		TC001();
		TC002();
		TC003();
		TC004();
		TC005();
		loginPage.logout();
	}

	public void TC001() {
		assertTrue(accountSummaryPage.accountSummaryNavTab.getAttribute("class").equals("active"));
		assertTrue(accountSummaryPage.cashAccountsText.isDisplayed());
		assertTrue(accountSummaryPage.creditAccountsText.isDisplayed());
		assertTrue(accountSummaryPage.investmentAccountsText.isDisplayed());
		assertTrue(accountSummaryPage.loanAccountsText.isDisplayed());
	}

	public void TC002() {
		assertTrue(accountSummaryPage.accountSummaryNavTab.getAttribute("class").equals("active"));
		assertTrue(accountSummaryPage.cashAccountsText.isDisplayed());
		for (WebElement each : accountSummaryPage.savingsLinksUnderCashAccount) {
			AssertJUnit.assertTrue(each.isDisplayed() && each.isEnabled());
		}
	}

	public void TC003() {
		assertTrue(accountSummaryPage.accountSummaryNavTab.getAttribute("class").equals("active"));
		assertTrue(accountSummaryPage.investmentAccountsText.isDisplayed());
		assertTrue(accountSummaryPage.brokerageLinkUnderInvestments.isDisplayed()
				&& accountSummaryPage.brokerageLinkUnderInvestments.isEnabled());
	}

	public void TC004() {
		assertTrue(accountSummaryPage.accountSummaryNavTab.getAttribute("class").equals("active"));
		assertTrue(accountSummaryPage.creditAccountsText.isDisplayed());
		assertTrue(accountSummaryPage.checkingLinkUnderCredit.isDisplayed()
				&& accountSummaryPage.checkingLinkUnderCredit.isEnabled());
		assertTrue(accountSummaryPage.creditCardLinkUnderCredit.isDisplayed()
				&& accountSummaryPage.creditCardLinkUnderCredit.isEnabled());
	}

	public void TC005() {
		assertTrue(accountSummaryPage.accountSummaryNavTab.getAttribute("class").equals("active"));
		assertTrue(accountSummaryPage.loanAccountsText.isDisplayed());
		assertTrue(accountSummaryPage.loanLinkUnderLoan.isDisplayed() && accountSummaryPage.loanLinkUnderLoan.isEnabled());
	}

}
