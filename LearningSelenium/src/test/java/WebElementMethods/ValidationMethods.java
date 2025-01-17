package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//configure the browser
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//navigate to the Application via URL
		driver.get("https://www.zomato.com/");
		
		//Identify the element
		WebElement search = driver.findElement(By.xpath("//input[contains(@placeholder,'Search ')]"));
		search.click();
		Thread.sleep(3000);
		//Validate the element
		Boolean result1=search.isDisplayed();
		Boolean result2 = search.isEnabled();
		if(result1&&result2)
		{
			System.out.println("Element verified: pass");
		}
		else
		{
			System.out.println("Element verified: fail");
		}
		
		//Perform Action
		search.sendKeys("Chicken Biryani");
		Thread.sleep(3000);
		search.clear();
		Thread.sleep(3000);
		
		search.sendKeys("Mutton Biryani");
		Thread.sleep(3000);
		search.clear();
		Thread.sleep(3000);
		
		search.sendKeys("Ice Cream");
		Thread.sleep(3000);
		search.clear();
		Thread.sleep(3000);
		
		//close the browser
		driver.close();
		
		//Execution log
		System.out.println("Execution completed");
	}

}
