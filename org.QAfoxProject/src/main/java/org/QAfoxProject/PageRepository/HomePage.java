package org.QAfoxProject.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(xpath="//a[@title='My Account']")
	private WebElement myaccountlink;

	@FindBy(xpath="//li/a[contains(text(),'Reg')]")
	private WebElement registerbutton;
	
	@FindBy(xpath="//li/a[contains(text(),'Login')]")
	private WebElement loginbutton;
	
	@FindBy(xpath="//li/a[contains(text(),'Logout')]")
	private WebElement logoutbutton;

	@FindBy(xpath="//li//a[(text()='Desktops')]")
	private WebElement desktop;
	
	@FindBy(xpath="//li //a[contains(text(),'Mac ')]")
	private WebElement macdropdown;
	
	@FindBy(xpath="//li//a[contains(text(),'PC')]")
	private WebElement pcdropdown;
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	private WebElement continuebutton;

	@FindBy(xpath="//li[contains(@class,'dropdown')]/a[contains(text(),'MP3')]")
	private WebElement mp3player;
	
	@FindBy(xpath="//li[contains(@class,'dropdown')]/a[contains(text(),'Components')]")
	private WebElement components;
	

	@FindBy(xpath="//li/a[contains(text(),'Mice ')]")
	private WebElement mice;
	
	@FindBy(xpath="//a/i[contains(@class,'fa fa-shopping-cart')]")
	private WebElement shoppingcart;
	
	@FindBy(xpath="//a/i[contains(@class,'fa fa-heart')]")
	private WebElement wishlist;
	
	@FindBy(xpath="//a/i[contains(@class,'fa fa-share')]")
	private WebElement checkout;
	
	@FindBy(xpath="//li//a[contains(text(),'Monitors')]")
	private WebElement monitorsbutton;

	@FindBy(xpath="//li//a[contains(text(),'Printers')]")
	private WebElement printersbutton;
	
	@FindBy(xpath="//li//a[contains(text(),'Sc')]")
	private WebElement scannersbutton;
	
	@FindBy(xpath="//li//a[contains(text(),'We')]")
	private WebElement webcamera;
	
	public WebElement getMonitorsbutton() {
		return monitorsbutton;
	}

	public WebElement getPrintersbutton() {
		return printersbutton;
	}

	public WebElement getScannersbutton() {
		return scannersbutton;
	}

	public WebElement getWebcamera() {
		return webcamera;
	}
	
	public WebElement getMacdropdown() {
		return macdropdown;
	}
	
	public WebElement getShoppingcart() {
		return shoppingcart;
	}

	public WebElement getWishlist() {
		return wishlist;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getComponents() 
	{
		return components;
	}
	public WebElement getMicebutton() {
		return mice;
	}

	public WebElement getmp3Player()
	{
		return mp3player;
	}

	public WebElement getMyaccountHeader_link() {
		return myaccountlink;
	}

	public WebElement getDesktopsdropdown() {
		return desktop;
	}
	public WebElement getPcdropdown() {
		return pcdropdown;
	}
	
	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getRegisterbutton() {
		return registerbutton;
	
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
