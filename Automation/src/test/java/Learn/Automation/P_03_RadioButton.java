package Learn.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P_03_RadioButton {

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

		driver.get("http://demo.guru99.com/test/radio.html");

		driver.manage().window().maximize();

		driver.findElement(By.name("webform")).click();// radio button

		List<WebElement> checkboxlist = driver.findElements(By.xpath("//input[@type='checkbox']"));// checkbox
		System.out.println(checkboxlist.size());

		for (int i = 0; i < checkboxlist.size(); i++) {
			checkboxlist.get(i).click();
		}

		driver.navigate().to("http://demo.guru99.com/test/facebook.html");

		WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
		for (int i = 0; i < 2; i++) {
			chkFBPersist.click();
			System.out.println("Facebook Persists Checkbox Status is -  " + chkFBPersist.isSelected());
		}

	}
}
