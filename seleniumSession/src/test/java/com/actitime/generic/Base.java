package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
	WebDriver dr;
	
	
	@BeforeClass(groups= {"smokeTest","regressionTest"})
	public void openBrowser() {
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Reporter.log("OpenBrowser", true);
		
	}
	@BeforeMethod
	public void login() {
//		dr.findElement(By.id("username")).sendKeys("admin");
//		dr.findElement(By.name("pwd")).sendKeys("manager");
//		dr.findElement(By.xpath("//div[text()='Login']")).click();
		Reporter.log("Login", true);
	}
	@AfterMethod
	public void logout() {
//		dr.findElement(By.id("logoutLink")).click();
		Reporter.log("logout", true);
	}
	@AfterClass
	public void closeBrowser() {
		dr.quit();
		Reporter.log("CloseBrowser", true);
	}


}
