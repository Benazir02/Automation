package testNGListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {
	
	int mincount=0;
	int maxcount=4;

	@Override
	public boolean retry(ITestResult result) {
		
		while(mincount<maxcount)
		{
			mincount++;
			return true;
		}
			
		
		return false;
	}

}
