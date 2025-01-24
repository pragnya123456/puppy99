package org.QAfoxProject.WishList;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepository.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class WishListTest extends BaseConfiguration{

	
	@FindBy(xpath="//a/i[contains(@class,'fa fa-heart')]")
	private WebElement wishlist;
	
	@Test
	public void wishList()
	{
		HomePage homeobj = new HomePage(webdriverobj.driver);
		homeobj.getWishlist().click();
	}
}
