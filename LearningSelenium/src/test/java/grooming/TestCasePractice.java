package grooming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCasePractice {

	WebDriver driver;
	
	public void registerUser() {
	
		//Launch Browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@href,'/login')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("pragnya");
		driver.findElement(By.xpath("//form[contains(@action,'/si')]/input[contains(@type,'email')]")).sendKeys("pragnya123@gmail.com");
		driver.findElement(By.xpath("//form[contains(@action,'/si')]/button[contains(@type,'submit')]")).click();
	}
	@Test
	public void loginAccount() {
		//Account Creation
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		driver.findElement(By.xpath("//form[contains(@action,'lo')]/input[contains(@name,'em')]")).sendKeys("pragnya123@gmail.com");
		driver.findElement(By.xpath("//form[contains(@action,'lo')]/input[contains(@name,'p')]")).sendKeys("pragnya123");
		driver.findElement(By.xpath("//form[contains(@action,'lo')]/button[contains(@type,'su')]")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Mrs')]")).click();
		driver.findElement(By.xpath("//input[contains(@type,'pa')]")).sendKeys("pragnya@123");
		driver.findElement(By.xpath("//select[contains(@id,'days')]")).click();
		driver.findElement(By.xpath("//option[text()=1]")).click();
		driver.findElement(By.xpath("//select[contains(@id,'mo')]")).click();
		driver.findElement(By.xpath("//option[text()='January']")).click();
		
		
	}
		
	}


