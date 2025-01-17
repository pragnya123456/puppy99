package handlingScrollingAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollActionUsingJScode {

	public static void main(String[] args) throws InterruptedException {

				//configure the Browser
				WebDriverManager.chromedriver().setup();
				//Launch the Browser
				WebDriver driver = new ChromeDriver();
				
				//Navigate to the Application via URL
				driver.get("https://www.selenium.dev");
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//steps to perform scroll action
				int x =0;
				int y=1000;
				//write the javascript code
				
				String jscode1 = "window.scrollBy("+x+","+y+")";
				//String jscode = "window.scrollBy(0,-500)";
				String jscode2 = "window.scrollTo("+x+","+y+")";
				String jscode = "window.scrollTo(0,500)";
				String jscode3 = "arguments[0].scrollintoView(true)";
				String jscode4 = "arguments[0].scrollintoView(false)";
				Thread.sleep(3000);
				//1.perform typecasting
				JavascriptExecutor jsobj = (JavascriptExecutor)driver;
				//2.call the method to execute the JScode
				jsobj.executeScript(jscode2);
				Thread.sleep(5000);
				jsobj.executeScript(jscode);
				Thread.sleep(3000);
				//close the browser
				driver.close();
				//Execution log
				System.out.println("Execution Completed");
	}

}
