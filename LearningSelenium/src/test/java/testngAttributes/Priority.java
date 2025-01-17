package testngAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {

	@Test(priority = -1)
	public void mango()
	{
		Reporter.log("m1 method",true);
	}
	@ Test()
	public void orange() 
	{
		Reporter.log("m2 method",true);
	}
		
		@ Test(priority = 4)
		public void banana() 
	{
			Reporter.log("m3 method",true);
	}
		@ Test(priority = -4)
		public void apple() 
		{
			Reporter.log("m4 method",true);
		}
}