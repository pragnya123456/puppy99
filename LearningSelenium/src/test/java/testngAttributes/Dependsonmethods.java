package testngAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethods {

	@Test
	public void m1()
	{
		Reporter.log("m1 method",true);
	}
	@ Test(dependsOnMethods = "m1")
	public void m2() {
		Reporter.log("m2 method",true);
	}
}
