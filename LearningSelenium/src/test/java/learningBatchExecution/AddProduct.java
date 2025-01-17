package learningBatchExecution;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddProduct extends BaseClass {

	@Test
	public void addProduct()
	{
		//driver.get("https://www.saucedemo.com/inventory.html");
		
		String exptitle = "https://www.saucedemo.com/inventory.html";
		String acttitle = driver.getCurrentUrl();
		Assert.assertNotEquals(exptitle, acttitle);
		System.out.println(acttitle);
		
		driver.findElement(By.xpath("//div[contains(text(),'Backpack')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Product Added",true);
		driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
		Reporter.log("Product Removed",true);
		}
	}

