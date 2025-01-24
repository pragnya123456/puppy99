package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

@Test

public class DemoTask {

	public void DemoTesting1() {
	//Create the SparkReport
	ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");
	
	//Configure the SparkReport information
	spark.config().setDocumentTitle("FunctionalityTest||QaFox");
	spark.config().setReportName("FunctionalitySuite||Verify User able to add Desktop-Mac-product");
	spark.config().setTheme(Theme.STANDARD);
	
	
	//Create the Extent Report
	ExtentReports report = new ExtentReports();
	
	//Attach the Spark Report and Extent Report
	
	report.attachReporter(spark);
	
	//Configure the System information in Extent Report
	report.setSystemInfo("DeviceName:", "pragnya");
	report.setSystemInfo("Operating System:", "WINDOWS 11");
	report.setSystemInfo("Browser:", "Chrome");
	report.setSystemInfo("BrowserVersion:", "chrome-131.0.6778.206");
	
	//Create the Test information
	ExtentTest test = report.createTest("FunctionalityTest");
	
	//Steps information
	test.log(Status.INFO, "Step 1:Launching The Browser Successful");
	test.log(Status.INFO, "Step 2:Navigate to the application via URL Successful");
	test.log(Status.PASS, "Step 3:Verified the webpage Successfully");
	
	if("pragnya".equals("pragnya"))
	{
		test.log(Status.PASS, "Step4: verified WebElement is Displayed");
	}
	else {
		test.log(Status.FAIL, "Step 4: verified Webelement is not displayed");
	}
	
	//test.log(Status.SKIP, "Step 5: verified Webelement is Hidden");
	
	//Flush the Report Information
	report.flush();
	
	System.out.println("execution done");
	
}
}
