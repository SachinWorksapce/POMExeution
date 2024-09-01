package com.spotify.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@id='login-username']")
	private WebElement emailTextfiled;

	@FindBy(xpath = "//input[@id='login-password']")
	private WebElement passwordTxtField;

	@FindBy(xpath = "//span[text()='Log In']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailTextfiled() {
		return emailTextfiled;
	}

	public WebElement getPasswordTxtField() {
		return passwordTxtField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void logintoApplication(String un,String pwd) {
		emailTextfiled.sendKeys(un);
		passwordTxtField.sendKeys(pwd);
	}

	
}
