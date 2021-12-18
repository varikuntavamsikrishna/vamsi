package Learn.Automation;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class P_14_DesiredCapabilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;

		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("deviceName", "HANIa-PC");
//		//cap.setPlatform(Platform.ANY);
//		//cap.setBrowserName("chrome");
//		cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
//		cap.setCapability(CapabilityType.VERSION, "91");

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");

		// Creating a driver instance with the previous capabilities
		driver = new ChromeDriver(cap);
		driver.get("https://www.stqatools.com/");

		driver.close();

	}

}
