package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//1.declaration
	
	@FindBy(name="q")
	private WebElement SearchField;
	
	//2.initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Utilization
	
	public WebElement getElement()
	{
		return SearchField;
	}
	
}
