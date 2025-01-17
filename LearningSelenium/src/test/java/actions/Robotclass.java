package actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robotclass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Actions ac = new Actions(driver);
		//ac.sendKeys("Selenium",Keys.ENTER).perform();
		ac.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();

	}
	

}
