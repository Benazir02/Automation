package extentReports;

import org.testng.annotations.AfterTest;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ExtentReportDemo {
	
	ExtentReports extent;
	ExtentSparkReporter spark;
	ExtentTest test;
	
	WebDriver driver;
	
	@BeforeTest
	public void browserStart()
	{
		
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\extentreport1.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
	}
	
	
	@Test
	public void checkTitle()
	{
		test=extent.createTest("Check Title").assignAuthor("Oranium").assignCategory("Sample");
		
		String title = driver.getTitle();
		if(title.equals("Google"))
		{
			test.pass("Title matched");
		}
		else
		{
			test.fail("Title not matched" +title);
		}
	}
	
	
	@Test
	public void clickLink() throws IOException
	{
		test=extent.createTest("Click Link").assignAuthor("prakash").assignCategory("home page");
		try
		{
		driver.findElement(By.linkText("images")).click();
		}
		catch(Exception e)
		{
			test.fail("Excepetion handled: " +e.getMessage());
			test.addScreenCaptureFromPath(captureScreenshot());
			System.out.println("Exception handled");
		}
	}
		
	
	
	
	
	@AfterTest
	public void end()
	{
		driver.quit();
		extent.flush();            //This will save the report in the respective folder
	}
	
	
	
	public String captureScreenshot() throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshotfail/google" +System.currentTimeMillis()+ ".png");
		
		FileUtils.copyFile(temp, dest);
		
		String absolutePath = dest.getAbsolutePath();
		return absolutePath;
		
		
		
	}

}
