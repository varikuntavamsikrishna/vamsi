package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.HomePage_PF;
import pageFactory.LoginPage_PF;

public class LoginDemoSteps_PF {

	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;

	@Given("Browser is opens")
	public void Browser_is_opens() {
		
		System.out.println("##### I'm in Pagefactory. #####");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

	@And("User is on Login page")
	public void user_is_on_Login_page() {

		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_Username_and_Password(String username, String password) {
		
		login= new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
		
		//driver.findElement(By.id("name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		login.clickLogin();
		//driver.findElement(By.id("login")).click();
	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		
		home= new HomePage_PF(driver);
		home.clickLogout();
		//driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
	}

}
