package multipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSuggestions {

	public static void main(String[] args) throws InterruptedException {
		
		//configure the Browser
		WebDriverManager.chromedriver().setup();
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		//Navigate to the Application via URL
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Identify the Element-Search textfield
		WebElement element = driver.findElement(By.xpath("//textarea[contains(@name,'q')]"));
		
		element.sendKeys("selenium");
		Thread.sleep(5000);
		List<WebElement> allsuggestions = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		
		int count = allsuggestions.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++)
		{
			String text =allsuggestions.get(i).getText();
			System.out.println(i+1+" > "+text);
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}
