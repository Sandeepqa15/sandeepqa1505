package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is generic method for reading the data from property file
 * @author sandeep
 *
 */
public class FileLib {
/***
 * This is generic method for reading the data from property file
 * @param key
 * @return String
 * @throws IOException
 */
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p= new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
/**
 * This is generic method for reading the data from Excel file
 * @param Sheetname
 * @param row
 * @param cell
 * @return String
 * @throws EncryptedDocumentException
 * @throws IOException
 */

public String getExcelData(String Sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	String data=wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
/**
 * This is generic method for writing data to excel
 * @param sheetname
 * @param row
 * @param cell
 * @param data
 * @throws IOException
 */
public void setExcelData(String sheetname,int row,int cell,String data) throws IOException {
FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
Workbook wb=WorkbookFactory.create(fis);
wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);
FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
wb.write(fos);
wb.close();
}
}













