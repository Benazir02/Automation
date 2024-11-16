package testNG;

import org.testng.annotations.Test;

public class Class2 {
	
	@Test(groups="sanity")
	public void mtd2()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 2");
	}
	
	@Test(groups={"sanity","Regression"})
	public void mtd6()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 6");
	}


}
