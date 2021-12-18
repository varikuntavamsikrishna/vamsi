package Learn.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P_10_ExplicitImplicitWaits {

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

		driver.get("https://www.softwaretestingmaterial.com");
		// To maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Implicit wait
		
		String title=driver.getTitle();
		// Explicit Wait ---This waits up to 15 seconds before throwing a TimeoutException or if it finds
		// the element will return it in 0 - 15 seconds
		WebDriverWait wait= new WebDriverWait(driver, 10);
		// Title of the webpage is "Software Testing Material - A site for Software
		// Testers"
		wait.until(ExpectedConditions.titleIs(title));
		// If the above condition met then the browser will be closed
		// To close the browser
		System.out.println(title);
		driver.close();
		System.exit(0);
	}

}
