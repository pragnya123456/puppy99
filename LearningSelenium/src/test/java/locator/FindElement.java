package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		//Configure the Browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the application via URL
		driver.get("file:///C:/Users/pragn/Downloads/webpage.html");
		driver.manage().window().maximize();
		
		//Identify the Web Element using ID locator and store it
		WebElement element = driver.findElement(By.id("name"));
		
		WebElement element1 = driver.findElement(By.id("email"));
		
		WebElement element2 = driver.findElement(By.id("mobile"));
	
		WebElement dob = driver.findElement(By.name("dob"));
		
		WebElement gender = driver.findElement(By.id("female"));
		
		WebElement place = driver.findElement(By.id("goa"));
		Thread.sleep(2000);
		WebElement place1 = driver.findElement(By.id("manali"));
		
		//Perform action Click/Sendkeys
		element.clear();	
		Thread.sleep(2000);
		
		element.sendKeys("Jeswika");
		Thread.sleep(2000);
		
		element1.sendKeys("google.com");
		Thread.sleep(2000);
		
		element2.sendKeys("1234567890");
		Thread.sleep(2000);
		
		dob.click();
		Thread.sleep(2000);
		
		
		
		gender.click();
		Thread.sleep(2000);
		place.click();
		Thread.sleep(3000);
		//close the Browser
		driver.close();

	}

}
