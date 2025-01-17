package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Actions actionobj = new Actions(driver);
	
		actionobj.moveToElement(driver.findElement(By.partialLinkText("Interaction"))).perform();
		Thread.sleep(2000);
		actionobj.moveToElement(driver.findElement(By.partialLinkText("Drag"))).perform();
		Thread.sleep(2000);
		actionobj.moveToElement(driver.findElement(By.partialLinkText("Static"))).click().perform();
	
			List<WebElement> src = driver.findElements(By.xpath("//div[@id='dragarea']//div"));
			WebElement target = driver.findElement(By.xpath("//div[@id='droparea']"));
			//Thread.sleep(3000);
			for (WebElement src1 : src) {
				
			actionobj.dragAndDrop((WebElement) src1, target).perform();
			Thread.sleep(3000);
			}
			driver.quit();
		}
	}


