package learningBatchExecution;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RemoveProduct extends BaseClass {

	@Test
	public void addProduct()
	{
		//System.out.println("Product Added");
		driver.findElement(By.xpath("//div[contains(text(),'Backpack')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		Reporter.log("Product Added");
		}
	@Test
	public void removeProduct()
	{
		
		//System.out.println("Product Added");
		driver.findElement(By.xpath("//div[contains(text(),'Backpack')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
		Reporter.log("Product removed");
		}
	}
