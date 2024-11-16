package baseTest;




import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import com.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassDemo {
	
	public static LoginPage fblogin=new LoginPage();
	
	public static WebDriver driver;
	Properties prop;
	@BeforeMethod
	public void setup() throws IOException
	{
	if(driver==null)
	{
		File f=new File("C:\\Users\\Admin\\eclipse-workspace5\\automation\\src\\test\\resources\\congfigFile\\config.properties");
		
		FileReader fr= new FileReader(f);
		
		prop= new Properties();
		
		prop.load(fr);
		
	}
	
	
	if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		
	}
	
	else
	{
		System.out.println("pass the valid browser");
	}
	
	

	}
	
	@AfterMethod
	public void termDriver()
	{
		driver.quit();
	}

	

}
