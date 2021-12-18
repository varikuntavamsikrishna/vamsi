package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.This;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<>();
	
	/**
	 * this method is used to intialize the threadlocal driver on the basis of given browser
	 * @return this will return tlDriver.
	 */
	public WebDriver init_driver(String browser) {
		
		System.out.println("browser value is: "+ browser);
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		} else {
			System.out.println("Please pass the correct browser value: "+ browser);
		}
		
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	/**
	 * this is used to get the driver with threadlocal
	 * @return
	 */
	public static synchronized WebDriver getDriver() {
		return tlDriver.get(); 
	}

}
