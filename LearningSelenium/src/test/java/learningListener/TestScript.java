package learningListener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(learningListener.ListenerImplementation.class)
public class TestScript extends BaseTest {

	@Test
	public void m1()
	{
		Assert.fail();
	}
}
