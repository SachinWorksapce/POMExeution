package handlingpopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HnalingPromptAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		WebDriverWait w=new WebDriverWait(d, Duration.ofSeconds(3));
		Thread.sleep(4000);
		WebElement prom=d.findElement(By.xpath("//a[text()='See a sample prompt']"));
		prom.click();
		Alert a=w.until(ExpectedConditions.alertIsPresent());
		
		Alert e=d.switchTo().alert();
		Thread.sleep(3000);
		e.sendKeys("sachin");
		Thread.sleep(2000);
		e.accept();
		
		
		
		
		
	}

}
