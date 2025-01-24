
package org.QAfoxProject.Desktops;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.GenericUtility.WebDriverLibrary;
import org.QAfoxProject.PageRepository.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Desktops_Mac_Test extends BaseConfiguration{
	

	@Test
	public void addProduct_Desktops_Mac()
	{
	//Create the Test information
	ExtentTest test = report.createTest("Verify-AddProduct_Desktops_Mac");
	
	HomePage homeobj = new HomePage(webdriverobj.driver);
	
	webdriverobj.mouseHoverToElement(homeobj.getDesktopsdropdown());
	test.log(Status.PASS, "Step1: Perform mouse hover action-Desktop");
	
	javautilityobj.pause(5000);
	
	webdriverobj.mouseHoverToElement(homeobj.getMacdropdown());
	test.log(Status.PASS, "Step 2.1: Perform mouse hover action-Mac");
	
	homeobj.getMacdropdown().click();
	test.log(Status.PASS, "Step 2.2: Perform click action-Mac");
	
	//Reporter.log("mouse hover to Mac desktop is successfull",true);
	test.log(Status.INFO, "Desktops_Mac_product added successful");
	}
	
	}
	
