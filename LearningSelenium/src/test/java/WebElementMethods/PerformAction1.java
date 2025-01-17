  package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformAction1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement radio = driver.findElement(By.xpath("//input[contains(@value,'radio1')]"));
		Thread.sleep(2000);
		radio.click();
		Thread.sleep(3000);
		
		WebElement radio1 = driver.findElement(By.xpath("//input[contains(@value,'radio2')]"));
		Thread.sleep(2000);
		radio1.click();
		Thread.sleep(3000);
		
		WebElement radio2 = driver.findElement(By.xpath("//input[contains(@value,'radio3')]"));
		Thread.sleep(2000);
		radio2.click();
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Execution completed");
	}

}
