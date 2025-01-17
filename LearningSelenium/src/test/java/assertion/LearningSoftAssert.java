package assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert {

	@Test
	public void task() {
		
		SoftAssert softobj	= new SoftAssert();
		
		String exptitle = "JAVA";
		String acttitle = "java";
		
	//softobj.assertEquals(exptitle, acttitle);
	//softobj.assertNotEquals(exptitle, acttitle);
	//softobj.assertTrue(false);
	softobj.assertAll();
	//softobj.assertEquals(exptitle, acttitle);
	//System.out.println("pass");
	softobj.assertTrue(false);
	
	}
}
