package Learn.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_15_DynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://stqatools.com/demo/index.php");
		
		WebElement table=driver.findElement(By.xpath("//table[@align='center']"));
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		
		String expectedCell="Name";
		
		for(WebElement row: rows) {
			System.out.println(row);
			List<WebElement> cols=driver.findElements(By.tagName("td"));
			for(WebElement col:cols) {
				String colText=col.getText();
				System.out.println(colText+"\t");
				
				if(colText.equals(expectedCell)) {
					System.out.println("Cell Exist in WebTable...");
				}
				System.out.println();
			}
			
		}
		
		

	}

}
