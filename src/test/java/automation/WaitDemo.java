package automation;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {
	public static void main(String[] args) {
		
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.manage().window().maximize();
		
		
		driver.get("https://letcode.in/waits");
		
		driver.findElement(By.xpath("//button[@id='accept']")).click();
		
		//explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
		alt.accept();				
		
		
	}
	}
		

