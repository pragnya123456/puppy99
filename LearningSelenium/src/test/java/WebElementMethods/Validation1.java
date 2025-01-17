package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation1 {

	public static void main(String[] args) {
		
				//COnfigure the Browser
				WebDriverManager.chromedriver().setup();
				
				//Launch the browser
				WebDriver driver = new ChromeDriver();
				
				
				//Navigate to the Application via URL
				driver.get("https://www.facebook.com");
				
				//identify the element
				WebElement button = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
				
				//perform action click
				button.click();
				
				WebElement radiobutton= driver.findElement(By.xpath("//label[contains(text(),'Female')]/child::input[contains(@value,'1')]"));
				
				//perform action click
				radiobutton.click();
				
				//validate the element
				Boolean result = radiobutton.isSelected();
				if(result)
				{
					System.out.println("Element is Selected");
				}
				else
				{
					System.out.println("Element is not Selected");
				}
				//close the browser
				driver.close();

	}

}
