package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchPageSource {

	public static void main(String[] args) throws InterruptedException {
		
		//configure the Browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the application via URL
		driver.get("file:///c:/Users/Harry/Downloads/webpage%20(2).html");
		
		//Fetch the PageSource
		String pagesource = driver.getPageSource();
		
		//Print on console
		System.out.println(pagesource);
		
		Thread.sleep(5000);
		
		//Close the Browser
		driver.close();
	}

}
