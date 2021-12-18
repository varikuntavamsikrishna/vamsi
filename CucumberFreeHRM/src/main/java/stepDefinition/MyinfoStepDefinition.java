package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class MyinfoStepDefinition {

	WebDriver driver;

	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^Title of login page is OrangeHRM$")
	public void title_of_login_page_is_OrangeHRM() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("OrangeHRM", title);

	}

	@Then("^User enters \"(.*)\" and User enters \"(.*)\"$")
	public void user_enters_username_and_User_enters_password(String uname, String pass) throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass);

	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}



	@Then("^user clicks on MyInfo tab$")
	public void user_clicks_on_MyInfo_tab() throws Throwable {
		driver.findElement(By.xpath("//b[normalize-space()='My Info']")).click();
	}

	@Then("^user clicks on Edit button$")
	public void user_clicks_on_Edit_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	}

	@Then("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_fname_and_mname_and_lname(String fname, String mname, String lname) throws Throwable {
		driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).clear();
		driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']")).clear();
		driver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']")).sendKeys(mname);
		driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).clear();
		driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).sendKeys(lname);
	}

	@Then("^user clicks on save button$")
	public void user_clicks_on_save_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}
}
