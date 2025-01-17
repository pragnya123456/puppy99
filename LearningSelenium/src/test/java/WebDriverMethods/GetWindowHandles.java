package WebDriverMethods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
	
				//configure the browser
				WebDriverManager.chromedriver().setup();
				
				//Launch the Browser
				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//navigate to the application
				driver.get("https://www.shoppersstack.com/products_page/17");
				
			    driver.findElement(By.id("compare")).click();
			  
			    
			    //fetch the parentID
//				String parentID1 = driver.getWindowHandle();
//				System.out.println(parentID1);
				
				//Fetch the child window
             Set<String> parentID2= driver.getWindowHandles();

				
				//close only specific Amazon child-window
		
				
				      for (String Window : parentID2 ) {
					
					
					  driver.switchTo().window(Window);
					  Thread.sleep(3000);
					  String exptitle = "https://www.amazon.in/";
					  String acttitle = driver.getCurrentUrl();
					  System.out.println(acttitle);
					 
					  if(exptitle.equals(acttitle))
					  {
						  
					    driver.close();
					 }

					 
				}
				
				//close all windows without using quit method
				
				//close all child windows only
				
				//close only parent window
				//driver.close();
			    
				
	}

}
