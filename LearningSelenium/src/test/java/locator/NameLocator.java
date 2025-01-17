package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/pragn/Downloads/webpage.html");
		Thread.sleep(2000);
		//WebElement place = driver.findElement(By.name("Places"));
		WebElement place1 = driver.findElement(By.id("manali"));
		//Thread.sleep(5000);
		place1.click();
		Thread.sleep(5000);
		driver.close();
	}

}
