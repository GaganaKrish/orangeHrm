package com.orangeHRM.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adminpg 
{
@FindBy(xpath="//span[text()='Admin']")
private WebElement adminbtn;

@FindBy(xpath="//span[text()='Job ']")
private WebElement jobbtn;

@FindBy(xpath="//a[text()='Job Titles']")
private WebElement jobtit;

@FindBy(xpath="(//div[@class='oxd-table-card-cell-checkbox'])[2]")
private WebElement ckbox;

@FindBy(xpath="(//button[@type='button'])[3]")
private WebElement addbtn;






}
