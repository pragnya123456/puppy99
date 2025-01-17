package assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowFrames {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.shoppersstack.com/products_page/17");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//button[contains(@id,'com')]")).click();
		 
		 Thread.sleep(3000);
		
		Set<String> allwindowid = driver.getWindowHandles();
		System.out.println(allwindowid);
		
		for (String window : allwindowid) {
			
			driver.switchTo().window(window);
			
			String exptitle = "https://www.amazon.com";
			String acttitle = driver.getCurrentUrl();
			if(exptitle.equals(acttitle))
			{
				driver.close();
				System.out.println(acttitle);
			}
			
		}
		
		
		
	}

	}

