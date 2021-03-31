package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Frames {
	
	public WebDriver driver;
	
	public Actions action;
	
	
	
  @Test
  public void Frame() {
	  
	  
	// iframe concept by useing id or webelement
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

			// Element which needs to drag.
			WebElement DragFrom = driver.findElement(By.id("draggable"));

			// Element on which need to drop.
			WebElement DropTo = driver.findElement(By.id("droppable"));

			// Using Action class for drag and drop.
			Actions act = new Actions(driver);

			// Dragged and dropped.
			act.dragAndDrop(DragFrom, DropTo).build().perform();  
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
 System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  System.out.println(driver.getTitle());
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
