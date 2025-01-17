package testngAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 2)
	public void m1()
	{
		Reporter.log("m1 method",true);
	}
	@ Test(invocationCount = 4)
	public void m2() {
		Reporter.log("m2 method",true);
	}
}
