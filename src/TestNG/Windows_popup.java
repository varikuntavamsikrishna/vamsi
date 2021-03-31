package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

public class Windows_popup {
	public WebDriver driver;
	
  @Test
  public void Windowspopup() throws Exception {
	  
	  //Clicks on windows
	  driver.findElement(By.id("messageWindowButton")).click();
	  Thread.sleep(3000);  
	  
	//comeback to Parent window handle
	  String moveto_parentwindow = driver.getWindowHandle();
	  
	  
	 
	  //Child window handle
	  for(String winhandle : driver.getWindowHandles()) {
		  
		  driver.switchTo().window(winhandle);
		  Thread.sleep(2000);
	  }
	  
	String var1 = driver.findElement(By.xpath("/html[1]/body[1]")).getText();
	System.out.println(var1); 
	  
	  Thread.sleep(3000);
	  
	  //Again Switch focus back to Parent window
	 driver.switchTo().window(moveto_parentwindow);
	Thread.sleep(3000);
	  
	//driver.findElement(By.id("tabButton")).click();
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("https://demoqa.com/browser-windows");
		  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
