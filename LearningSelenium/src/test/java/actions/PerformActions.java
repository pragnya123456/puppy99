package actions;

import java.util.concurrent.TimeUnit;

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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");
		//create an object for action class
		Actions actionobj = new Actions(driver);
		//identify element
		WebElement element = driver.findElement(By.linkText("More"));
		
		//call the mouse over method
		actionobj.moveToElement(element).perform();
		Thread.sleep(3000);
		//call the mouseover method
		actionobj.moveToElement(driver.findElement(By.linkText("File Upload"))).contextClick().perform();
		
		//call the click method
		//actionobj.click(driver.findElement(By.linkText("File Upload"))).perform();
		
		//call the right click method
		//actionobj.contextClick(driver.findElement(By.linkText("File Upload"))).perform();
		
		//call the double click method
		//actionobj.doubleClick(driver.findElement(By.linkText("File Upload"))).perform();
		Thread.sleep(3000);

		driver.quit();
	}

}
