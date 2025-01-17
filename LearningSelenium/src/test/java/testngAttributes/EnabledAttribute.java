package testngAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledAttribute {

	@Test(enabled = true)
	public void m1()
	{
		Reporter.log("m1 method",true);
	}
	@ Test(enabled = false)
	public void m2() {
		Reporter.log("m2 method",true);
	}
}
