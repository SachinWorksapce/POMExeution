package testNgExam;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithScreenShot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		Thread.sleep(5);
		TakesScreenshot sc=(TakesScreenshot) d;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshot/sc.png");
		FileUtils.copyFile(source, destination);
	}
	


}
