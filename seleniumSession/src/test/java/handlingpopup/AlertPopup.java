package handlingpopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement customerTextField=d.findElement(By.xpath("//td[text()='Customer ID']/parent::tr//input"));
		customerTextField.sendKeys("123");
		WebElement submit=d.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(2000);
	Alert a=	d.switchTo().alert();
	a.accept();
		Thread.sleep(2000);
		a.accept();
	}

}
