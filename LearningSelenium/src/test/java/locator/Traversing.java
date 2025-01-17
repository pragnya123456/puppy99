package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Traversing {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/pragn/Downloads/webpage.html");
		//WebElement element = driver.findElement(By.xpath("//label[contains(@for, 'me')]/../../../tr[9]/td[2]/textarea"));
		
		WebElement element = driver.findElement(By.xpath("//label[contains(@for, 'me')]/../../../tr[9]/td[2]/textarea(contains[@placeholder,'back']"));
		
		//element.click();)
		element.click();
	}

}
