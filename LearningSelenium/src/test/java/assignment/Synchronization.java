package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//button[contains(@id,'log')]"));
		element.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
