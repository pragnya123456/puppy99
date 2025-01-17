package learningBatchExecution;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddProduct1 extends BaseClass {
	@Test
	public void addProduct()
	{
		String exptitle = "Swag Labs";
		String acttitle = driver.getTitle();
		Assert.assertNotEquals(exptitle, acttitle);
		System.out.println(acttitle);
		
		//System.out.println("Product Added");
		driver.findElement(By.xpath("//div[contains(text(),'Bike')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		Reporter.log("Product Added",true);
		}
	@Test
	public void removeProduct()
	{
		
		//System.out.println("Product Added");
		driver.findElement(By.xpath("//div[contains(text(),'Bike')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
		Reporter.log("Product Removed",true);
		}
	
}
