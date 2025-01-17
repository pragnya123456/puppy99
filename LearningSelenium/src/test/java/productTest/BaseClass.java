package productTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver staticdriver;
	
	@BeforeSuite
	public void dbConnect()
	{
		Reporter.log("Database connected successfully",true);
	}
	
	@BeforeTest
	public void testRunner()
	{
		Reporter.log("Test runner connected successfully",true);
	}
	
	@BeforeClass
	
	public void configure() 
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	staticdriver = driver;
	driver.get("https://www.saucedemo.com/");
	
	}
	
	@BeforeMethod
	
	public void login()

	{
		driver.findElement(By.xpath("//input[contains(@id,'us')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[contains(@id,'p')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		Reporter.log("logged in successfully",true);
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.xpath("//div[contains(@class,'bur')]")).click();
		driver.findElement(By.xpath("//a[contains(@id,'lo')]")).click();
		Reporter.log("logged out successfully",true);
		
	}
	
	@AfterClass
	
	public void terminate()
	{
		driver.quit();
	}
	@AfterTest
	public void testRunnerTerminate()
	{
		Reporter.log("Test Runner disconnected successfully",true);
	}
	
	@AfterSuite
	
	public void dbDisconnect()
	{
		Reporter.log("DB disconnected successfully",true);
	}
}
