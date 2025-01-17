package assignment;

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
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions actionobj = new Actions(driver);
		WebElement src1 = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement des1 = driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement src2 = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement des2 = driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement src3 = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement des3 = driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement src4 = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement des4 = driver.findElement(By.xpath("//div[@id='box104']"));
		WebElement src5 = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement des5 = driver.findElement(By.xpath("//div[@id='box103']"));
		WebElement src6 = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement des6 = driver.findElement(By.xpath("//div[@id='box102']"));
		WebElement src7 = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement des7 = driver.findElement(By.xpath("//div[@id='box107']"));
		//perform drag and drop action
		actionobj.dragAndDrop(src1, des1).perform();
		Thread.sleep(2000);
		actionobj.dragAndDrop(src2, des2).perform();
		Thread.sleep(2000);
		actionobj.dragAndDrop(src3, des3).perform();
		Thread.sleep(2000);
		actionobj.dragAndDrop(src4, des4).perform();
		Thread.sleep(2000);
		actionobj.dragAndDrop(src5, des5).perform();
		Thread.sleep(2000);
		actionobj.dragAndDrop(src6, des6).perform();
		Thread.sleep(2000);
		actionobj.dragAndDrop(src7, des7).perform();
		
	}

}
