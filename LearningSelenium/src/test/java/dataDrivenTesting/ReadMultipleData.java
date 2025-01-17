package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadMultipleData {

	
	@Test(enabled = false)
	public void specificRowData() throws EncryptedDocumentException, IOException
	{
		//steps to fetch the multiple data from External Resources---Excel file
		//1. convert the physical file into java understandable
		FileInputStream fis = new FileInputStream("./Data/EmployeeDetails.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		int lastnum = wb.getSheet("BasicData").getLastRowNum();
		
		for (int i = 0; i <= lastnum; i++) {
			
		String	data = wb.getSheet("BasicData").getRow(i).getCell(1).getStringCellValue();
		System.out.println(data);
		
		}
		
	}
	@Test
	public void multipleDetails() throws EncryptedDocumentException, IOException
	{
		//steps to fetch the multiple data from External Resources---Excel file
				//1. convert the physical file into java understandable
				FileInputStream fis = new FileInputStream("./Data/EmployeeDetails.xlsx");
				
				Workbook wb = WorkbookFactory.create(fis);
				
				int lastnum = wb.getSheet("BasicData").getLastRowNum();
				System.out.println(lastnum);
				
				for (int i = 0; i<=lastnum; i++) {
					int columnnum = wb.getSheet("BasicData").getRow(1).getLastCellNum();
					for (int j = 0; j < columnnum ; j++) {
						
				String	data = wb.getSheet("BasicData").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+"\t");
					}
				}
	}
}
