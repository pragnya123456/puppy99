package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformKeyboardAction {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Robot alexa = new Robot();
		alexa.keyPress(KeyEvent.VK_P);
		alexa.keyRelease(KeyEvent.VK_P);
		Thread.sleep(2000);
		alexa.keyPress(KeyEvent.VK_R);
		alexa.keyRelease(KeyEvent.VK_R);
		alexa.keyPress(KeyEvent.VK_A);
		alexa.keyRelease(KeyEvent.VK_A);
		alexa.keyPress(KeyEvent.VK_G);
		alexa.keyRelease(KeyEvent.VK_G);
		alexa.keyPress(KeyEvent.VK_N);
		alexa.keyRelease(KeyEvent.VK_N);
		alexa.keyPress(KeyEvent.VK_Y);
		alexa.keyRelease(KeyEvent.VK_Y);
		alexa.keyPress(KeyEvent.VK_A);
		alexa.keyRelease(KeyEvent.VK_A);
		//	Thread.sleep(2000);
		
	}

}
