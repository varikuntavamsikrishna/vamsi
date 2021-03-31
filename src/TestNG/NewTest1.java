package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest1 {
	public WebDriver driver;

  @Test
	  public void FbLgSu() throws InterruptedException{
		//driver.findElement(By.id("email")).clear();
		//driver.findElement(By.id("email")).sendKeys("v.vamsi93k@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("117X1A0366");
		//driver.findElement(By.name("login")).click();
	  
	  //FACEBOOK
		driver.findElement(By.xpath("//a[@role='button'][contains(@id,'4f')][contains(.,'Create New Account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("vamsi");
		driver.findElement(By.name("lastname")).sendKeys("krishna");
		driver.findElement(By.name("reg_email__")).sendKeys("v.vamsi93k@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("9642008589");
		
		
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("08");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Dec");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1993");

		

		//driver.findElement(By.xpath("//*[@id=\"u_2g_o_5J\"]/span[2]/label")).click();
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {

	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
  }

  @AfterTest
  public void afterTest() {
	
  }

  }

