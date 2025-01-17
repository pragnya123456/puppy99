package productTest;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifySixProduct extends BaseClass {
	
	@Test
	
	public void product() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[contains(text(),'Test')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'A')]")).click();
		Reporter.log("product added successfully",true);
		Thread.sleep(3000);
	}

}
