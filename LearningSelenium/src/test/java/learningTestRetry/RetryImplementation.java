package learningTestRetry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImplementation extends BaseClass implements IRetryAnalyzer {

	int count = 1;
	@Override
	public boolean retry(ITestResult result)
	{
		int retryuntil = 2;
		boolean flag = false;
		
		
		if(count < retryuntil)
		{
			count++;
			flag=true;
		}
		
		return flag;
	}
}
