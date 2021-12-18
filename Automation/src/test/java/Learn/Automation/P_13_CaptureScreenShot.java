package Learn.Automation;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class P_13_CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		
		// Setting your Chrome options (Desired capabilities)
		ChromeOptions options = new ChromeOptions();

		// Creating a driver instance with the previous capabilities
		driver = new ChromeDriver(options);
		
		
		driver.get("https://www.stqatools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		DateFormat dateFormat= new SimpleDateFormat("MM_dd_yyyy HH:mm:ss");
		Date currentDate= new Date();
		String date1=dateFormat.format(currentDate);
		System.out.println(date1);
		String fileName=date1.toString().replace(" ", "_").replace(":", "_");
		
		File screenShot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//usual capture
		FileUtils.copyFile(screenShot, new File("./Screenshots/Screenshot_"+fileName+".png"));
		
		
		
		System.out.println("Execution complete");
		
		

	}

}
