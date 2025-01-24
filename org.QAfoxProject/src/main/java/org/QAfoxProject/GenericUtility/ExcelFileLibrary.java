package org.QAfoxProject.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class provides reusable method to perform CRUD in Excel File
 * @author pragnya
 */

public class ExcelFileLibrary {

	
	FileInputStream fis;
	FileOutputStream fos;
	Workbook wb;
	DataFormatter df;
	
	/**
	 * This method used to fetch the single data from excel file**/
	
	public String readSingleData(String sheet, int row, int column)
	{
		//Read the string data from excel
		return wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		
	}
	/**
	 * This method used to fetch the specific column data from excel file**/
	
	public ArrayList readSpecificColumnData(String sheet, int column)
	{
		
	int lastnum = wb.getSheet(sheet).getLastRowNum();
	
	ArrayList<Object> value = new ArrayList<Object>();
	
	for (int i = 0; i <= lastnum; i++) {
		
	String data = wb.getSheet(sheet).getRow(i).getCell(1).getStringCellValue();
	value.add(data);
	
	}
	return value;
	}
	
	/**
	 * This method used to fetch the specific row data from excel file**/
	
	public ArrayList readSpecificRowData(String sheet, int row)
	{
	
		int lastcolumn = wb.getSheet(sheet).getRow(1).getLastCellNum();
	
		ArrayList<Object> value = new ArrayList<Object>();
		
		for (int i = 0; i<lastcolumn; i++) {	
				
		String	data = wb.getSheet(sheet).getRow(row).getCell(i).getStringCellValue();
		
		value.add(data);
		}
			return value;
	}
	
	/**
	 * This method used to display the multiple data from excel file**/
	
	public void displayMultiplerecords(String sheet, int row)
	{
		
		int lastnum = wb.getSheet(sheet).getLastRowNum();
		
		for (int i = 0; i<=lastnum; i++) {
			int columnnum = wb.getSheet(sheet).getRow(i).getLastCellNum();
			for (int j = 0; j < columnnum ; j++) {
				
		String	data = wb.getSheet(sheet).getRow(i).getCell(j).getStringCellValue();
		
		System.out.println(data + "\t");
		
			}
			System.out.println();
		}
		
	}
	/**
	 * @param sheetName
	 * @param expectedTestName
	 * @return
	 * This method used to fetch the multiple data from excel file**/
	
	public Map<String, String> readMultipleRecords(String sheet, String expectedTestname)
	{
	Map<String, String> map = new HashMap<>();
	Sheet sh = wb.getSheet(sheet);
	
	for(int i=0; i<=sh.getLastRowNum();i++)
	{
		if(df.formatCellValue(sh.getRow(i).getCell(1)).equals(expectedTestname))
		{
			for(int j =1; j<=sh.getLastRowNum(); j++)
			{
				String key = df.formatCellValue(sh.getRow(j).getCell(2));
				String value = df.formatCellValue(sh.getRow(j).getCell(3));
				map.put(key, value);
				if(key.equals("####"))
				{
					break;
				}
				break;
			}
		}
	}
	return map;
	}
	
	/* This method initializes excel file**/
	
	
	public void initExcel()
	{
		//convert the physical file into java understandable
		try {
			fis = new FileInputStream(PathConstant.EXCEL_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//create a workbook from workbook factory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//initialize data formatter
		df = new DataFormatter();
		
		
	}
	/* This method used to close the workbook**/
		
 public void closeExcel()
 
 
	{
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
 /* This method used to write the single data in new row
  * @param sheet
  * @param row
  * @param column
  * @param data**/
 
 public void writeSingleData_NewRow(String sheet, int row, int column, String data) 
 {
	 //create new row and create data
	 wb.getSheet(sheet).createRow(row).createCell(column).setCellValue(data);	 
 
 
 //Write the data
	 try {
		wb.write(fos);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
 }
 	
 
 
 /* This method used to update the single data in existing row
  * @param sheet
  * @param row
  * @param column
  * @param data**/
 
 public void updateSingleData_ExistingRow(String sheet, int row, int column, String data) 
 {
	 //create new row and create data
	 wb.getSheet(sheet).getRow(row).createCell(column).setCellValue(data);	 
	
	//Write the data
	 try {
		wb.write(fos);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}

