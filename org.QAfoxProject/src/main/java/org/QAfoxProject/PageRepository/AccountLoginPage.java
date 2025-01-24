package org.QAfoxProject.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPage {

	//declaration
	
	@FindBy(xpath="//input[contains(@name,'ema')]")
	private WebElement emailtextfield;
	
	@FindBy(xpath="//input[contains(@name,'pass')]")
	private WebElement passwordtextfield;
	
	@FindBy(xpath="//input[contains(@type,'su')]")
	private WebElement loginbutton;
	
	//initialization
	
			public AccountLoginPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginButton() {
		return loginbutton;
	}
}
