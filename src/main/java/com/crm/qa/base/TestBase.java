package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	 public static WebDriver driver;
	 public static Properties prop;
	
	
public TestBase() {
		
		try {
			prop =new Properties();
			FileInputStream ip; 
			ip = new FileInputStream("C:\\Users\\saitejamamidi\\eclipse-workspace\\MavenJenkinsIntt0312190720\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
		
		
	
	public static void initialization() {
		
		
		//String browserName=prop.getProperty("browser");
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\saitejamamidi\\Desktop\\Sai Teja\\Automation\\Selenium Practice\\SW\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\saitejamamidi\\Desktop\\Sai Teja\\Selenium Practice\\SW\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		    driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		
	}

}
