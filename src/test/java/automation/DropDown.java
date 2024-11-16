package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetup("chrome");  //browser setup
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		
		//driver.switchTo().frame("singleframe");
//		WebElement frames = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
//		driver.switchTo().frame(frames);
		//driver.switchTo().frame(1);
//		
//		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
//		
//		WebElement outerframes = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
//		driver.switchTo().frame(outerframes);
//		
//		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
//		driver.switchTo().frame(innerframe);
//		
//	
//		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
//		
//		driver.switchTo().parentFrame();
//		
//		WebElement text = driver.findElement(By.xpath("//h5[text()='Nested iFrames']"));
//		String text2 = text.getText();
//		System.out.println(text2);
//		
//		
//		driver.switchTo().defaultContent();
//		 driver.findElement(By.xpath("//a[@href='#Single']")).click();
//		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//global wait/implict wait
//		
//		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
		driver.findElement(By.xpath("//button[@id='accept']")).click();
//		
//		//explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, null);
//		Alert alt = wait.until(ExpectedConditions.);
//		alt.accept();
//		
//
//		
//		
//		
		
		
		
		
//		
//		//explict wait
//		
//		WebDriverWait wait = new WebDriverWait(driver, 2)
//		
//		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
	  	
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
//		//Bootstarap dropdown
//		
//		List<WebElement> options = driver.findElements(By.xpath("//select[@id='lang']/child::option"));
//		
//		for(WebElement opt:options)
//		{
//			if(opt.getText().equals("Python"))
//			{
//				opt.click();
//			}
//		}
	}

}
