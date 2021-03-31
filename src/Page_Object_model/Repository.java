package Page_Object_model;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Repository {

	public static WebDriver driver;
	
	//login
  @Test(priority = 1)
  public static void login() throws Exception {
	  
	  driver.findElement(Locators.username).sendKeys(TestData.username);
	  
	  driver.findElement(Locators.Password).sendKeys(TestData.Password);
	  
	  driver.findElement(Locators.click).click();
	  
	  Thread.sleep(3000);
	  
  }
  
  
  
  @BeforeTest
  public static void setup() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	  driver.get(TestData.url);
	  
	  driver.manage().window().maximize();
	  
	  
	  
	  
	  
  }
  

  @AfterTest
  public static void teardown() {
	  
	  
	  
  }

}
