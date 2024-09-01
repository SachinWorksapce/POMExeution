package testNgExam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertclassExample {
	@Test

	public void demoVerifyTitle() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("google.com");
		String actualTitle = d.getTitle();
		String expectedTitle = "Google";
		Assert.assertEquals(actualTitle, expectedTitle);
		SoftAssert a = new SoftAssert();
		a.assertEquals(actualTitle, expectedTitle);
		System.out.println(actualTitle);
		d.quit();
		a.assertAll();

	}

}
