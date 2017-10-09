/**
 * 
 */
package com.easyFrame.dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author cyrus
 *
 */
public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider(){
		
		File src=new File("./ApplicationTestData/ApplicationTestData.xlsx");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		} 
		catch (Exception e) {
			System.out.println("Exception is: "+e.getMessage());
		}
	}
	
	public String getData(int sheetIndex, int row, int col){
		
		String data=wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
		
		return data;
	}
	
	public String getData(String sheetName, int row, int col){
		
		String data=wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
		
		return data;
	}

}
