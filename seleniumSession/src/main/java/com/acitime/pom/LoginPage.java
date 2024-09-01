package com.acitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="userName")
	private WebElement userName;
	
@FindBy(name="pwd")
private WebElement password;


public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

}
 

