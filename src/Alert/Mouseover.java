package Alert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Mouseover {
	
	public WebDriver driver;
	
	public Actions action;
	
	
  @Test
  public void f() throws Exception {
	  
	  action = new Actions(driver);
	  
		//WebElement ele1 = driver.findElement(By.linkText("SwitchTo"));
		
		//action.moveToElement(ele1).build().perform();
	 // WebElement ele1 = driver.findElement(By.linkText("Widgets"));
	 // action.moveToElement(ele1).build().perform();
	  
	  WebElement ele1 = driver.findElement(By.linkText("Video"));
	  
	  
	  action.moveToElement(ele1).build().perform();
		  
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Frames")).click(); 
		//driver.findElement(By.linkText("Slider")).click();
		driver.findElement(By.linkText("Youtube")).click();
		
		
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
