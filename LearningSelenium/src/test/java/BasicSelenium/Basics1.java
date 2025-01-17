package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics1 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev/");
		driver.close();
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.close();
		

	}

}
