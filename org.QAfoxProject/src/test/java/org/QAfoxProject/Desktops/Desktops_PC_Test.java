package org.QAfoxProject.Desktops;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.GenericUtility.WebDriverLibrary;
import org.QAfoxProject.PageRepository.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Desktops_PC_Test extends BaseConfiguration{

	@Test

	public void addProduct_Desktops_Pc()
	{
	HomePage homeobj = new HomePage(webdriverobj.driver);
		
	webdriverobj.mouseHoverToElement(homeobj.getDesktopsdropdown());

	javautilityobj.pause(5000);
	
	homeobj.getPcdropdown().click();

	
	Reporter.log("mouse hover to PC desktop is successfull",true);
	}
	
}
