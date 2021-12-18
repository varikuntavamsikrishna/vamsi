package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageDemo {

	WebDriver driver;
	
	public LoginPageDemo(WebDriver driver) {
		
		this.driver=driver;
		if(!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not Login Page. The current page is"+driver.getCurrentUrl());
		}
	}

	By txt_username= By.id("name");
	By txt_password= By.id("password");
	By btn_login= By.id("login");
	By btn_logout=By.id("logout");

	public void enterUsername(String uname) {

		driver.findElement(txt_username).sendKeys(uname);
	}

	public void enterPassword(String pass) {

		driver.findElement(txt_password).sendKeys(pass);

	}

	public void clickLogin() {

		driver.findElement(btn_login).click();
	}
	
	public void clickLogout() {
		
		driver.findElement(btn_logout).isDisplayed();
	}

}
