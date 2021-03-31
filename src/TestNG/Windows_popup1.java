package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class Windows_popup1 {
	public WebDriver driver;
	
  @Test
  public void popup() throws Exception {
	  
	  //Clicks on Seperate windows
	  driver.findElement(By.xpath("//a[@href='#Seperate'][contains(.,'Open New Seperate Windows')]")).click();
	  Thread.sleep(3000);  
	  
	  //Click_button
	  driver.findElement(By.xpath("//button[@class='btn btn-primary'][contains(.,'click')]")).click();
	  
	//comeback to Parent window handle
	  String moveto_parentwindow = driver.getWindowHandle();
	  
	  //Child window handle
	  for(String child_win_handle : driver.getWindowHandles()) {
		  
		  driver.switchTo().window(child_win_handle);
		  
	  }
	  
	
     //Clicks on Blog_Button
	driver.findElement(By.linkText("Blog")).click();
	  
	  
	  driver.close();
	  Thread.sleep(3000);
	  
	  //Again Switch focus back to Parent window
	  driver.switchTo().window(moveto_parentwindow);
	  Thread.sleep(3000);
	  
	  
	  //Clicks on Home_Button
		//driver.findElement(By.linkText("Home")).click();
	  driver.findElement(By.linkText("Video")).click();
	  driver.findElement(By.linkText("Youtube")).click();
	  
	  
	  String screenshot = "vamsi";
	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(scrFile, new File("C:\\Users\\sruthi\\Downloads\\screenshots\\"+screenshot+".png"));
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
