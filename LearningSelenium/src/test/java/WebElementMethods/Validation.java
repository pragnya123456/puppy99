package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation {

	public static void main(String[] args) throws InterruptedException {
		//COnfigure the Browser
		WebDriverManager.edgedriver().setup();
		//Launch the browser
		WebDriver driver = new EdgeDriver();
		//Customize the webpage
		driver.manage().window().setSize(new Dimension(1000,1000));
		driver.manage().window().setPosition(new Point(1000,1000));
		//Navigate to the Application via URL
		driver.get("https://www.maccosmetics.in/products/13854/Products/Makeup/Lips/Lipstick");
		//verify the web page
		String exptitle = "Lipstick Makeup | M∙A∙C Cosmetics – Official Site";
		String acttitle = driver.getTitle();
		
		if(exptitle.equals(acttitle))
		{
			System.out.println("Title verified: pass");
		}
		else
		{
			System.out.println("Title Verified: fail");
		}
		Thread.sleep(5000);
		//identify the web element
		WebElement addtotagbutton = driver.findElement(By.xpath("//button[contains(@aria-label,'Add To Bag')]"));
		//verify the element
		boolean result1 = addtotagbutton.isDisplayed();
		boolean result2 = addtotagbutton.isEnabled();
		if(result1)
		{
			System.out.println("Element verified: it is displayed");
			
		}
		else
		{
			System.out.println("Element verified: it is not displayed");
		}
		Thread.sleep(5000);
		if(result2)
		{
			System.out.println("Element verified: it is enabled");
			
		}
		else
		{
			System.out.println("Element verified: it is not enabled");
		}
		driver.close();
	}

}
