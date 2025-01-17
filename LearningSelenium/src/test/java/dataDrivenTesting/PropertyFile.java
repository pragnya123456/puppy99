package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFile {

	@Test
	public void task() throws IOException {
		
		//Steps to fetch the data from external resources - property file
		//1.convert the physical file to java understandable
			FileInputStream fis =new FileInputStream("./Data/commondata.properties");
		
		//2.create an object for properties class
			Properties propertyobj= new Properties();
			
		//3.call the non static method--to load the property
			propertyobj.load(fis);
			
		//4.call the non static method -- to fetch the property value--by passing keys
			String data = propertyobj.getProperty("url");
			
		//print the data
			System.out.println(data);
	}
}
