package com.orangeHRM.basetest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangeHRM.pageobjects.Homepage;
import com.orangeHRM.pageobjects.Loginpage;
import com.orangeHRM.pageobjects.Logoutpg;

public class Basic implements Application_constants
{
	public Homepage hp;
	public Properties p;
	public Loginpage l;
	public WebDriver driver;
	public Logoutpg lo;
	@BeforeClass
	public void login() throws IOException
	{
		System.setProperty(c_key,c_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		l=new Loginpage(driver);
		p=new Properties();
		hp=new Homepage(driver);
		//WebDriverWait w=new WebDriverWait(driver,10);
	FileInputStream fis=new FileInputStream("./property/data.properties");
	p.load(fis);
		
		
	}
@BeforeMethod
public void open()
{
driver.get(p.getProperty("url"));
l.Enterusn().sendKeys(p.getProperty("usn1"));
l.Enterpsw().sendKeys(p.getProperty("psw1"));
l.clklgn().click();
}

@AfterMethod
public void signout(ITestResult result) throws IOException
{
	if(result.FAILURE==result.getStatus())
	{
		Capturescreenshot.Defect(driver,result.getName());
	}
	Logoutpg lo=new Logoutpg(driver);
	lo.Clkimg().click();
	lo.clklogout().click();
}

/*@AfterClass
public void closeapp()
{
	driver.close();
}*/
}
