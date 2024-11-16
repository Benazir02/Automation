package automation;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= BaseClass.browserSetup("chrome");
		driver.manage().window().maximize();  //maximize the chrome window

		driver.get("https://demo.automationtesting.in/Alerts.html");
		
//		driver.findElement(By.xpath("//button[contains(text(), 'click the button to display an  alert box:')]")).click();
//		
//		Alert alt1 = driver.switchTo().alert();
//		alt1.accept();
		
//		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
//		
//		Alert alt2 = driver.switchTo().alert();
////		alt2.accept();
//		alt2.dismiss();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
		
		Alert alt3 = driver.switchTo().alert();		
		alt3.sendKeys("selenium");
		alt3.accept();
		
		
		
		
		
//		driver.get("https://www.qa-practice.com/elements/checkbox/mult_checkbox");  //opens the url
//		List<WebElement> checboxes = driver.findElements(By.xpath("//input[@name='checkboxes']"));
//	
//		for(WebElement checkbox:checboxes) 
//		{
//			String attribute = checkbox.getAttribute("value");
//			if(attribute.equals("one") || attribute.equals("three"))
//			checkbox.click();
//		}
	
	
	
	
		
//		for(WebElement checkbox:checboxes)
//		{
//			String color = checkbox.getAttribute("value");
//			if(color.equals("yellow") || color.equals("orange"))
//			checkbox.click();
//		}
		
		
		//using normal for loop
		
//		for(int i=0;i<checboxes.size();i++)
//		{
//			if(i==2 || i==4)
//			checboxes.get(i).click();
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		WebElement input = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
//		input.sendKeys("chennai");
//		String attribute = input.getAttribute("value");
//		System.out.println(attribute);
//		
//		
//		String attribute2 = input.getAttribute("aria-owns");
//		System.out.println(attribute2);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.navigate().to("https://www.google.com/");
//		
//		Thread.sleep(5000);
//		
//		driver.navigate().refresh();
//		driver.navigate().to("https://www.facebook.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().back();
//		driver.navigate().to("https://www.amazon.in/");
//		
//		
//		driver.close();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		
//		
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
//	
//		
		
		
		
//		email.sendKeys("abc@gmail.com");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		input.sendKeys(Keys.ENTER);
		
		
		//open the url
//		WebElement input = driver.findElement(By.className("form-control form-control-lg"));
//		input.click();
//		input.sendKeys("phone");
//		
		
		
		
		
		
		
//		WebElement input = driver.findElement(By.className("truncate"));
//		
//		input.sendKeys("iphone");
//		List<WebElement> inputs = driver.findElements(By.tagName("input"));
//		System.out.println(inputs.size());
//		Thread.sleep(5000);
//		driver.close();
	}
		
	}
//class=

