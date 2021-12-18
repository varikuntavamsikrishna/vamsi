package Learn.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P_09_CheckIsEnabled {

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

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String expectedTitle = "Google";
		String actualTilte = driver.getTitle();

		if (expectedTitle.equals(actualTilte)) {
			System.out.println("Verification Successful - The correct title is displayed on the web page.");
		} else {
			System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
		}

		boolean serchBtn = driver.findElement(By.xpath("//span[@class='QCzoEc z1asCe MZy1Rb']//*[local-name()='svg']"))
				.isEnabled();
		System.out.println(serchBtn);

		WebElement textBox = driver.findElement(By.xpath("//input[@title='Search']"));
		textBox.clear();
		textBox.sendKeys("Hania");

		boolean textBoxEnable = driver.findElement(By.xpath("//input[@title='Search']")).isEnabled();
		boolean textBoxDisplayed = driver.findElement(By.xpath("//input[@title='Search']")).isDisplayed();

		if (textBoxEnable == true && textBoxDisplayed == true) {
			driver.findElement(By.xpath("//span[@class='QCzoEc z1asCe MZy1Rb']//*[local-name()='svg']")).click();
		}

		driver.close();
		System.out.println("Test script executed successfully.");

		// terminate the program
		System.exit(0);

	}

}
