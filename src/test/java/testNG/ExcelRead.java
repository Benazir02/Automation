package testNG;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelRead {
	
	
	
	
	@DataProvider
	public String[][] getData() throws EncryptedDocumentException, IOException 
	{
		String excelsheetname="Sheet3";
		File f= new File(System.getProperty("user.dir") +"\\src\\test\\resources\\TestData\\testdata.xlsx");
		//Step 1  File location
		FileInputStream fis =new FileInputStream(f);  //read the file
		
		//Step 2:
		Workbook wb = WorkbookFactory.create(fis);
		
		//Step 3 Reading sheet
		Sheet sheetname = wb.getSheet(excelsheetname);
		
		//Step 4 Find the no of rows and columns
		
		
		int rows = sheetname.getPhysicalNumberOfRows();
		
		System.out.println("No.Of Rows" +rows);
		
		int column = sheetname.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No.of colums" +column);
		
		
		//Step 5 Data formatter
		
		DataFormatter format =new DataFormatter();
		String[][] testdata=new String[rows][column];
		
		for(int row=1;row<rows; row++)
		{
			for(int col=0;col<column;col++)
			{
			testdata[row-1][col]=format.formatCellValue(sheetname.getRow(row).getCell(col));	
			
			System.out.println(testdata[row-1][col]);
			}
		}
			
			return testdata;
		
	}
}
	
	
	
		
		
	
		
		
		
	


