package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {
	public static void main(String[] args) throws AWTException {
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		Actions ac= new Actions(driver);
		
		ac.moveToElement(gmail).contextClick().build().perform();
		
		//robot class for keyboard operation
		
		
		Robot r= new Robot();
		
		for(int i=1;i<=3;i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
				
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
