package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Array {
	public WebDriver driver;
	
	
  @Test
  public void Array_string() throws Exception {
	  
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  
	  Thread.sleep(5000);
	  
	  String str = driver.findElement(By.xpath("//ul[@role='listbox']")).getText();
	  
	  //selenium to Selenium Grid all Text should show
	  System.out.println(str);
	  
	  
	  //Total characters of string
	  System.out.println(str.length());
	  
	  
	   String a[] = str.split("\n");
	   
	   //java.lang.string aski code
	System.out.println(a);
	
	//Total array count number
	 System.out.println(a.length);
  
	 
	 
	 for (int i = 0; i < a.length; i++) {
		 
		 
		 if (a[i].equalsIgnoreCase("selenium Testing")) {
			 
			 
			 //Require value matches only ---> clear the store value 
			 driver.findElement(By.name("q")).clear();
				Thread.sleep(5000);
				
				driver.findElement(By.name("q")).sendKeys(a[i]);
				Thread.sleep(5000);
				
				//Targated value once its equals show it finally
				System.out.println(a[i]); 
				break;
			}	
		 
				//clear the first stored value to enter the new one as per the list
		driver.findElement(By.name("q")).clear();
		
			Thread.sleep(5000);
			
			driver.findElement(By.name("q")).sendKeys(a[i]);
			
			Thread.sleep(5000); 
	 } 
	 
  }
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  
	  
	  
	  
  }
  
  

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
