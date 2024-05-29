package com.orangeHRM.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
@FindBy(xpath="//input[@class='oxd-input oxd-input--focus']")
private WebElement usn;

@FindBy(xpath="//input[@type='password']")
private WebElement psw;

@FindBy(xpath="//button[@type='submit']")
private WebElement lgn;

public Loginpage(WebDriver driver)
{
PageFactory.initElements(driver,this);
}

public WebElement Enterusn()
{
	
	return usn;
}

public WebElement Enterpsw()
{
	
	return psw;
}

public WebElement clklgn()
{
	
	return lgn;
}


	
}


