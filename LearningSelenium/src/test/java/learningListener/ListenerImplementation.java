package learningListener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation extends BaseTest implements ITestListener {
	
	public void onTestFailure(ITestResult result)
	{
		String methodname = result.getName();
		
		TakesScreenshot ts =(TakesScreenshot)BaseTest.staticdriver;
		
		String timestamp = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss").format(new Date());
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./TestScreenshot/m1.png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
