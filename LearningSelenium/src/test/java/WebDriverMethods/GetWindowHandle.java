package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandle {

	public static void main(String[] args) {
		
		//configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		//navigate to the application
		driver.get("file:///C:/Users/pragn/Downloads/webpage.html");
		
		//fetch the parentID
		String parentID1 = driver.getWindowHandle();
		
		//print on console
		System.out.println(parentID1);
		
		//driver.navigate().refresh();
		driver.close();
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.instagram.com/");
		Set<String> parentID2= driver1.getWindowHandles();
		
		//print on console
		System.out.println(parentID2);
		driver1.quit();
	}

}
