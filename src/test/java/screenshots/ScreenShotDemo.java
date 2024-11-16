package screenshots;

import java.awt.AWTException;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import automation.BaseClass;

public class ScreenShotDemo {
	
	public static void completeScreenshot() throws AWTException, IOException
	{
		Robot r= new Robot();   //import from java.awt //add throws awt declartion
		
		//get screen size
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect= new Rectangle(d); //import from java.awt 
		//captures the screenshot 
		//stores the screenshot in temporary location
		BufferedImage b = r.createScreenCapture(rect);
		
		//destination loaction
		File des = new File("./screenshot/screen "+System.currentTimeMillis()+".png");
		
		//stores or copies the source image to destination folder
		ImageIO.write(b,"png",des);	
		
		
	}
	
	
	
	
	public static void screenShot(WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;   //we have downcasted to driver
		
		File screenshot =ts.getScreenshotAs(OutputType.FILE);   //take screenshot & store it in temporary file
		
		File dest=new File("./screenshot/facebook "+System.currentTimeMillis()+".png");   //creates a destination folder and stores the screenshot
		
		
		FileUtils.copyFile(screenshot, dest);    //copy the source file to the destintion folder
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
//		screenShot(driver);
		completeScreenshot();
		
		driver.findElement(By.id("pass")).sendKeys("123456");
//		screenShot(driver);
		completeScreenshot();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
//		screenShot(driver);
		completeScreenshot();
	}

}
