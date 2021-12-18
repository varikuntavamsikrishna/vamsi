package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop;
	/**
	 * This Method is used for load properties from config.properties file
	 * @return it returns properties prop object
	 */
	
	public Properties init_prop() {

			prop = new Properties();
			try {
				FileInputStream ip= new FileInputStream("./src\\test\\resources\\config\\config.properties");
				try {
					prop.load(ip);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			return prop;
	}

}
