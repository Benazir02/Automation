package testNG;


import org.testng.Assert;

import org.testng.annotations.Test;

public class TestCase {
	@Test
	
	public void tCase1()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void tCase2()
	{
		Assert.assertEquals(true, false);
	}
	
	@Test(dependsOnMethods="tCase2")
	public void tCase3()
	{
		Assert.assertTrue(true);
	}

}
