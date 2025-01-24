package org.QAfoxProject.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountPage {

		//declaration
		
		@FindBy(xpath="//input[contains(@name,'first')]")
		private WebElement firstnametextfield;
		
		@FindBy(xpath="//input[contains(@name,'last')]")
		private WebElement lastnametextfield;
		
		@FindBy(xpath="//input[contains(@name,'em')]")
		private WebElement emailtextfield;
		
		
		@FindBy(xpath="//input[contains(@name,'tel')]")
		private WebElement telephonetextfield;
		
		@FindBy(xpath="//input[contains(@name,'pas')]")
		private WebElement passwordtextfield;
		
		@FindBy(xpath="//input[contains(@name,'con')]")
		private WebElement confirmtextfield;
		
		@FindBy(xpath="//label[contains(@class,'radio-inline')]/input[contains(@value,'1')]")
		private WebElement yesradiobutton;
		
		@FindBy(xpath="//label[contains(@class,'radio-inline')]/input[contains(@value,'0')]")
		private WebElement noradiobutton;
		
		@FindBy(css="input[type='checkbox']")
		private WebElement termsConditionCheckbox;
		
		@FindBy(css="input[type='submit']")
		private WebElement continuebutton;
		
		
		//2.initialization
		
		public RegisterAccountPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3.Utilization

		public WebElement getFirstnametextfield() {
			return firstnametextfield;
		}

		public WebElement getLastnametextfield() {
			return lastnametextfield;
		}

		public WebElement getEmailtextfield() {
			return emailtextfield;
		}

		public WebElement getTelephonetextfield() {
			return telephonetextfield;
		}

		public WebElement getPasswordtextfield() {
			return passwordtextfield;
		}

		public WebElement getConfirmtextfield() {
			return confirmtextfield;
		}

		public WebElement getYesradiobutton() {
			return yesradiobutton;
		}

		public WebElement getNoradiobutton() {
			return noradiobutton;
		}

		public WebElement getTermsConditionCheckbox() {
			return termsConditionCheckbox;
		}

		public WebElement getContinuebutton() {
			return continuebutton;
		}
		
	}
