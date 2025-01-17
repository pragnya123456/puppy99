package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadRowData {

	@Test
	public void readRowData() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./Data/EmployeeDetails.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int lastcolumn = wb.getSheet("BasicData").getRow(1).getLastCellNum();
		System.out.println(lastcolumn);
		for(int i=0; i<lastcolumn; i++)
		{
			String data = wb.getSheet("BasicData").getRow(1).getCell(i).getStringCellValue();
			System.out.print(data + "\t");
		}
}
}