package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTest {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ajio.com/vooter-men-zip-front-regular-fit-jacket/p/466904610_black");
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.xpath("//h1[contains(@aria-label,'Men Zip-Front Regular Fit Jacket')]"));
	WebElement element1 = driver.findElement(By.xpath("//div[contains(@class,'prod-sp')]"));
	Thread.sleep(3000);
	boolean result1 = element.isDisplayed();
	if(result1)
	{
		System.out.println("product is displayed");
	}
	//Thread.sleep(2000);
	String text = element.getText();
	System.out.println(text);
	String text1 = element1.getText();
	System.out.println(text1);
	
	driver.close();

	}

}
