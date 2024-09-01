package assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidandInvalidLogin {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("./data/Commondata.properties");
		Properties p = new Properties();
		p.load(fi);
		String url = p.getProperty("url");

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		d.get(url);

		FileInputStream f = new FileInputStream("testdate.xlsx");
		Workbook wb = WorkbookFactory.create(f);

		int count = wb.getSheet("InvalidloginSheetName").getLastRowNum();

		for (int i = 1; i <= count; i++) {
			String un = wb.getSheet("InvalidloginSheetName").getRow(i).getCell(0).getStringCellValue();

			String pw = wb.getSheet("InvalidloginSheetName").getRow(i).getCell(1).getStringCellValue();
			d.findElement(By.id("useName")).sendKeys(un);
			d.findElement(By.id("pwd")).sendKeys(pw);
			d.findElement(By.xpath("login")).click();
			try {
				d.findElement(By.id("logou")).click();
				wb.getSheet("InvalidloginSheetName").getRow(i).getCell(2).setCellValue("pass");
			} catch (NoSuchElementException e) {

				wb.getSheet("InvalidloginSheetName").getRow(i).getCell(2).setCellValue("fail");
			}
		}
		FileOutputStream fo = new FileOutputStream("excel path");
		wb.write(fo);

	}

}
