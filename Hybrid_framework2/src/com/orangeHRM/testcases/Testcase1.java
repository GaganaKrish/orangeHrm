package com.orangeHRM.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangeHRM.basetest.Basic;
import com.orangeHRM.basetest.ReadExcel;


public class Testcase1 extends Basic
{
@Test
public void AddEmp() throws EncryptedDocumentException, IOException
{
	
	hp.Clkpim().click();
	hp.Clkaddemp().click();
	hp.Enterfn().sendKeys(ReadExcel.ReadData("Sheet1", 0, 0));
	hp.Entermn().sendKeys(ReadExcel.ReadData("Sheet1", 0, 1));
	hp.Enterln().sendKeys(ReadExcel.ReadData("Sheet1", 0, 2));
	hp.Clksave().click();

}
}
