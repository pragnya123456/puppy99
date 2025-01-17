package productTest;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckOutProduct extends BaseClass {

	@Test
	public void checkOut() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(@class,'sh')]")).click();
		driver.findElement(By.xpath("//button[contains(@name,'ch')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'f')]")).sendKeys("pragnya");
		driver.findElement(By.xpath("//input[contains(@id,'la')]")).sendKeys("Reddy");
		driver.findElement(By.xpath("//input[contains(@id,'p')]")).sendKeys("500023");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'con')]")).click();	
		driver.findElement(By.xpath("//button[contains(@id,'f')]")).click();
		
		
		Reporter.log("checked out successfully",true);
	}
}
