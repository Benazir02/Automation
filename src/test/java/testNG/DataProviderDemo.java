package testNG;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	
	WebDriver driver;
	
	
	@Test(priority=0 ,dataProvider="data")
	public void urlLaunch(String url)
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
		
	}
	
	@Test(priority=1, dataProvider="datas")
	public void login(String uname, String pass)
	{
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
//		driver.findElement(By.name("login")).click();
	}
	
	
	
	@DataProvider
	public Object[] data()
	{
		Object[] arr= {"https://www.facebook.com/"};
		return arr;
	}
	
	
	@DataProvider
	public Object[][] datas()
	{
		Object[][] tarr= { {"oranium@gmail.com", "abcd"},
				           {"java@gmail.com", "1234"} };
		
		return tarr;
	}

}
