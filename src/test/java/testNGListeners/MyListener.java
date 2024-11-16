package testNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testNG.TestFailure;

public class MyListener extends TestFailure implements ITestListener {
	
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("On Test Start");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("On Test success");
	}
	
	public void onTestFailure(ITestResult result)

	{
		System.out.println("On Test Failure");
		captureScreenshot();
		
		
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("On Test Skipped");
	}
	
	public void onStart(ITestContext context)
	{
		System.out.println("On Start");
	}
	
	public void onFinish(ITestContext context)
	{
		System.out.println("On Finish");
	}
	
}
