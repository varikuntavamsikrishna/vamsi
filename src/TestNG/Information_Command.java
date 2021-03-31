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

public class Information_Command {
	public WebDriver driver;
	
	
  @Test
  public void Gmail() {
	  String str1 = driver.findElement(By.linkText("Gmail")).getText();
	  System.out.println(str1);
	  
  }
  
  @Test(priority = 2)
  public void google_image() throws Exception {
	   
	 String str2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).getAttribute("alt");
	 System.out.println(str2);
	 
  }
  
  @Test(priority = 3)
  public void searchbutton() throws Exception {
	  
	String str3 =  driver.findElement(By.name("btnK")).getAttribute("value");
	System.out.println(str3);
	
	  String screenshot = "vamsi";
	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(scrFile, new File("C:\\Users\\sruthi\\Downloads\\screenshots\\"+screenshot+".png"));
	
  }
  
  @BeforeTest
  public void beforeTest() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http:/google.com");
	  driver.manage().window().maximize();
	  
  }

  
  @AfterTest
  public void afterTest() {
	
	  
  }

}
