package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReaddatafromExcelFile {

	@Test(enabled = true)
	public void readSingleData() throws EncryptedDocumentException, IOException
	{
		//steps to fetch the data from External Resources---Excel file
		//1. convert the physical file into java understandable
		FileInputStream	fis	= new FileInputStream("./Data/EmployeeDetails.xlsx");
		
		//2. Create an workbook from workbook factory
		Workbook wb	= WorkbookFactory.create(fis);
			
		//3. using workbook, get the sheet control
		Sheet sheet  =	wb.getSheet("BasicData");
		
		//4. Using sheet, get the row control
		Row row = sheet.getRow(1);
		
		//5.Using row, get the column control
		Cell column =	row.getCell(0);
		
		//6.using column , get the cell data value and store it
			String data = column.getStringCellValue();
		
		//7. print the data
			System.out.println(data);
	}
	
	}

