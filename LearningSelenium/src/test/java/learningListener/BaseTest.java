package learningListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	public static WebDriver staticdriver;
	
	@BeforeMethod
	public void configure()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		staticdriver = driver;
		//driver.get("https://www.selenium.dev");
	}
}
