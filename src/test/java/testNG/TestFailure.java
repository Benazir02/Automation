package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFailure {
	static WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.id("emai")).sendKeys("java@gmail.com");
	}
	
	@AfterTest
	public void quit()
	{
		driver.close();
	}
	
	
	
	public static void captureScreenshot()
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshotfailed/fb " +System.currentTimeMillis()+" .png");
		
		try {
			FileUtils.copyFile(temp,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
