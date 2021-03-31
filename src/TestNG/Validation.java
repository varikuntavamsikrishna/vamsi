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


public class Validation {
	
	public WebDriver driver;
	
  @Test
  public void Values_Validation() {
	 List<WebElement> values = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getOptions(); 
	  
	 System.out.println(values.get(3).getText());
	 
	 if(values.get(3).getText().equalsIgnoreCase("INR")) {
		 
		 System.out.println("INR Its there! Iam Passed");
	 }
	 else {
		System.out.println("Doesnt Matches Failed"); 
	 }
	  
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
