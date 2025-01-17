package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class WritedatatoPropertyFile {

	
	@Test
	public void task() throws IOException {
		
		//Steps to fetch the data from external resources - property file
		//1.convert the physical file to java understandable
			FileInputStream fis =new FileInputStream("./Data/commondata.properties");
		
		//2.create an object for properties class
			Properties propertyobj= new Properties();
			
		//3.call the non static method--to load the property
			propertyobj.load(fis);
			
		//4.call the non static method -- to write the property key and value
			propertyobj.put("application", "Eclipse");
			
		//5.convert the java file to physical file
			FileOutputStream fos = new FileOutputStream("./Data/commondata.properties");
			
		//6.store the propertyfile
			propertyobj.store(fos, "Updates latest data");
			
}
}
