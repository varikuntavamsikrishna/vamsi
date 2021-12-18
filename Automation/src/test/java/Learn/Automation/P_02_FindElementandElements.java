package Learn.Automation;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P_02_FindElementandElements {
	
	public static String browser="chrome";
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
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
		
		driver.get("https://www.sugarcrm.com");
		
		driver.manage().window().maximize();

//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
//		driver.findElement(By.name("login-button")).click();
//		System.out.println(driver.getTitle());
//		
//		List<WebElement> items=driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
//		System.out.println(items);
//		System.out.println(items.size());
//		
//		driver.navigate().to("https://www.sugarcrm.com");
//		
//		String winHandle=driver.getWindowHandle();
//		System.out.println(winHandle); 
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='menu-item-18905']/ul/li[1]/a")).click();
		
//		Set<String> winHandles=driver.getWindowHandles();
		
//		System.out.println(winHandles);
		//driver.close();
	}
	

}
