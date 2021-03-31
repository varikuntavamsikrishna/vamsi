package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Boolean {
	public WebDriver driver;
	
	
  @Test
  public void Boolean_TrueORFalse() {
	  
	  //Switching to Roundtrip
	  driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-home-container[1]/div[1]/app-home[1]/div[1]/div[2]/div[2]/app-outstation[1]/div[1]/div[1]/div[1]/label[2]")).click();
	  
	  //Print Condition True or False	  
	boolean printcondition = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-home-container[1]/div[1]/app-home[1]/div[1]/div[2]/div[2]/app-outstation[1]/div[1]/div[1]/div[1]/label[2]")).isDisplayed();
	  
	System.out.println(printcondition);
	
	
	
	WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-home-container[1]/div[1]/app-home[1]/div[1]/div[2]/div[2]/app-outstation[1]/div[1]/div[1]/div[1]/label[2]"));
	
	
			
			if (element.isEnabled()) {
				
				System.out.println("Passed");
				
			} else {
				
				System.out.println("Fail");
			}
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http:/savaari.com");
	  driver.manage().window().maximize(); 
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
