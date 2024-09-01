package com.actitime.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.Base2;

public class AboutUs extends Base2 {
	
	@Test
	public void gotoAboutus() {
		WebElement ham=dr.findElement(By.id("react-burger-menu-btn"));
		ham.click();
		WebElement about=dr.findElement(By.xpath("//a[text()='About']"));
		
		about.click();
		Reporter.log("gotoAboutUs", true);
	}

}
