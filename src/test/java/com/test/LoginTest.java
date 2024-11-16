package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseClassDemo;

public class LoginTest extends BaseClassDemo {
	@Test(priority=0)
	public void checkForget_Pwd()
	{
		boolean checkLink = fblogin.checkLink();
		Assert.assertTrue(checkLink);
	}
	
	@Test(priority=1)
	public void login()
	{
		fblogin.login();
	}

}
