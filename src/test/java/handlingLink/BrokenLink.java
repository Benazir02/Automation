package handlingLink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.BaseClass;

public class BrokenLink {
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.manage().window().maximize();
		
		driver.get("https://www.softwaretestingmaterial.com/");
		
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		int sum=0;
		for(WebElement tag:alltags)
		{
			String url = tag.getAttribute("href");
			HelperBrokenLink.brokenLinkCheck(url);
//			sum=sum+count;
			
		}
		System.out.println("The no. of broken link:" +sum);
	}

}
