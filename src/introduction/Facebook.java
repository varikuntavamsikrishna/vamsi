package introduction;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook {
	
	public WebDriver driver;
	
	public void openurl() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi\\Downloads\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	
	public void login() {
		
		driver.findElement(By.id("email")).sendKeys("v.vamsi93k@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("117X1A0366");
		
		driver.findElement(By.name("login")).click();
		
	
		
	}
	
	

	public static void main(String[] args) {
		
		
		Facebook r = new Facebook();
		r.openurl();
		r.login();
		
		

	}

}