package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformDragndrop {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions actionobj = new Actions(driver);
	    List<WebElement> source = driver.findElements(By.xpath("//div[@id='dropContent']//div[contains(@id,'box')]"));
	    List<WebElement> target = driver.findElements(By.xpath("//div[@id='countries']//div[contains(@id,'box')]"));
	    Thread.sleep(2000);
	    for (int i = 0; i<source.size(); i++) 
	    {
	    	WebElement src = source.get(i);
	    	Thread.sleep(2000);
	    	WebElement des = target.get(i);
	    	actionobj.dragAndDrop(src, des).perform();
			Thread.sleep(2000);
		}
	    driver.quit();
	}

}
