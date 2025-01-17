package handlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchDropdownOptions {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/pragn/Downloads/webpage.html");
		WebElement dropdown1 = driver.findElement(By.name("country1"));
		WebElement dropdown2 = driver.findElement(By.name("country2"));
		//identify the dropdown
		Select selectobj = new Select(dropdown2);
		boolean result = selectobj.isMultiple();
		if(result)
		{
			System.out.println("Dropdown verified: it is multiple dropdown");
		}
		else
		{
			System.out.println("Dropdown verified: it is single dropdown");
		}
		Thread.sleep(3000);
		selectobj.selectByIndex(0);
		selectobj.selectByVisibleText("AUSTRALIA");
		
		selectobj.selectByValue("cnd");
		List<WebElement> alloptions = selectobj.getOptions();
		int count = alloptions.size();
		System.out.println(count);
		
		for (WebElement webElement : alloptions) {
			
			String text = webElement.getText();
			System.out.println(text);
			
		} 
		driver.quit();
		
		
		
	}

}
