package testNG;



import org.openqa.selenium.By;

import org.testng.annotations.Test;

import baseTest.BaseClassDemo;

public class FbLogin extends BaseClassDemo {
	
	@Test(dataProviderClass =ExcelRead.class , dataProvider="getData")
	public void fbLogin(String uname, String pwd)
	{
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
	}

}
