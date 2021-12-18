package Learn.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P_05_Dropdown {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("fireFox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		 driver.get("http://demo.guru99.com/test/newtours/register.php");
		 Select ddown= new Select(driver.findElement(By.name("country")));
		 System.out.println(ddown.isMultiple());
		 WebElement fSoption=ddown.getFirstSelectedOption();
		 System.out.println(fSoption.getText());
		 ddown.selectByValue("ARUBA");
		 ddown.selectByIndex(15);
		 List<WebElement> options1=ddown.getOptions();
		 
		 System.out.println(options1.size());
		 for(int i=0;i<options1.size();i++) {
			 System.out.println(options1.get(i).getText());
		 }
		 
		//Selecting Items in a Multiple SELECT elements
		 
		 driver.get("http://jsbin.com/osebed/2");
		 Select ddown1= new Select(driver.findElement(By.id("fruits")));
		
		 System.out.println(ddown1.isMultiple());
		 ddown1.selectByIndex(3);
		 ddown1.selectByValue("orange");
		 ddown1.selectByVisibleText("Apple");
		 List<WebElement> options=ddown1.getOptions();
		 
		 System.out.println(options.size());
		 for(int i=0;i<options.size();i++) {
			 System.out.println(options.get(i).getText());
		 }
	
	}

}
