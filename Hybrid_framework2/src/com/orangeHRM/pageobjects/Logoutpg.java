package com.orangeHRM.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpg 
{
@FindBy(xpath="//img[@alt='profile picture' and @class='oxd-userdropdown-img']")
private WebElement logo;

@FindBy(xpath="//a[text()='Logout']")
private WebElement logout;

public Logoutpg(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement Clkimg()
{
	return logo;
}

public WebElement clklogout()
{
	return logout;
}




}
