package handlingpopup;

import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentbrowser {
	public static void main(String[] args) {

//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the parent title ");
//		String exp=s.nextLine();

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://secure.indeed.com/auth?");
		WebElement googleLink = d.findElement(By.id("login-google-button"));
		googleLink.click();
		WebElement appleLogo = d.findElement(By.id("apple-signin-button"));
		appleLogo.click();

	
		String ParentTitle=d.getTitle();
		Set<String> allwindow = d.getWindowHandles();

		Iterator<String> it = allwindow.iterator();
		while (it.hasNext()) {

			String windows = it.next();
			 d.switchTo().window(windows);
		String allwindowTitle=	d.getTitle();			
		if(allwindowTitle.contains(ParentTitle))
			
			d.close();

		}

	}
}
