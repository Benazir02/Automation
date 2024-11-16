package automation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsDemo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.manage().window().maximize();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		input.sendKeys("java");
		input.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	
		
//		String windowid = driver.getWindowHandle();
//		System.out.println(windowid);
		
//		driver.findElement(By.xpath("//a[text()='Java']")).click();
		
		List<WebElement> allink = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/div/a"));
		for(WebElement links : allink)
		{
			links.click();
			}
		
		String windowHandle = driver.getWindowHandle();	
		System.out.println(windowHandle);
		
		Set<String> allhandle = driver.getWindowHandles();
		
//		for(String handle: allhandle)
//				
//		{
//			driver.switchTo().window(handle);
//			String title = driver.getTitle();
//			System.out.println(title);
//		}
		
		//to move to particular window
		
//		for(String handle: allhandle)
//		{
//			driver.switchTo().window(handle);
//			String title = driver.getTitle();
//			if(title.equals("Java (programming language) - Wikipedia"))
//			{
//				System.out.println(title);
//				driver.close();
//			}
//		}
//		
		
		//converting set to list  bcos list is index based
		
		List<String> l = new ArrayList<>(allhandle);
		for(String a: l)
		{
			driver.switchTo().window(l.get(3));
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}
		
		
	}

}
