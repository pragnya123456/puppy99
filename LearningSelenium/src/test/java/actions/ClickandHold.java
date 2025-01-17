package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickandHold {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions actionobj = new Actions(driver);
		WebElement src1 = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement des1 = driver.findElement(By.xpath("//div[@id='box101']"));
		actionobj.clickAndHold(src1).build().perform();
		actionobj.release(des1).build().perform();
		actionobj.dragAndDrop(src1, des1).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}

