package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformAction {

	public static void main(String[] args) throws InterruptedException {
				//configure the browser
				WebDriverManager.chromedriver().setup();
				
				//launch the browser
				WebDriver driver = new ChromeDriver();
				
				//navigate to the Application via URL
				driver.get("https://demowebshop.tricentis.com/");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				//System.out.println(driver.getPageSource());
				driver.manage().window().maximize();
				
				//Identify the element
				WebElement register = driver.findElement(By.xpath("//a[contains(@href,'register')]"));
				Boolean result = register.isDisplayed();
				Boolean result1 = register.isEnabled();
				
				//Validate the Element
				if(result&&result1) {
					System.out.println("Register Element verified: it is displayed and enabled");
				}
				else {
					System.out.println("Element verified:---fail");
				}
				
				//Perform Actions
				register.click();
				WebElement maleradio = driver.findElement(By.xpath("//input[contains(@id,'gender-m')]"));
				maleradio.click();
				
				//Thread.sleep(1000);
				//WebElement femaleradio = driver.findElement(By.xpath("//input[contains(@id,'gender-f')]"));
				//femaleradio.click();
				
				WebElement firstname = driver.findElement(By.xpath("//input[contains(@id,'First')]"));
				firstname.sendKeys("John");
				
				WebElement lastname = driver.findElement(By.xpath("//input[contains(@id,'Last')]"));
				lastname.sendKeys("David");
				
				WebElement email = driver.findElement(By.xpath("//input[contains(@id,'E')]"));
				email.sendKeys("David@gmail.com");
				
				WebElement password = driver.findElement(By.xpath("//label[contains(text(),'Password:')]/following-sibling::input[contains(@name,'Password')]"));
				password.sendKeys("Abc@123");
				
				WebElement confirmpassword = driver.findElement(By.xpath("//label[contains(text(),'Confirm password:')]/following-sibling::input[contains(@name,'ConfirmPassword')]"));
				confirmpassword.sendKeys("Abc@123");
				
				WebElement regbutton = driver.findElement(By.xpath("//input[contains(@id,'reg')]"));
				regbutton.submit();
				
				Thread.sleep(2000);
				driver.quit();
				System.out.println("Execution completed");
	}

}
