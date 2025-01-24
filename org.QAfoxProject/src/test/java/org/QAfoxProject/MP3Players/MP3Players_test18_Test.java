package org.QAfoxProject.MP3Players;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.GenericUtility.WebDriverLibrary;
import org.QAfoxProject.PageRepository.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MP3Players_test18_Test extends BaseConfiguration{

	@FindBy(xpath="//li[contains(@class,'dropdown')]/a[contains(text(),'MP3')]")
	private WebElement mp3player;
	
	@FindBy(xpath="//a[contains(text(),'test 18')]")
	private WebElement test18;
	
		public void mp3Player()
		{
			HomePage homeobj = new HomePage(webdriverobj.driver);
		webdriverobj.mouseHoverToElement(homeobj.getmp3Player());
		javautilityobj.pause(5000);
		
		}
		
	}

