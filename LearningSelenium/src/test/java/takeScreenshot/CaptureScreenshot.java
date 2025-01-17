package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		
		//configure the Browser
				WebDriverManager.chromedriver().setup();
				//Launch the Browser
				WebDriver driver = new ChromeDriver();
				//Navigate to the Application via URL
				driver.get("https://demoapp.skillrary.com/");
				driver.manage().window().maximize();
				//perform type casting
				TakesScreenshot tsobj = (TakesScreenshot)driver;
				//Store the captured screenshot in temporary path
				File screenshot = tsobj.getScreenshotAs(OutputType.FILE);
				
				//create the permanent path to store the screenshot
				File destination = new File("./TestScreenshot/firstScreenshot.png");
				
				FileHandler.copy(screenshot, destination);
				driver.quit();
	}

}
