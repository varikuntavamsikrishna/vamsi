package Learn.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P_01_BasicMethodsinWebDriver {
	
	public static String browser="chrome";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("fireFox")) {
			
			WebDriverManager.firefoxdriver().setup();
			 driver= new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		
		driver.get("https://saucedemo.com/");
		
		driver.manage().window().maximize();
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
		driver.navigate().to("https://google.com/");
		driver.navigate().back();
		
		driver.close();
	}
	

}
