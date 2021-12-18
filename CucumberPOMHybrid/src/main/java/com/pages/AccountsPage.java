package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	
	private WebDriver driver;
	private By accountSection= By.cssSelector("div#center_column span");
	
	public AccountsPage(WebDriver driver) {
		this.driver=driver;
	}
	public String accountsPageTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	
	public int getAccountSectionCount() {
		return driver.findElements(accountSection).size();
	}
	
	public List<String> getAccountSectionList() {
	
	List<String> accountsList= new ArrayList<>();
	List<WebElement> accountSectionList=driver.findElements(accountSection);
	
	for(WebElement e : accountSectionList ) {
		String text=e.getText();
		System.out.println(text);
		accountsList.add(text);
	}
	return accountsList;
		
	}

	
}
