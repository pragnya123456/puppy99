package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/pragn/Downloads/webpage.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.partialLinkText("Contact"));
		element.click();
		Thread.sleep(3000);
		driver.close();
	}

}
