package com.orangeHRM.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pimbtn;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addemp;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement fn;
	
	@FindBy(xpath="//input[@placeholder='Middle Name']")
	private WebElement mn;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement ln;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement savebtn;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement Clkpim()
	{
		return pimbtn;
	}
	
	public WebElement Clkaddemp()
	{
		return addemp;
	}
	
	public WebElement Enterfn()
	{
		return fn;
	}
	
	public WebElement Entermn()
	{
		return mn;
	}
	public WebElement Enterln()
	{
		return ln;
	}
	
	public WebElement Clksave()
	{
		return savebtn;
	}

}
