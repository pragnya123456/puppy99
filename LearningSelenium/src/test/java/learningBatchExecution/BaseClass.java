package learningBatchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	@Parameters({"browser","url"})
	@BeforeClass
		public void browserSetup(String browsername, String url)
		{
		//System.out.println("Browser setup");
		if(browsername.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browsername.equals("Edge"))
		{
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
		}
		else {
			System.out.println("Please enter valid browser name");
		}
		
		driver.get("https://www.saucedemo.com/");
	
		Reporter.log("Browser Setup",true);
		}
	
	@Parameters({"username","password"})
	@BeforeMethod
	public void login(String uname, String pswd)
	{
//		System.out.println(url);
//		System.out.println(uname);
//		System.out.println(pswd);
		//System.out.println("login");
		
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys(uname);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(pswd);
		driver.findElement(By.xpath("//input[contains(@type,'sub')]")).click();
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout()
	{
		//System.out.println("logout");
		driver.findElement(By.xpath("//div[contains(@class,'bm-burger')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[contains(@id,'log')]")).click();
		Reporter.log("logout",true);
	}
	@AfterClass
	public void browserTerminate()
	{
		//System.out.println("Browser Terminated");
		driver.quit();
		Reporter.log("Browser Terminated",true);
	}
	
}
