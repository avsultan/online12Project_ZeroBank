package com.zerobank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerobank.utilities.Driver;

public class OnlineStatemenstPage {

	public OnlineStatemenstPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	
	
	
	@FindBy(xpath="//h2[.='Statements & Documents']")
	public WebElement StatementsDocuText;
	
	@FindBy(xpath="//select[@id='os_accountId']")
	public WebElement accountDropDown;
	
	
	
	@FindBy(xpath="//ul[@class='nav nav-pills']//li/a[.='2011']")
	public WebElement resentStatement2011;
	
	@FindBy(xpath="//ul[@class='nav nav-pills']//li/a[.='2010']")
	public WebElement resentStatement2010;
	
	@FindBy(xpath="//ul[@class='nav nav-pills']//li/a[.='2009']")
	public WebElement resentStatement2009;
	
	
	@FindBy(xpath="//ul[@class='nav nav-pills']/li[@class='active']/a")
	public WebElement defaultSelectedYear;
	
	public WebElement statementTableForSelectedYear(int selectedYear) {
		String xpath = "//div[@id='os_"+selectedYear+"']";
		return Driver.getDriver().findElement(By.xpath(xpath));
	}
	

	
	
	
	
}
