package stepsForHook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class StepsHook {

	WebDriver driver = null;

	@Before(order=1, value="@smoke")
	public void browserSetup() {
		
		System.out.println("I'm inside browser setup");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Before(order=0)
	public void setup2() {
		System.out.println("I'm in inside setup----2");
	}
	@After(order=0)
	public void tearDown() {
		System.out.println("I'm in teardown");
		driver.close();
	}
	
	@After(order=1)
	public void tearDown2() {
		System.out.println("I'm in teardown----2");
	}
	@BeforeStep
	public static void beforeSteps() {
		System.out.println("Before step");
	}
	@AfterStep
	public static void afterSteps() {
		System.out.println("after step");
	}

	
	@Given("user is on login page")
	public void user_is_on_login_page() {

	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {

	}

}
