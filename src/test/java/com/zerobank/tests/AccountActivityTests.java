package com.zerobank.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.testBase.TestBase;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;

public class AccountActivityTests extends TestBase {
	
	AccountActivityPage accActPage = new AccountActivityPage();
	BrowserUtils bu = new BrowserUtils();
	
	@Test
	public void TC001_TC006() {
		new AccountActivityPage().goToAccountActivityPage();
		TC001();
		TC002();
	}
	
	public void TC001() {
		Select accountType = new Select(accActPage.accountTypeBox);
		assertEquals(Driver.getDriver().getTitle(), "Zero - Account Activity");
		assertTrue(accActPage.showTransactionsText.isDisplayed());
		assertEquals(accountType.getFirstSelectedOption().getText(), "Savings");
		assertTrue(accActPage.transactionDetails.isDisplayed());
		assertEquals(bu.trimBetweenChracters(bu.getElementsText(accActPage.tableHead).toString(), ",").replaceAll("[^0-9a-zA-Z, ]", ""), "Date, Description, Deposit, Withdrawal");
		assertEquals(bu.trimBetweenChracters(bu.getElementsText(accActPage.tableRow1).toString(), ",").replaceAll("[^0-9a-zA-Z., #-]", ""), "2012-09-06, ONLINE TRANSFER REF #UKKSDRQG6L, 984.3");
		assertEquals(bu.trimBetweenChracters(bu.getElementsText(accActPage.tableRow2).toString(), ",").replaceAll("[^0-9a-zA-Z., #-]", ""), "2012-09-05, OFFICE SUPPLY, 50");
		assertEquals(bu.trimBetweenChracters(bu.getElementsText(accActPage.tableRow3).toString(), ",").replaceAll("[^0-9a-zA-Z., #-]", ""), "2012-09-01, ONLINE TRANSFER REF #UKKSDRQG6L, 1000");
	}
	
	public void TC002() {
		Select accountType = new Select(accActPage.accountTypeBox);
		assertEquals(Driver.getDriver().getTitle(), "Zero - Account Activity");
		assertTrue(accActPage.showTransactionsText.isDisplayed());
		accountType.selectByVisibleText("Checking");
		assertEquals(accountType.getFirstSelectedOption().getText(), "Checking");
		assertTrue(accActPage.transactionDetails.isDisplayed());
		assertEquals(bu.trimBetweenChracters(bu.getElementsText(accActPage.tableHead).toString(), ",").replaceAll("[^0-9a-zA-Z, ]", ""), "Date, Description, Deposit, Withdrawal");
		assertEquals(bu.trimBetweenChracters(bu.getElementsText(accActPage.tableRow1).toString(), ",").replaceAll("[^0-9a-zA-Z., #-]", ""), "2012-09-06, CHECK DEPOSIT, 186.7");
		assertEquals(bu.trimBetweenChracters(bu.getElementsText(accActPage.tableRow2).toString(), ",").replaceAll("[^0-9a-zA-Z., #-]", ""), "2012-09-05, TELECOM, 99.6");
		assertEquals(bu.trimBetweenChracters(bu.getElementsText(accActPage.tableRow3).toString(), ",").replaceAll("[^0-9a-zA-Z., #-]", ""), "2012-09-01, CAR PAYMENT, 1548");
	}
	
	
}
