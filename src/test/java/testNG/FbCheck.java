package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseClassDemo;

public class FbCheck extends BaseClassDemo {
	@Test
	public void titleCheck()
	{
		String title = driver.getTitle();
		String exptitle="Facebook – log in or sign up";
		System.out.println(title);
		Assert.assertEquals(title,exptitle);   //hard assertion
	}

}
