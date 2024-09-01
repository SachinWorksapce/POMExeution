package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTestclassLogin {
	@Test
	public void demo() {
		WebDriver driver =new ChromeDriver();
		driver.get("");
		LoginPage page=new LoginPage(driver);
	 page.login("admin","ash");
	}

}
