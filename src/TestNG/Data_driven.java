package TestNG;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Data_driven {
	
	public WebDriver driver;
	
  @Test
  
  public void Datadriven() throws Exception {
	  
	  //FileInputStream fi = new FileInputStream("C:\\Users\\sruthi\\Downloads\\Ram.xlsx");
	 
	  FileInputStream fi = new FileInputStream("C:\\Users\\sruthi\\Downloads\\Ram123.xls");
	  Workbook wb = Workbook.getWorkbook(fi);
	  
	  Sheet s = wb.getSheet("Gmail");
	  
	  driver.findElement(By.id("login_field")).sendKeys(s.getCell(0, 1).getContents());
	  
	  driver.findElement(By.id("password")).sendKeys(s.getCell(1, 1).getContents());
  
	  driver.findElement(By.name("commit")).click();
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.get("http://github.com/login?return_to=%2Flogins");
	  
	  System.out.println(driver.getTitle());
	  driver.manage().window().maximize();

	  
	  
	  
  }
  
  

  @AfterTest
  public void afterTest() {
	  
	  
	  
	  
  }

}
