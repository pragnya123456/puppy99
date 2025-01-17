package handlingFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningIframe {

	public static void main(String[] args) throws InterruptedException {
		//configure the browser
		WebDriverManager.chromedriver().setup();
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//navigate to the application
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		//identify the element
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		//switch the control from main page to frame
		driver.switchTo().frame(1).switchTo().frame(0);
		Thread.sleep(3000);
		//enter the data inside the text field
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pragnya");
		//switch back the control from to immediate parent frame
		driver.switchTo().parentFrame();
		
		//fetch the text and print
		String text = driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
		System.out.println(text);
		
		//switch back to main page
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//fetch the text and print
		System.out.println(driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']")).getText());
		
		
		driver.quit();
		
	
	}

}
