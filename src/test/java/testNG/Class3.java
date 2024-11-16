package testNG;

import org.testng.annotations.Test;

public class Class3 {
	@Test(groups="smoke")
	public void mtd3()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 3");
	}
	
	@Test(groups="Regression")
	public void mtd4()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 4");
	}



}
