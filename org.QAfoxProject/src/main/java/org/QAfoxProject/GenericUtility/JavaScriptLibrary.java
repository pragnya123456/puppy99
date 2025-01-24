package org.QAfoxProject.GenericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 * This class provides reusable methods to perform javascript related operations
 * @author pragnya
 */
public class JavaScriptLibrary {
	
	public JavascriptExecutor javascriptobj;

	/*This method used to enter the data in disabled element*/
	public void enterData_DisabledElement(WebElement element, String data) {
		javascriptobj = (JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("argument[0].value=''" + data+ "", element);
		
	}
	
	public void click_DisabledElement(WebElement element)
	{
		javascriptobj = (JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("argument[0].click()", element);	
	}
	/*This method used to scroll to webelement*/
	
	public void defaultVerticalScrollBy()
	{
		javascriptobj = (JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("window.scrollBy(1000,1000)");
	}
	
	/*This method used to scroll on webpage*/	
	public void defaultVerticalScrollTo()
	{
		javascriptobj = (JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("window.scrollTo(1000,1000)");
	}
	
	/*This method used to scroll until the element visible*/	
	public void scrollUsingView(WebElement element, boolean value)
	{
		javascriptobj = (JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("window.scrollIntoView("+value+");",element);
	}

}


