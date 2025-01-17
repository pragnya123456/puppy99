package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void task() {
	String expcondition1 = "SELENIUM";
	String actcondition1 = "JAVA";
	
//	if(expcondition1.equals(actcondition1)) {
//		System.out.println("test pass");
//}
//	else {
//		System.out.println("test fail");
//	}
	//Assert.assertEquals(expcondition1, actcondition1);
	//Assert.assertNotEquals(actcondition1, expcondition1);
	//Assert.fail();
	Assert.assertTrue(true);
	//Assert.assertFalse(true);
}
}
