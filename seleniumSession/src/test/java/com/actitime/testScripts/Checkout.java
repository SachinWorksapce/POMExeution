package com.actitime.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.Base2;

public class Checkout extends Base2 {
	
	@Test
	public void checkOut() {
		WebElement cart=dr.findElement(By.xpath("//div[@id='shopping_cart_container']"));
		cart.click();
		WebElement checkOut=dr.findElement(By.id("checkout"));
		checkOut.click();
		Reporter.log("CheckOUT", true);
	}

}
