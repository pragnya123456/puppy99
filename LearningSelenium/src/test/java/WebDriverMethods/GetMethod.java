package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethod {

	public static void main(String[] args) {
		
		//configure the Browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the application via URL
		driver.get("https://www.selenium.dev/");
		
		//close the Browser
		driver.close();
		

	}

}
