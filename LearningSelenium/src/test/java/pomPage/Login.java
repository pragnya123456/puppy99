package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	//Declaration
	@FindBy(css = ".login_logo")
	private WebElement logotext;
	
	@FindBy(id= "user-name")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name = "login-button")
	private WebElement submit;
	


//Initialization

	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//Utilization
	public WebElement getText()
	{
		return logotext;
	}
	public WebElement getElement()
	{
		return username;
	}
	public WebElement getPassword()
	{
		return password;
	}
	public WebElement getLogin()
	{
		return submit;
	}
	
}