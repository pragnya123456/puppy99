package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageWindows {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		//Options optionobj = driver.manage();
		
		//Window windowobj = optionobj.window();
		
		//windowobj.maximize();	
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.manage().window().fullscreen();
		
		//Thread.sleep(5000);
		
	
		
		Thread.sleep(5000);
		
		Dimension size = new Dimension(500,500);
		driver.manage().window().setSize(size);
		
		Thread.sleep(5000);
		
		Point position = new Point(200,200);
		driver.manage().window().setPosition(position);
		
		Thread.sleep(5000);
		driver.close();

	}

}
