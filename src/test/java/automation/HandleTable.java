package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleTable {
	public static void main(String[] args) {
		
		WebDriver driver = BaseClass.browserSetup("chrome");
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		
		//to find the no. of rows
		
		int rows = allrows.size();
		System.out.println(rows);
		
		//to find the no. of cloumns
		
		List<WebElement> allcolumns = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		
		int columns = allcolumns.size();
		System.out.println(columns);
		
		
		
		//1. To read all the data in the table
		
//		for(int row=2 ; row<=rows;row++)
//		{
//			for(int col=1;col<=columns;col++ )
//			{
//				String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" +row+ "]/td[" +col+ "]")).getText();
//				System.out.print(text +" ");
//			
//				
//			}
//			System.out.println();
//		}
//		
		
//		2. read the data based on specific condition
//		eg :when Author name is animesh print the bookname
		
		
		for(int r=2; r<=rows;r++)
		{
			
		String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" +r+ "]/td[2]")).getText();
		
		if(author.equals("Animesh"))
		{
			String book = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" +r+ "]/td[1]")).getText();
			System.out.println(book);
		}
			
		
		
		
	}

}
}
