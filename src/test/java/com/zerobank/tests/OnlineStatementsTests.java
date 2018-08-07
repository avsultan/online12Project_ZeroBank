package com.zerobank.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.OnlineStatemenstPage;
import com.zerobank.testBase.TestBase;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;

public class OnlineStatementsTests extends TestBase{

	AccountActivityPage accActivityPage;
	AccountPage accountPage;
	OnlineStatemenstPage onlineStatPage ;
	

	@Test
	public void TC001() {
		extentLogger = report.createTest("Online statements tests");
		accountPage = new AccountPage();
		accActivityPage = new AccountActivityPage();
		onlineStatPage = new  OnlineStatemenstPage();
		//step1
		accActivityPage.goToAccountActivityPage();
		assertTrue(accountPage.onlineStatementsNavTab.isDisplayed());
		//step2
		accountPage.onlineStatementsNavTab.click();
		assertEquals(Driver.getDriver().getTitle(), "Zero - Online Statements");
		assertTrue(onlineStatPage.StatementsDocuText.isDisplayed());
		
		Select dropDown = new Select(onlineStatPage.accountDropDown);
		assertEquals(dropDown.getFirstSelectedOption().getText(), "Savings");
		
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2012");
		assertTrue(onlineStatPage.statementTableForSelectedYear(2012).isDisplayed());
		
		//step4
		onlineStatPage.resentStatement2011.click();;
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2011");
		assertTrue(onlineStatPage.statementTableForSelectedYear(2011).isDisplayed());
		
		//step5
		onlineStatPage.resentStatement2010.click();;
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2010");
		assertTrue(onlineStatPage.statementTableForSelectedYear(2010).isDisplayed());
		
		//step6
		onlineStatPage.resentStatement2009.click();;
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2009");
		assertTrue(onlineStatPage.statementTableForSelectedYear(2009).isDisplayed());
		new LoginPage().logout();
	}
	
	@Test
	public void TC002() {
		extentLogger = report.createTest("Online statements test");
		accountPage = new AccountPage();
		accActivityPage = new AccountActivityPage();
		//onlineStatPage = new  OnlineStatemenstPage();
		//step1
		accActivityPage.goToAccountActivityPage();
		assertTrue(accountPage.onlineStatementsNavTab.isDisplayed());
		//step2
		accountPage.onlineStatementsNavTab.click();
		assertEquals(Driver.getDriver().getTitle(), "Zero - Online Statements");
		assertTrue(onlineStatPage.StatementsDocuText.isDisplayed());
		
		Select dropDown = new Select(onlineStatPage.accountDropDown);
		assertEquals(dropDown.getFirstSelectedOption().getText(), "Savings");
		
		//step3
		dropDown.selectByVisibleText("Checking");
		BrowserUtils.waitFor(2);
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2012");
		assertTrue(new OnlineStatemenstPage().statementTableForSelectedYear(2012).isDisplayed());
		
		//step4
		onlineStatPage.resentStatement2011.click();
		BrowserUtils.waitFor(2);
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2011");
		assertTrue(new OnlineStatemenstPage().statementTableForSelectedYear(2011).isDisplayed());
		
		//step5
		onlineStatPage.resentStatement2010.click();
		BrowserUtils.waitFor(2);
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2010");
		assertTrue(new OnlineStatemenstPage().statementTableForSelectedYear(2010).isDisplayed());
		
		//step6
		onlineStatPage.resentStatement2009.click();
		BrowserUtils.waitFor(2);
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2009");
		assertTrue(new OnlineStatemenstPage().statementTableForSelectedYear(2009).isDisplayed());
		new LoginPage().logout();
	}
	
	@Test
	public void TC003() {
		extentLogger = report.createTest("Online statements test");
		accountPage = new AccountPage();
		accActivityPage = new AccountActivityPage();
		//onlineStatPage = new  OnlineStatemenstPage();
		//step1
		accActivityPage.goToAccountActivityPage();
		assertTrue(accountPage.onlineStatementsNavTab.isDisplayed());
		//step2
		accountPage.onlineStatementsNavTab.click();
		assertEquals(Driver.getDriver().getTitle(), "Zero - Online Statements");
		assertTrue(onlineStatPage.StatementsDocuText.isDisplayed());
		
		Select dropDown = new Select(onlineStatPage.accountDropDown);
		assertEquals(dropDown.getFirstSelectedOption().getText(), "Savings");
		
		//step3
		dropDown.selectByVisibleText("Loan");
		BrowserUtils.waitFor(2);
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2012");
		assertTrue(new OnlineStatemenstPage().statementTableForSelectedYear(2012).isDisplayed());
		
		//step4
		new OnlineStatemenstPage().resentStatement2011.click();
		BrowserUtils.waitFor(2);
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2011");
		assertTrue(new OnlineStatemenstPage().statementTableForSelectedYear(2011).isDisplayed());
		
		//step5
		new OnlineStatemenstPage().resentStatement2010.click();
		BrowserUtils.waitFor(2);
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2010");
		assertTrue(new OnlineStatemenstPage().statementTableForSelectedYear(2010).isDisplayed());
		
		//step6
		new OnlineStatemenstPage().resentStatement2009.click();
		BrowserUtils.waitFor(2);
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2009");
		assertTrue(new OnlineStatemenstPage().statementTableForSelectedYear(2009).isDisplayed());
		new LoginPage().logout();
	}
	
	@Test
	public void TC004() {
		extentLogger = report.createTest("Online statements test");
		accountPage = new AccountPage();
		accActivityPage = new AccountActivityPage();
		//onlineStatPage = new  OnlineStatemenstPage();
		//step1
		accActivityPage.goToAccountActivityPage();
		assertTrue(accountPage.onlineStatementsNavTab.isDisplayed());
		//step2
		accountPage.onlineStatementsNavTab.click();
		assertEquals(Driver.getDriver().getTitle(), "Zero - Online Statements");
		assertTrue(onlineStatPage.StatementsDocuText.isDisplayed());
		
		Select dropDown = new Select(onlineStatPage.accountDropDown);
		assertEquals(dropDown.getFirstSelectedOption().getText(), "Savings");
		
		//step3
		dropDown.selectByVisibleText("Credit Card");
		BrowserUtils.waitFor(2);
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2012");
		assertTrue(new OnlineStatemenstPage().statementTableForSelectedYear(2012).isDisplayed());
		
		//step4
		onlineStatPage.resentStatement2011.click();
		BrowserUtils.waitFor(2);
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2011");
		assertTrue(new OnlineStatemenstPage().statementTableForSelectedYear(2011).isDisplayed());
		
		//step5
		onlineStatPage.resentStatement2010.click();
		BrowserUtils.waitFor(2);
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2010");
		assertTrue(new OnlineStatemenstPage().statementTableForSelectedYear(2010).isDisplayed());
		
		//step6
		onlineStatPage.resentStatement2009.click();
		BrowserUtils.waitFor(2);
		assertEquals(onlineStatPage.defaultSelectedYear.getText(), "2009");
		assertTrue(new OnlineStatemenstPage().statementTableForSelectedYear(2009).isDisplayed());
		new LoginPage().logout();
	}
	
}
