package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Creataccount {
	
	public WebDriver driver;
	
	
  @Test
  public void f() {
	  
	  driver.findElement(By.name("firstname")).sendKeys("vamsi");
	    driver.findElement(By.name("lastname")).sendKeys("krish");
	    driver.findElement(By.name("reg_email__")).sendKeys("9656451239");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("vamsi");

	  new Select(driver.findElement(By.id("day"))).selectByVisibleText("8");
	    
	   new Select(driver.findElement(By.id("month"))).selectByVisibleText("Dec");
	    
	   new Select(driver.findElement(By.id("year"))).selectByVisibleText("1993");
	   
	        driver.findElement(By.name("sex")).click();

	   // driver.findElement(By.name("websubmit")).click();
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
