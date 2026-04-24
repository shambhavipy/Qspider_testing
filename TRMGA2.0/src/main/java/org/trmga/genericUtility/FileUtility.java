package org.trmga.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	/**
	 * This method is used to read data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String readDataFromPropertiesFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		
		return value;
	}
	
/**
 * This method is used to read data from Excel file
 * @param sheetName
 * @param RowNum
 * @param CellNum
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	
	public String reaDataFromExcelFile(String sheetName, int RowNum, int CellNum) throws EncryptedDocumentException, IOException {
		
		// This method is used to read data from excel sheets
		FileInputStream fis =  new FileInputStream("./src/test/resources/LoginPage.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value2 = wb.getSheet("Sheet1").getRow(RowNum).getCell(CellNum).getStringCellValue();
		wb.close();
		return value2;
	}
}