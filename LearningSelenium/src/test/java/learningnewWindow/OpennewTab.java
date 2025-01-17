package learningnewWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpennewTab {
	
	@Test
	
	public void m1()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.selenium.dev/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.selenium.dev/");
	}

}
