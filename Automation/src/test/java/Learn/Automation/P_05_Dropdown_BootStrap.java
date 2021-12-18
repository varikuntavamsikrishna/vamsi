package Learn.Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P_05_Dropdown_BootStrap {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();

		List<WebElement> lists = driver
				.findElements(By.xpath("//ul[contains(@class,'multiselect-container ')]//li//a//label"));
		System.out.println(lists.size());

		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i).getText());
			lists.get(i).click();
//			if (lists.get(i).getText().contains("Angular")) {
//				lists.get(i).click();
//			}
		}

	}

}
