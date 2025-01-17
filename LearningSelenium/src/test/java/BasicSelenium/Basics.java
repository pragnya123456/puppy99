package BasicSelenium;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Basics {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the browser");
		System.out.println("1.Chrome \n 2.Edge");
		
		int browser = sc.nextInt();
		switch(browser)
		{
		case 1: WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.close();
		break;
		
		case 2: WebDriverManager.edgedriver().setup();
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://www.selenium.dev");
		driver1.close();
		
		default: System.out.println("invalid browser");
		}
	}
}
