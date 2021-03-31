package Alert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlertType {
	
	
	public WebDriver driver;
	
	
  @Test
  public void Alert() throws Exception  {
	  
	  driver.findElement(By.id("promtButton")).click();
	  
		Thread.sleep(10000);
		
	  //driver.switchTo().alert().accept();
	  
	  driver.switchTo().alert().dismiss();
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts"); 
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
  }

  
  
}
