package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void demoTest1()
	{
		Reporter.log("DEMO Test1 Executed !!!!!!",true);
	}
	@Test
	public void demoTest2()
	{
		Reporter.log("DEMO Test2 Executed !!!!!!",true);
	}
}
