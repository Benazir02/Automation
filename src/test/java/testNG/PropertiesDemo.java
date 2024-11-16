package testNG;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Admin\\eclipse-workspace5\\automation\\src\\test\\resources\\congfigFile\\config.properties");
		
		FileReader fr= new FileReader(f);
		
		Properties prop= new Properties();
		
		prop.load(fr);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		
		
		
		
		
	}

}
