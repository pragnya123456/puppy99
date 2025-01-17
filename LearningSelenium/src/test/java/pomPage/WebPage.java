package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebPage {

	@Test
	public void test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		Login loginobj = new Login(driver);
		
		driver.navigate().refresh();
		System.out.println(loginobj.getText());
		loginobj.getElement().sendKeys("standard_user");
		loginobj.getPassword().sendKeys("secret_sauce");
		loginobj.getLogin().click();
		
		driver.close();
		
	}
}
