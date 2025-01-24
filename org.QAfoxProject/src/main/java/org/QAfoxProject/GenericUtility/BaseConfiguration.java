package org.QAfoxProject.GenericUtility;

import java.beans.BeanProperty;

import org.QAfoxProject.PageRepository.AccountLoginPage;
import org.QAfoxProject.PageRepository.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 *This class describes the configuration for test script
 *This class is used for configure all precondition and post condition for testscript
 *and also initializing all the library utility class
 *@author pragnya */
public class BaseConfiguration {

	
	public WebDriverLibrary webdriverobj;
	public ExcelFileLibrary excelutilityobj;
	public PropertyFileLibrary propertyfileobj;
	public JavaLibrary javautilityobj;
	public JavaScriptLibrary jsutilityobj;
	public TakesScreenshotLibrary tsutilityobj;
	
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	
	/**
	 * This method used to configure the browser setup
	 * @param
	 **/
	@Parameters({"browser","url"})
	@BeforeClass
	public void browserSetup()
	{

		//initialize all the libraries
		initobjects();
		
		String browser = "chrome";
		String url = "https://tutorialsninja.com/demo/";
//		//Test Log
//		
//		//precondition 1: Launch the browser
		webdriverobj.launchBrowser(browser);
		Reporter.log("Browser launched successfully", true);
		
		//precondition 2: Navigate to the application
		webdriverobj.navigateToApp(url);
		Reporter.log("Browser navigated successfully", true);
//		
//		//precondition 3: maximize the browser
//		
		webdriverobj.maximizeBrowser();
		Reporter.log("Browser maximized successfully", true);
		

		HomePage homeobj = new HomePage(webdriverobj.driver);
		
		//Click on My Account Header link
		homeobj.getMyaccountHeader_link().click();
		Reporter.log("Clicked on My Account header link successfull",true);
	
		//Click on Login Header link
		homeobj.getLoginbutton().click();
		Reporter.log("Clicked on login button link successfull",true);
		
//		 homeobj.getRegisterbutton().click();
//		 Reporter.log("Clicked on Register link successfull",true);
	}
	
	/**
	 * This method used to configure the browser termination
	 
	 **/
	@AfterClass(enabled=true)
	public void browserTerminate()
	{
		//Test Log
		//Postcondition 1 : close the browser
		HomePage homeobj = new HomePage(webdriverobj.driver);
		homeobj.getContinuebutton().click();
		webdriverobj.closeAllBrowser();
		Reporter.log("Browser terminated successfully", true);
	}
	
	/**
	 * This method used to perform the login activity
	 
	 **/
	@BeforeMethod(enabled = true)
	public void login()
	{
		String username = "pragnya12345@gmail.com";
		String password = "Abc@1234";
		//Test Log
		//Provide wait statement
		webdriverobj.waitUntilElementfound();
		

		AccountLoginPage loginobj = new AccountLoginPage(webdriverobj.driver);
		
		loginobj.getLoginButton().click();
		
		loginobj.getEmailtextfield().sendKeys(username);
		
		loginobj.getPasswordtextfield().sendKeys(password);;
		
		loginobj.getLoginButton().click();
		
		Reporter.log("logged in successfully", true);
	}
	
	/**
	 * This method used to perform the logout activity
	 * @param
	 **/
	@AfterMethod()
	public void logout()
	{
		//Test Log
		HomePage homeobj = new HomePage(webdriverobj.driver);
		homeobj.getMyaccountHeader_link().click();
		homeobj.getLogoutbutton().click();
		//homeobj.getContinuebutton().click();
		Reporter.log("logged out successfully", true);
	}
	
	/**
	 * This method used to configure the TestRunner level configuration

	 **/
	@BeforeTest
	public void getTestRunnerConnection()
	{
		//Test Log
		Reporter.log("TestRunner connected successfully", true);
	}
	
	/**
	 * This method used to terminate the TestRunner level configuration
	 * @param
	 **/
	@AfterTest
	public void terminateTestRunnerConnection()
	{
		//Test Log
		Reporter.log("TestRunner terminated successfully", true);
	}
	
	/**
	 * This method used to configure the Database or Advance report connection
	 * @param
	 **/
	@BeforeSuite
	public void getReportConnection()
	{
		//Create the SparkReport
		spark = new ExtentSparkReporter("./AdvanceReports/report.html");
		
		//Configure the SparkReport information
		spark.config().setDocumentTitle("FunctionalityTest||QaFox");
		spark.config().setReportName("FunctionalitySuite||Verify User able to add Desktop-Mac-product");
		spark.config().setTheme(Theme.STANDARD);
		
		
		//Create the Extent Report
		report = new ExtentReports();
		
		//Attach the Spark Report and Extent Report
		
		report.attachReporter(spark);
		
		//Configure the System information in Extent Report
		report.setSystemInfo("DeviceName:", "pragnya");
		report.setSystemInfo("Operating System:", "WINDOWS 11");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("BrowserVersion:", "chrome-131.0.6778.206");

		//Test Log
		Reporter.log("getting report connection successfully", true);
	}
	
	/**
	 * This method used to terminate the Database or Advance report connection
	 * @param
	 **/
	@AfterSuite
	public void terminateReportConnection()
	{
		//Flush the Report Information
		report.flush();
		
		//Test Log
		Reporter.log("terminate report connection successfully", true);
		
	}
	
	public void initobjects()
	{
		webdriverobj = new WebDriverLibrary();
		excelutilityobj = new ExcelFileLibrary();
		propertyfileobj = new PropertyFileLibrary();
		javautilityobj = new JavaLibrary();
		jsutilityobj = new JavaScriptLibrary();
		tsutilityobj = new TakesScreenshotLibrary();
	}
	
	
}
