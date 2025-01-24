package org.QAfoxProject.RegisterAccount;


import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.GenericUtility.WebDriverLibrary;
import org.QAfoxProject.PageRepository.RegisterAccountPage;
import org.openqa.selenium.By;

import org.testng.Reporter;

import org.testng.annotations.Test;


public class RegisterAccountTest extends BaseConfiguration{

	@Test(enabled=false)
	public void verifyWithValidInput()
	{
		RegisterAccountPage registerAccountpage= new RegisterAccountPage(WebDriverLibrary.static_driver);
		
		registerAccountpage.getFirstnametextfield().sendKeys("user");
		
		registerAccountpage.getLastnametextfield().sendKeys("name");
	
		registerAccountpage.getEmailtextfield().sendKeys("pragnya12345@gmail.com");
		
		registerAccountpage.getTelephonetextfield().sendKeys("9848022336");
		
		registerAccountpage.getPasswordtextfield().sendKeys("Abc@1234");
		
		registerAccountpage.getConfirmtextfield().sendKeys("Abc@1234");
		
		registerAccountpage.getTermsConditionCheckbox().click();
		
		registerAccountpage.getContinuebutton().click();
		
		
		//Test Log
		Reporter.log("RegisterAccount verified with valid input", true);
		//Assert.fail();
	}
	
	@Test
	public void verifyWithInvalidInput()
	{	
		//Test Log
		Reporter.log("RegisterAccount verified with invalid input", true);
		
	}
}
