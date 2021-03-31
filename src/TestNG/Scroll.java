package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Scroll {
	
	public WebDriver driver;
	
	
  @Test
  public void Scrollflow() {
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;

      //Find element by link text and store in variable "Element"        		
      WebElement Element = driver.findElement(By.linkText("Linux"));

      //This will scroll the page till the element is found		
      
      js.executeScript("arguments[0].scrollIntoView();", Element);
	  
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("http://demo.guru99.com/test/guru99home/");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
