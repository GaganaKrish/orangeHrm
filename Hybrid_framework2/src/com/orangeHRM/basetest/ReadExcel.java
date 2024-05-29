package com.orangeHRM.basetest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements Application_constants
{
public static String ReadData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream(Excelpath);
	Workbook book=WorkbookFactory.create(fis);
	Cell c = book.getSheet(sheet).getRow(row).getCell(cell);
	String value = c.getStringCellValue().toString();
	return value;
}
}
