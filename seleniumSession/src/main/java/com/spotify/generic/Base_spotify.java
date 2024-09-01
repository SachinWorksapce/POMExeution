package com.spotify.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base_spotify {
	 WebDriver driver;

	@BeforeTest
	
	public void openBrowser() {
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://accounts.spotify.com/");	
		
	}
	
	@BeforeMethod
	
	
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
