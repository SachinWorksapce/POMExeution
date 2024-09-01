package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class Base2 {
	public WebDriver dr;
	
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browser) {
		
		switch(browser) {
		case "chrome": dr=new ChromeDriver();
		break;
		case "edge" : dr=new EdgeDriver();
		break;
		default : dr=new ChromeDriver();
		}
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://www.saucedemo.com/");
		Reporter.log("OpenBrowser", true);
		
		
	}
	@BeforeMethod
	
	public void login() {
		WebElement userName=dr.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		WebElement password=dr.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("secret_sauce");
		WebElement login=dr.findElement(By.id("login-button"));
		login.click();
		Reporter.log("Login to application", true);
	}
	
//	@AfterMethod
//	public void logOut() {
//		WebElement ham=dr.findElement(By.id("react-burger-menu-btn"));
//		ham.click();
//		WebElement logout=dr.findElement(By.id("logout_sidebar_link"));
//		logout.click();
//		
//		Reporter.log("Logging out from the application", true);
//		
//	}
	@AfterClass
	public void closeBrowser() {
		
		dr.quit();
		Reporter.log("CloseBrowser", true);
	}

}
