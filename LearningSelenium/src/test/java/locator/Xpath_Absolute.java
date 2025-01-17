package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Absolute {

	public static void main(String[] args) throws InterruptedException {
		//Execution log
		System.out.println("Execution started");
		
		//Configure the Browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/pragn/Downloads/webpage.html");
		WebElement element = driver.findElement(By.xpath("html/body/form/fieldset/table/tbody/tr[3]/td[2]/input"));
		//element.sendKeys("Excellent");
		element.click();
		Thread.sleep(5000);
		driver.close();
	}

}
