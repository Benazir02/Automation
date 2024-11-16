package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {
	
	
	@Test
	
	public void login()
	{
		Assert.assertTrue(false);
		System.out.println("After Assert");
	}
	
	
	
	//softAssert
	@Test
	public void home()
	{
		SoftAssert s= new SoftAssert();
		s.assertTrue(false);
		System.out.println("After Soft Assertion");
		s.assertAll();
	}
}


