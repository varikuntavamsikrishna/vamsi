package com.web.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFile", 
		monochrome=true, dryRun=false, glue="com.web.automation.stepdefinition",
				plugin = { "json:target/cucumber-reports/Cucumber.json",
						 "junit:target/cucumber-reports/Cucumber.xml",
						 "html:target/cucumber-reports","pretty:target/cucumber-pretty.txt",
						 "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Reports/extentreport.html"
						 }
		)
public class TestRunner {
	
	@BeforeClass
	public static void setReportConfiguration() 
	{
		ExtentProperties property= ExtentProperties.INSTANCE;
		property.setReportPath("./Reports/extentreport.html");
		
	}
	
	@AfterClass
	public static void writeConfiguration()
	{
		//Reporter.loadXMLConfig("./ConfigFiles/extent-config.xml");
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	     Reporter.setSystemInfo("Machine", "Windows 07 " + "64 Bit");
	     Reporter.setSystemInfo("Selenium", "3.7.0");
	     Reporter.setSystemInfo("Maven", "3.5.2");
	     Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}

}
