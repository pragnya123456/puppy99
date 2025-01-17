package handlingAlert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAuthentication {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Handle the Authentication Popups
		String username = "admin";
		String password = "admin";
		
		//Customize the URL using valid signup credentials
		
		String url = "https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";
		
		//navigate to the URL
		driver.get(url);
		
		Thread.sleep(5000);
		//close the browser
		driver.quit();
		

	}

}
