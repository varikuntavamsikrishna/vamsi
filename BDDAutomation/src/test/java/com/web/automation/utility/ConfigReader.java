package com.web.automation.utility;

import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {
	
	public static String readProjectConfiguration(String keyName)
	{
		String value=null;
		
		try {
			FileReader file = new FileReader("./ConfigFiles/ProjectConfiguration.properties");
			Properties readprop= new Properties();
			readprop.load(file);
			return readprop.getProperty(keyName).trim();
		} catch (Exception exception) {
			exception.printStackTrace();
			throw (new RuntimeException("******ERROR******:- Key withname "+keyName+" dosen't exists."));
		}
			
	}

	public static String readElementLoacator(String keyName)
	{
		String value=null;
		
		try {
			FileReader file = new FileReader("./ElementLocators/Locators.properties");
			Properties readprop= new Properties();
			readprop.load(file);
			return readprop.getProperty(keyName).trim();
		} catch (Exception exception) {
			exception.printStackTrace();
			throw (new RuntimeException("******ERROR******:- Key withname "+keyName+" dosen't exists."));
		}
			
	}
	
}
