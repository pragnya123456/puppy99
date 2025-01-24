package org.QAfoxProject.Checkout;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepository.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseConfiguration{

	
	@FindBy(xpath="//a/i[contains(@class,'fa fa-share')]")
	private WebElement checkout;
	
	@Test
	public void checkOut()
	{
		HomePage homeobj = new HomePage(webdriverobj.driver);
		homeobj.getCheckout().click();
	}
	
	
}
