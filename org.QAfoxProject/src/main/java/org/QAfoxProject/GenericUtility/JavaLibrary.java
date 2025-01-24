package org.QAfoxProject.GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This class contains reusable methods to perform java related operations
 * @author pragnya
 */
public class JavaLibrary {

	/**
	 * This method is used to pause the script execution for specific time
	 @param time*/
	
	public void pause(long time)
	{
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to fetch the current time
	 @param time*/
	
	public String getCurrentTime()
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return sdf.format(date);
	}
	
	/**
	 * This method is used to generate the random number
	 @param time*/
	
	public int generateRandomNum(int limit)
	{
		Random random = new Random();
		return random.nextInt(limit);
	}
	
	
	
	
	
	
}
