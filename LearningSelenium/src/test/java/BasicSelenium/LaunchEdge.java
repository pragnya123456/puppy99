package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchEdge {

	public static void main(String[] args) {
		
		//configure the browser
		WebDriverManager.edgedriver().setup();
		
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.close();
	}
}
