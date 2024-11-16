package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Attributes {
	@Test(priority=0, description="test for login")
	
	public void login()
	{
		System.out.println("login chek");
		Assert.assertTrue(false); //hard Assert
	}
	
	
	@Test(priority=-1, description="Test for home page", dependsOnMethods="login", alwaysRun=true)
	public void home() {
		System.out.println("home page check");
		
	}
	
	
	@Test(invocationCount=10, invocationTimeOut=5000)
	public void product() {
		System.out.println("product page check");
	}
	
	
	@Test(timeOut=2000)
	public void cart() throws InterruptedException
	{
		//Thread.sleep(3000);
		System.out.println("cart check");
	}
	
	
	@Test(expectedExceptions=Exception.class)
	public void sum()
	{
		int c= 20/0;
		System.out.println(c);
	}

}
