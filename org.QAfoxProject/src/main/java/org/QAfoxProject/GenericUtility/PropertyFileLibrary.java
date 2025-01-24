package org.QAfoxProject.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

import com.aventstack.extentreports.model.Report;

/**
 * This class provides reusable method to perform CRUD in Excel File
 * @author pragnya*/

public class PropertyFileLibrary {

	FileInputStream fis;
	FileOutputStream fos;
	Properties propertyobj;
	
	
	public void initProperty()
	{
		//convert the physical file into java understandable
		try {
			fis = new FileInputStream(PathConstant.EXCEL_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	/**
	 * This method used to fetch the single data from excel file**/
	
	public String readProperty(String key)
	{
		propertyobj = new Properties();
		
		try {
			propertyobj.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return propertyobj.getProperty(key);
	}
		public void writeProperty(String key, String value)
		{
			//enter the data
			propertyobj.put(key, value);
				
			//create instance of FileOutputStream class
			try {
				fos = new FileOutputStream(PathConstant.PROPERTY_PATH);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//store the propertyfile
			try {
				propertyobj.store(fos, "Update latest data");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/* This method used to display the property file**/
		
		 public void displayProperty(String key)
			{
			 //fetch the data by calling getProperty
			 String data = propertyobj.getProperty(key);
			 
			 //display the data
			 Reporter.log(key + ";" + data, true);
			}
		
	}

