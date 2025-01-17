package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformAction2 {

	public static void main(String[] args) throws InterruptedException {
		
		//configure the browser
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//navigate to the Application via URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Identify the element
		WebElement checkbox = driver.findElement(By.xpath("//input[contains(@id,'1')]"));
		Thread.sleep(2000);
		//Perform Action
		checkbox.click();
		Thread.sleep(3000);
		checkbox.click();
		Thread.sleep(2000);
		
		//Perform Action
		WebElement checkbox1 = driver.findElement(By.xpath("//input[contains(@id,'2')]"));
		Thread.sleep(2000);
		checkbox1.click();
		Thread.sleep(3000);
		checkbox1.click();
		Thread.sleep(2000);
		
		//Perform Action
		WebElement checkbox2 = driver.findElement(By.xpath("//input[contains(@id,'3')]"));
		Thread.sleep(2000);
		checkbox2.click();
		Thread.sleep(3000);
		checkbox2.click();
		Thread.sleep(2000);
		
		//close the Browser
		driver.quit();
		
		//Execution log
		System.out.println("Execution completed");
	}

}
