package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DataDriven {
	WebDriver driver;
	@Parameters({"URL"})
	@Test(priority=0)
	
	public void urlLaunch(String url)
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
		
	}
	
	@Parameters({"username","password"})
	@Test(priority=1)
	public void login(String uname, String pass)
	{
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
	}

}
