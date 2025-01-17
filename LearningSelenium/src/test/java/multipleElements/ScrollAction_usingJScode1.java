package multipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollAction_usingJScode1 {

	public static void main(String[] args) throws InterruptedException {
		//configure the Browser
		WebDriverManager.chromedriver().setup();
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the Application via URL
		driver.get("https://www.selenium.dev");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//perform typecasting
		JavascriptExecutor jsobj = (JavascriptExecutor)driver;
		
		//identify the element
		WebElement element = driver.findElement(By.xpath("//h2[contains(@id,'dev-partners')]"));
		
		//steps to perform scroll action
		Thread.sleep(5000);
		//write the javascript code
		jsobj.executeScript("arguments[0].scrollIntoView(false)",element);
		
		Thread.sleep(5000);
		
//		WebElement element1 = driver.findElement(By.xpath("//h2[contains(@id,'sele')]"));
//		Thread.sleep(3000);
//		jsobj.executeScript("arguments[0].scrollIntoView(false)",element1);
		//close the browser
		driver.close();
		//Execution log
		System.out.println("Execution Completed");

	}

}
