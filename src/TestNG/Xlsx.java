package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Xlsx {
	
	public WebDriver driver;
		
	
	
	
  @Test
  public void Xlsx_test() throws Exception {
	  
	  File src = new File("C:\\Users\\sruthi\\Downloads\\swammy by selenium\\SwamyKumar_Selenium_Workspace_2025\\26 XLSX _Data Driven\\POIExcelsheet.xlsx");
	  
	  // load the file
	  
	  FileInputStream finput = new FileInputStream(src);
	  
	  //Load the workbook
	 // XSSFWorkbook workbook = new XSSFWorkbook(finput);
	  
	  //Load the sheet in which data is stored
	 // XSSFSheet s = workbook.getsheetAt(0);
	  
	  
	  XSSFWorkbook workbook = new XSSFWorkbook(finput);

		XSSFSheet s = workbook.getSheetAt(0);
	  
	  String username = s.getRow(1).getCell(0).getStringCellValue();
	  System.out.println(username);
	  
	  driver.findElement(By.id("identifierId")).sendKeys(username);
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
	  Thread.sleep(8000);
	  
	  String password = s.getRow(1).getCell(1).getStringCellValue();
	  System.out.println(password); 
	  
	  driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(password);
	  Thread.sleep(8000);
	  
	  driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();
	  Thread.sleep(10000);
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	  driver.get("http://gmail.com");
	  
	  System.out.println(driver.getTitle());
	  
	  driver.manage().window().maximize();

	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
	  
	  
  }

}
