package Learn.Automation;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class P_08_DownloadFile {
	
	String browser = "chrome";
	 WebDriver driver;
	 File folder;

	 @BeforeMethod
	 public void setUp() {
		 
		 folder= new File(UUID.randomUUID().toString());
		 folder.mkdir();
		 
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		 ChromeOptions options= new ChromeOptions();
		 
		 Map<String, Object> pref= new HashMap<String, Object>();
		 pref.put("profile.default_content_settings.popups", 0);
		 pref.put("download.default_directory", folder.getAbsolutePath());
		 
		 options.setExperimentalOption("prefs", pref);
		 DesiredCapabilities cap= DesiredCapabilities.chrome();
		 cap.setCapability(ChromeOptions.CAPABILITY, options);
		 
		 driver=new ChromeDriver(cap);
	 }
	 
	 @Test
	 public void downLoadFile() throws InterruptedException {
		 driver.get("http://the-internet.herokuapp.com/download");
		 driver.findElement(By.xpath("//a[normalize-space()='Screenshot 2021-07-15 at 19.11.27.png']")).click();
		 
		 Thread.sleep(2000);
		File listOfFiles[]= folder.listFiles();
		//Assert.assertEquals(listOfFiles.length, is(not(0)));
		Assert.assertTrue(listOfFiles.length>0);
		for(File file: listOfFiles) {
			//Assert.assertEquals(file.length(), is(not((long)0)));
			Assert.assertTrue(file.length()>0);
		}
		 
	 }
	 
	 
	 @AfterMethod
	 public void tearDown() {
		 driver.close();
		 for(File file: folder.listFiles()) {
			 
			 file.delete();
		 }
		 
		 folder.delete();
	 }
	
	

}
