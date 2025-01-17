package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformDragandDrop {

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
		//Thread.sleep(2000);
		//perform drag and drop action
		
		WebElement src = driver.findElement(By.xpath("//img[@src='selenium.png']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droparea']"));
		actionobj.dragAndDrop(src, target).perform();
		//Thread.sleep(2000);
		WebElement src1 = driver.findElement(By.xpath("//img[@src='logo.png']"));
		WebElement target1 = driver.findElement(By.xpath("//div[@id='droparea']"));
		actionobj.dragAndDrop(src1, target1).perform();
		//Thread.sleep(2000);
		WebElement src2 = driver.findElement(By.xpath("//img[@id='mongo']"));
		WebElement target2 = driver.findElement(By.xpath("//div[@id='droparea']"));
		actionobj.dragAndDrop(src2, target2).perform();
		driver.quit();
		
	}

}
