package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Assert_Command {
	
	public WebDriver driver;
	
	
	
	
  @Test
  public void Assert() {
	  
	  String ExpectedTitle = "Welcome: Mercury Tours";
	  String ActualTitle = driver.getTitle();
	  
	  try {
		  
 org.testng.Assert.assertEquals(ExpectedTitle, ActualTitle);
		  
		  System.out.println("TitleMatched");
		
	} catch (Exception e) {
		
		// TODO: handle exception
		System.out.println("Not Equals");

	}
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/newtours/");
	  System.out.println(driver.getTitle());
	  driver.manage().window().maximize();
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
	  
	  
  }

}
