package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Generic {
	
	public WebDriver driver;
	
	public Actions action;
	
	public void generic(String str) throws Exception{
		action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(str));
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
	}
	
  @Test
  public void Generiic() throws Exception {
	  

	  for (int i = 1; i <=9; i++) {
		  
		 // generic(".//*[@id='fk-mainhead-id']/div[2]/div/div/ul/li["+i+"]/a/span");
	generic("//*[@id=\"container\"]/div/div[2]/div/div/div["+i+"]/a/div[1]/div/img");
	  }
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.get("http://www.flipkart.com/");
	  System.out.println(driver.getTitle());
	  driver.manage().window().maximize();
  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
