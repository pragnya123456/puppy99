package grooming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCasePractice {

	public static void main(String[] args) {
	
		//Launch Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@href,'/login')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("pragnya");
		driver.findElement(By.xpath("//form[contains(@action,'/si')]/input[contains(@type,'email')]")).sendKeys("pragnya123@gmail.com");
		driver.findElement(By.xpath("//form[contains(@action,'/si')]/button[contains(@type,'submit')]")).click();
		
		//Account Creation
		driver.findElement(By.xpath("//input[contains(@value,'Mrs')]")).click();
		driver.findElement(By.xpath("//input[contains(@type,'pa')]")).sendKeys("pragnya@123");
		driver.findElement(By.xpath("//select[contains(@id,'days')]")).click();
		driver.findElement(By.xpath("//option[text()=1]")).click();
		driver.findElement(By.xpath("//select[contains(@id,'mo')]")).click();
		driver.findElement(By.xpath("//option[text()='January']")).click();
		
		
		
		
		
		
		
		

	}

}
