package com.orangeHRM.basetest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Capturescreenshot implements Application_constants
{
public static void Defect(WebDriver driver,String Filename) 
{
	Date d=new Date();
	String d1 = d.toString().replace(":","-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm = new File(defectpath+Filename+d1+".png");
	try {
		FileHandler.copy(temp, perm);
	} catch (IOException e) {
		System.out.println("screenshot is not captured");
	}
}
}
