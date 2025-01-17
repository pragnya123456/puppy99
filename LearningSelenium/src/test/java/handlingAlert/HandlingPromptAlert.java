package handlingAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPromptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//navigate to the application via URL 
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//click on the button which gives popup---prompt alert
	    WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
	    element.click();
	    
	    //Explicit wait condition to check the alert is present
	   // WebDriverWait wait = new WebDriverWait(driver,20);
	   // wait.until(ExpectedConditions.alertIsPresent());
	    
	    //Switch the driver control from main page to alert
	    
	    //Fetch alert title and print
	    String alertText = driver.switchTo().alert().getText();
	    System.out.println(alertText);
	    //Thread.sleep(4000);
	    
	    //Enter the data in alert textfield
	    driver.switchTo().alert().sendKeys("Learning Selenium");
	    //click on OK button
	    driver.switchTo().alert().accept();
	    //click on cancel button
	   // driver.switchTo().alert().dismiss();
	    driver.quit();
	    
	}

}
