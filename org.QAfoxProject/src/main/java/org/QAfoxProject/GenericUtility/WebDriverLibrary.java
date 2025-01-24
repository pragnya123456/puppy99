package org.QAfoxProject.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverLibrary {

	public WebDriver driver;
	public static WebDriver static_driver;
	public Actions action;
	public Select select;
	
	/**
	 * this method launches specific browser
	 * @param browser
	 */
	
	public void launchBrowser(String browser)
	{
		switch(browser)
		{
		case "chrome":
		
		driver = new ChromeDriver();
		static_driver = driver;
		break;
		
		case "edge":
			
			driver = new EdgeDriver();
			static_driver = driver;
			break;
			
		case "firefox":
			
			driver = new FirefoxDriver();
			static_driver = driver;
			break;
			default: System.out.println("invalid browser");
		}
	}
	/*this method maximizes the browser*/
	
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	
	/*this method navigates to the application*/
	
	public void navigateToApp(String url)
	{
		driver.get(url);
	}
	
	/* this method is used to close the browser */
	
	public void closeBrowser()
	{
		driver.close();
		
	}
	
	/* this method is used to close all the browser windows */
	
	public void closeAllBrowser()
	{		
		driver.quit();
	}
	
/* this method is used to close the browser */
	
	public void waitUntilElementfound()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PathConstant.DURATION));
	}
	/*this method waits until the element is visible on the web page
	 * @param element*/
	
	public void explicitWait(long time, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(PathConstant.DURATION));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/*This method used to mouse hover on an element
	 * @param element*/
	
	public void mouseHoverToElement(WebElement element)
	{
		action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	/*This method used to double click on an element
	 * @param element*/
	
	public void doubleClickonElement(WebElement element)
	{
		action = new Actions(driver);
		action.doubleClick(element).perform();
	}
	
	/*This method used to right click on an element
	 * @param element*/
	
	public void rightClickonElement(WebElement element)
	{
		action = new Actions(driver);
		action.contextClick(element).perform();
	}
	
	/*This method used to double click on an element
	 * @param source
	 * @param target*/
	
	public void dragAndDroptElement(WebElement source, WebElement target)
	{
		action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}
	
	/*This method used to select an element based on index
	 * @param element
	 * @param index*/
	
	public void selectFromDropdown(WebElement element, int index)
	{
		select = new Select(element);
		select.selectByIndex(index);
	}
	
	/*This method used to select an element based on value
	 * @param element
	 * @param value*/
	
	public void selectFromDropdown(WebElement element, String value)
	{
		select = new Select(element);
		select.selectByValue(value);
	}
	
	/*This method used to select an element based on value
	 * @param element
	 * @param visibletext*/
	
	public void selectFromDropdown(String visibletext, WebElement element)
	{
		select = new Select(element);
		select.selectByVisibleText(visibletext);
	}
	
	/*This method used to fetch the frame based on index
	 * @param index*/
	
	public void switchToFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	
	/*This method used to fetch the frame based on id or name attribute value
	 * @param idOrName*/
	
	public void switchToFrame(String idOrName)
	{
		driver.switchTo().frame(idOrName);
	}
	
	/*This method used to fetch the frame based on frame elemrnt
	 * @param element*/
	
	public void switchToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	/*This method used to switch back to default window
	 */
	
	public void switchToDefaultWindow()
	{
		driver.switchTo().defaultContent();
	}
	
	/*This method used to switch back to parent window/frame
	 */
	
	public void switchToParentframe()
	{
		driver.switchTo().parentFrame();
	}
	
	/*This method handles alert popup
	 @param status*/
	
	public void handleAlert(String status)
	{
		Alert al = driver.switchTo().alert();
		if(status.equalsIgnoreCase("ok"))
		{
			al.accept();
		}
		else
		{
			al.dismiss();
		}
	}
	
	/*This method converts dynamic xpath to webelement
	 @param commonPath
	 @param replaceData
	 @return*/
	
	public WebElement convertDynamicXpathToWebElement(String commonPath, String replaceData)
	{
		String requiredPath = String.format(commonPath, replaceData);
		return driver.findElement(By.xpath(requiredPath));
	}
	
}
