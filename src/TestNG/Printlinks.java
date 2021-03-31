package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Printlinks {
	
	public WebDriver driver;
	
	
  @Test
  public void clickable() {
	  
	  driver.findElement(By.name("q")).sendKeys("teams");
	  
	  List<WebElement> allvalueslist = driver.findElements(By.xpath("//ul[@role='listbox']"));
	  
	  for(int i = 0; i < allvalueslist.size();i++) {
	  
	  System.out.println(allvalueslist.get(i).getText());
	  
	  if (allvalueslist.get(i).getText().equalsIgnoreCase("teams microsoft")) {
		  
		  allvalueslist.get(i).click();
		  break;
		
	}
  }  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.get("https://google.com");
	  System.out.println(driver.getTitle());
	  driver.manage().window().maximize();

	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
