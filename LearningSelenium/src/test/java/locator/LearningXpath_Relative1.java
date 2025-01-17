package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningXpath_Relative1 {

	public static void main(String[] args) throws InterruptedException {
	
		//Configure the Browser
		WebDriverManager.chromedriver().setup();
		
		//step1: Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximise the Browser
		driver.manage().window().maximize();
		
		//step2: navigate to the Application via URL
		driver.get("file:///C:/Users/pragn/Downloads/webpage.html");
		String exptitle = "Learning Selenium";
		String acttitle = driver.getTitle();
		
		//verify the webpage
		if(exptitle.equalsIgnoreCase(acttitle))
			System.out.println("Title Verified-pass");
		else
			System.out.println("Title Verified-fail");
		
		//step3: identify the Element("name textfield") location using Relative Xpath
		WebElement element1 = driver.findElement(By.xpath("//input[contains(@id,'me')]"));
		Thread.sleep(2000);
		
		//Step3.1: perform action on the element
		element1.clear();
		Thread.sleep(2000);
		element1.click();
		//Step4: identify the Element("name text") location using Relative Xpath
		//WebElement element2 = driver.findElement(By.xpath("//label[contains(text(),'e')]"));
		//element2.click();
		Thread.sleep(2000);
		
		//element.sendKeys("We will pass the data");
		WebElement element3 = driver.findElement(By.xpath("//input[contains(@id,'me')]"));
		element3.sendKeys("pragnya");
		Thread.sleep(2000);
		//Step4.1: perform action on the element
		WebElement element4 = driver.findElement(By.xpath("//input[contains(@id,'ail')]"));
		element4.click();
		Thread.sleep(2000);
		WebElement element5 = driver.findElement(By.xpath("//input[contains(@id,'ail')]"));
		element5.sendKeys("Abc@gmail.com");
		
		Thread.sleep(2000);
		driver.close();
		}

}
