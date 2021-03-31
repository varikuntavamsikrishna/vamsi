package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class StudentForm {
	
	public WebDriver driver;
	
	
	
  @Test
  public void student() {

	//Textbox//https://demoqa.com/automation-practice-form
	driver.findElement(By.id("firstName")).sendKeys("vamsi");

	driver.findElement(By.id("lastName")).sendKeys("krishna");
	driver.findElement(By.id("userEmail")).sendKeys("v.vamsi93k@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
	driver.findElement(By.id("userNumber")).sendKeys("9642008589");
	driver.findElement(By.id("dateOfBirthInput")).click();
	new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByVisibleText("1993");
	new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByVisibleText("December");


	driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[4]")).click();
	
	new Select(driver.findElement(By.linkText("//*[@id=\"subjectsContainer\"]/div/div[1]"))).selectByVisibleText("English");
	//driver.findElement(By.xpath("//div[contains(@class,'value-container--is-multi css-1hwfws3')]")).sendKeys("English");
	driver.findElement(By.xpath("//label[contains(.,'Sports')]")).click();
	driver.findElement(By.xpath("//label[contains(.,'Reading')]")).click();
	driver.findElement(By.xpath("//label[contains(.,'Music')]")).click();
	driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("1-19,darsi,A.P");
	new Select(driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]"))).selectByVisibleText("Rajasthan");
	new Select(driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]"))).selectByVisibleText("Jaipur");
	driver.findElement(By.id("submit")).click();
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
