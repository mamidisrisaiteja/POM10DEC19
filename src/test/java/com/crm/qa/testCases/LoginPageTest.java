package com.crm.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod()
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		
	}
	
	@Test
	public void loginPageTitleTest() {
		  String title=loginPage.validateLoginPageTitle();
		  Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test
	public void loginTest() {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
