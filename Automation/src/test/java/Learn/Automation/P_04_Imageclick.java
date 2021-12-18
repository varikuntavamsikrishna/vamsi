package Learn.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P_04_Imageclick {


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
		
		String baseUrl="https://www.facebook.com/pages/create/?ref_type=registration_form";
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//i[@class='fb_logo img sp_OWSJdNxzZ6s sx_4043cd']")).click();
		System.out.println(driver.getTitle());
		 if(driver.getTitle().equals("Facebook - లాగిన్ లేదా సైన్ అప్")) {
			 System.out.println("We are back at Facebook's homepage");
			 		 }
		 else {
			 System.out.println("We are NOT in Facebook's homepage");
		 }
		
	}

}
