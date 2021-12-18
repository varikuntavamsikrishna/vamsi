package com.web.automation.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.web.automation.utility.ConfigReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver=null;

@Given("^User is on login page$")
public void user_is_on_login_page() throws Throwable {
	System.out.println(ConfigReader.readElementLoacator("login_page_tag"));
}
	

@When("^User enters username$")
public void user_enters_username() throws Throwable {
    
}

@When("^User enters password$")
public void user_enters_password() throws Throwable {
    
    
}

@When("^User clicks on signin button$")
public void user_clicks_on_signin_button() throws Throwable {
    
}

@Then("^User should be loggedin$")
public void user_should_be_loggedin() throws Throwable {
    
    
}

@When("^User click on Logout button$")
public void user_click_on_Logout_button() throws Throwable {
    
    
}

@Then("^User should be logged out$")
public void user_should_be_logged_out() throws Throwable {
    
    
}

@Given("^User is on Registration page$")
public void user_is_on_Registration_page() throws Throwable {
    
    
}

@When("^User enter username$")
public void user_enter_username() throws Throwable {
    
    
}

@When("^User enters email address$")
public void user_enters_email_address() throws Throwable {
    
    
}

@When("^User enters confirm password$")
public void user_enters_confirm_password() throws Throwable {
    
    
}

@When("^User enters date of birth$")
public void user_enters_date_of_birth() throws Throwable {
    
    
}

@When("^User enters phone number$")
public void user_enters_phone_number() throws Throwable {
    
    
}

@When("^User enters address$")
public void user_enters_address() throws Throwable {
    
    
}

@When("^User click on home address type$")
public void user_click_on_home_address_type() throws Throwable {
    
    
}

@When("^User select gender$")
public void user_select_gender() throws Throwable {
    
    
}

@When("^User select country$")
public void user_select_country() throws Throwable {
    
    
}

@When("^User select state$")
public void user_select_state() throws Throwable {
    
    
}

@When("^User select city$")
public void user_select_city() throws Throwable {
    
    
}

@When("^User enters zip code$")
public void user_enters_zip_code() throws Throwable {
    
    
}

@When("^User click on agree checkbox$")
public void user_click_on_agree_checkbox() throws Throwable {
    
    
}

@When("^User click on sign up button$")
public void user_click_on_sign_up_button() throws Throwable {
    
    
}

@Then("^User account should be created$")
public void user_account_should_be_created() throws Throwable {
    
    
}



}
