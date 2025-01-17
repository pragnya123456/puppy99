package testngAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataProvider {

	@org.testng.annotations.DataProvider()
	public Object[][] details()
	{
		Object[][] data = new Object[3][3];
		
		data[0][0] = "m1";
		data[0][1] = 101;
		data[0][2] = "Test Engineer";
		
		data[1][0] = "m2";
		data[1][1] = 102;
		data[1][2] = "developer";
		
		data[2][0] = "m3";
		data[2][1] = 103;
		data[2][2] = "Devops";
		return data;			
	}
	@Test(dataProvider = "details")
	public void SeleniumBatchList(String name, int id, String dept)
	{
		Reporter.log("name is : "+name, true);
		Reporter.log("id is : "+id, true);
		Reporter.log("dept is : "+dept, true);
		
	}
}
