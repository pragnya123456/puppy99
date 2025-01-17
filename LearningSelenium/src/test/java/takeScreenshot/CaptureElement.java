package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureElement {

	public static void main(String[] args) throws IOException {
		
		//configure the Browser
				WebDriverManager.chromedriver().setup();
				//Launch the Browser
				WebDriver driver = new ChromeDriver();
				//Navigate to the Application via URL
				driver.get("https://www.selenium.dev/");
				driver.manage().window().maximize();
				WebElement element = driver.findElement(By.xpath("//span[contains(@class,'selenium-logo')][2]"));
				File src = element.getScreenshotAs(OutputType.FILE);
				File destination = new File("./TestScreenshot/secondScreenshot.png");
				FileHandler.copy(src,destination);
				
				driver.quit();

	}

}
