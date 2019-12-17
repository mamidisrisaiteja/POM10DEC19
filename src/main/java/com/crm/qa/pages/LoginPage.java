package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(name="email")
	WebElement emailId;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginButton;
		
	
	//Initializing the page objects
	public LoginPage() {
			PageFactory.initElements(driver, this);
	}
	
	//to get the page title
	public String validateLoginPageTitle() {
		
		return driver.getTitle();
		
	}
	
	public HomePage login(String eId,String pwd) {
		emailId.sendKeys(eId);
		password.sendKeys(pwd);
		loginButton.click();
		return new HomePage();
	}

}
