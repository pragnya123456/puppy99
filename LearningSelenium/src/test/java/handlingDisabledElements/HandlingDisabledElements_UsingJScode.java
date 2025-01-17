package handlingDisabledElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDisabledElements_UsingJScode {

	public static void main(String[] args) throws InterruptedException {
	
		//configure the Browser
				WebDriverManager.chromedriver().setup();
				//Launch the Browser
				WebDriver driver = new ChromeDriver();
				
				//Navigate to the Application via URL
				driver.get("https://demoapp.skillrary.com/");
				driver.manage().window().maximize();
				
				//Identify the Element-Search textfield
				WebElement element = driver.findElement(By.xpath("//input[(@class='form-control')]"));
				
				//verify the element
				boolean result = element.isEnabled();
				//provide the log
				if(result)
				{
					System.out.println("Element verified:it is enabled");
				}
				else
				{
					System.out.println("Element verified:it is not enabled");
				}
				//element.sendKeys("Learning Selenium");
				
				//Steps to perform action on the disabled element--->using JScode
				
				//perform typecasting
				JavascriptExecutor jsobj = (JavascriptExecutor)driver;
				
				jsobj.executeScript("arguments[0].value='Learning Selenium'",element);
				Thread.sleep(5000);
				//close the browser
				driver.quit();
				//Execution log
				System.out.println("Execution Completed");
				

	}

}
