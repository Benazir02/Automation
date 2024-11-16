package com.pages;

import org.openqa.selenium.By;

import baseTest.BaseClassDemo;

public class LoginPage extends BaseClassDemo {
	
	
	//locators
	
	By uname= By.id("email");
	By pwd=By.id("pass");
	By login=By.name("login");
	By forget_pwd=By.linkText("Forgotten password?");
	
	//Action/Methods
	public void login()
	{
		driver.findElement(uname).sendKeys("oranium@gmail.com");
		driver.findElement(pwd).sendKeys("1234");
		driver.findElement(login).click();
				
	}
	
	
	public boolean checkLink()
	{
		boolean status = driver.findElement(forget_pwd).isDisplayed();
		return status;
	}
	

}
