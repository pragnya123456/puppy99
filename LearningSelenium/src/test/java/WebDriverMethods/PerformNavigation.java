package WebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformNavigation {

	public static void main(String[] args) throws MalformedURLException {
		
		//configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the application
		driver.get("https://www.amazon.com");
		
		//Navigate to the application
		driver.navigate().to("https://www.google.com");
		
		driver.navigate().to(new URL("https://www.facebook.com"));
		
		//perform backward navigation
		driver.navigate().back();
		
		//perform forward navigation
		driver.navigate().forward();
	
		//perform backward navigation
		driver.navigate().back();
		
		//perform refresh navigation
		driver.navigate().refresh();
		
		//perform refresh navigation
		driver.navigate().refresh();
				
		driver.quit();
		
		//Execution Completed log
		System.out.println("Execution completed");
		
	}

}
