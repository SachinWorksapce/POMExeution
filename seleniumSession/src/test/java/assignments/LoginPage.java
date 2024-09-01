package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement unTbx;
	private WebElement pwdTbx;
	private WebElement loginbutton;     // Declaration 
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		unTbx=driver.findElement(By.id("userName"));
		pwdTbx=driver.findElement(By.name("pwd"));
		loginbutton=driver.findElement(By.xpath("//div[text()='Login ']"));    //Initialization 
	}
	

	
	public void login(String un,String password) {
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(password);
		loginbutton.click();                            // utilization 
	}

}

