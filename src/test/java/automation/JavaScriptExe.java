package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExe {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		WebElement choosefile = driver.findElement(By.id("input-4"));
		
		Thread.sleep(5000);
		
		choosefile.sendKeys("C:\\Users\\Admin\\Desktop\\Oranium Tech\\Java 05-20-2024.txt");
		
		driver.findElement(By.xpath("//span[text()='Upload']")).click();		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		driver.get("https://jqueryui.com/datepicker/");
//		
//		driver.switchTo().frame(0);
//		
//		WebElement input = driver.findElement(By.id("datepicker"));
//		
//		input.sendKeys("21/08/2024");
//		
//		//2nd way
//		
//		
//		//format mm/dd/yy
//		input.click();
//		
//		String month="September";
//		String date="5";
//		String year="2025";
//		
//		while(true)
//		{
//			String  mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//			String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//			
//			if(mon.equals(month) && yr.equals(year))
//			{
//				break;
//			}
//			else
//			{
//				driver.findElement(By.xpath("//span[text()='Next']")).click();
//			}
//			
//		}
//		
//		//to pick date
//		
//		List<WebElement> alldate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td/a"));
//		
//		for(WebElement dat:alldate )
//		{
//			String datee = dat.getText();
//			
//			if(datee.equals(date))
//			{
//				dat.click();
//			}
//		}
//		
//		
//		
		
		
		
		
		
		
		
		
		//drawing border to highlight
		
//		WebElement search = driver.findElement(By.name("search"));
//		
//		//creating object for JavaScriptExecutor
//		
//		
		
//		js.executeScript(" arguments[0].value='java';", search);
		
		
		//scrolling using Js Executor
		
	
		
		
		//scrolling using pixel
		
//		js.executeScript("window.scrollBy(0,3000);");
		
		
		//scrolling till a particular element
		
		
//		WebElement history = driver.findElement(By.id("History"));
		
//		js.executeScript("arguments[0].scrollIntoView(true);",history);
		
		//scroll from one elemnt to another element
		
//		WebElement colonial = driver.findElement(By.id("Colonial_periods"));
//		
//		js.executeScript("arguments[0].scrollIntoView(true); arguments[1].scrollIntoView(true);" ,history,colonial);
//		
		
		
		
		
	}

}
