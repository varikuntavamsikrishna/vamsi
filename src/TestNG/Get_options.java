package TestNG;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Get_options {
	public WebDriver driver;
	
	
  @Test
  public void GetAlloptions() {
	List<WebElement>allvalues = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getOptions();
	
	System.out.println(allvalues.get(0).getText());
	
	for(int i=0;i<allvalues.size();i++){
		
		System.out.println(allvalues.get(i).getText());
		System.out.println(" IT IS PASSED");
	}
	//else{
	//System.out.println("FAILED");
  //}
       }
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http:/spicejet.com");
	  driver.manage().window().maximize();
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
