package automation;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver browserSetup(String browser)
	{
		WebDriver driver=null;
		switch (browser)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver(); 
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			break;
			
			default:
				System.out.println("please provide valid browser name");
			
		}
		
		
		System.out.println("changes made");
		System.out.println("Add the changes");
		
		
		return driver;
	}
	
	
	

}
