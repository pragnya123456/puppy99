package WebDriverMethods;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitle {

	public static void main(String[] args) {
		
		//configure the Browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate the application via url
		driver.get("https://www.saucedemo.com/inventory.html");
		
		//Fetch the title of the WebPage
		String title = driver.getTitle();
		
		//print the title
		System.out.println(title);
		
		
		//close the browser
		driver.close();

	}

}
