package testNG;

import org.testng.annotations.Test;

public class Class1 {
	@Test(groups="Regression")
	public void mtd1()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method1");
	}
	
	
	@Test(groups="smoke")
	public void mtd5()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method5");
	}

}
