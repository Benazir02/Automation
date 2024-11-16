package automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {
	public static void main(String[] args) {
		
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--incognito");
		
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		
	}

}
