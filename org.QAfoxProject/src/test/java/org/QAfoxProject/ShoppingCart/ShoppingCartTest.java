package org.QAfoxProject.ShoppingCart;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepository.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseConfiguration{

	@FindBy(xpath="//a/i[contains(@class,'fa fa-shopping-cart')]")
	private WebElement shoppingcart;
	
	@Test
	public void shoppingCart()
	{
		HomePage homeobj = new HomePage(webdriverobj.driver);
		homeobj.getShoppingcart().click();
	}
	
	
}
