package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement button = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		button.click();
		WebElement element1 = driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
		element1.click();
		Thread.sleep(1000);
		element1.sendKeys("pragnya");
		WebElement element2 = driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
		element2.click();
		Thread.sleep(1000);
		element2.sendKeys("mucharla");
		Thread.sleep(2000);
		WebElement element3 = driver.findElement(By.xpath("//select[contains(@name,'birthday_day')]"));
		element3.click();
		Thread.sleep(2000);
		element3.sendKeys("10");
		WebElement element4 = driver.findElement(By.xpath("//select[contains(@name,'birthday_year')]"));
		element4.click();
		Thread.sleep(3000);
		element4.sendKeys("1998");
		WebElement radiobutton= driver.findElement(By.xpath("//label[contains(text(),'Female')]/child::input[contains(@value,'1')]"));
		radiobutton.click();
		WebElement element5 = driver.findElement(By.xpath("//input[contains(@name,'reg_email')]"));
		element5.click();
		Thread.sleep(1000);
		element5.sendKeys("Abc@gmail.com");
		WebElement element6 = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
		element6.click();
		Thread.sleep(1000);
		element6.sendKeys("Abc@1234");
		WebElement element7 = driver.findElement(By.xpath("//button[contains(@name,'websubmit')]"));
		element7.click();
		Thread.sleep(2000);
		System.out.println("signup successful");
		driver.quit();

	}

}
