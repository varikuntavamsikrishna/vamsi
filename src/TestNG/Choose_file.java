package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Choose_file {
	public WebDriver driver;
  @Test
  public void choosefile() throws Exception {
	  
	WebElement ele = driver.findElement(By.id("myFile"));
	
	 Thread.sleep(5000);
	 
	ele.sendKeys("C:\\Users\\sruthi\\Desktop\\Capture.JPG1.JPG");
	
	//Click function AutoIt concept
	//WebElement ele = driver.findElement(By.id("myFile")); ele.click();
	 //Runtime.getRuntime().exec("C:\\Users\\sruthi\\Downloads\\swammy by selenium\\autoit files\\vamsi1.exe"); 
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
	  driver.manage().window().maximize();
	 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }

  
  @AfterTest
  public void afterTest() {
	  
	  
  }
  

}
