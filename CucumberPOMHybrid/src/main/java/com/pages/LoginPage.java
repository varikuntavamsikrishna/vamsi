package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	//locators
	private By email= By.id("email");
	private By password= By.id("passwd");
	private By signInBtn= By.xpath("//span[normalize-space()='Sign in']");
	private By forgotPwdLink= By.xpath("//a[normalize-space()='Forgot your password?1']");
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		}
	//Page actions features of the page the form of methods
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void enterUserName(String username) {
		driver.findElement(email).sendKeys(username);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(signInBtn).click();
	}
	
	public AccountsPage doLogin(String uname, String pwd) {
		System.out.println("Login with : "+uname+"and"+pwd);
		driver.findElement(email).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInBtn).click();
		return new AccountsPage(driver);
	}
}
