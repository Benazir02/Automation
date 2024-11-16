import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	WebDriver driver;
	@BeforeTest
	@Parameters({"browser"})
	public void setUp(String browser)
	{
		switch( browser)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
		
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
		}
		driver.get("https://www.google.com/");
	}
	
	@AfterTest
	public void quitDriver()
	{
		driver.quit();
	}
	
	@Test
	public void googleTitle()
	{
		String title = driver.getTitle();
		Assert.assertEquals(title,"google");
		}

}
