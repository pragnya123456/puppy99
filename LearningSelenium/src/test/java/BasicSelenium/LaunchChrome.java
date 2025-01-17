package BasicSelenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	public static void main(String[] args) {
		
		
		//step1:Launch the Browser
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//step2: Navigate to the application via URL
		
		driver.get("https://selenium.dev/");

		driver.close();
		
		
	}

}
