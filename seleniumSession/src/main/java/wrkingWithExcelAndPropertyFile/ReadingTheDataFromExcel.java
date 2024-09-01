package wrkingWithExcelAndPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingTheDataFromExcel {
	public static void main(String[] args) throws IOException, InvalidFormatException {
String exfile="‪C:\\Users\\dell\\Desktop\\doc.xlsx".trim();

		File fi = new File(exfile);

		FileInputStream fis = new FileInputStream(fi);

		XSSFWorkbook book = new XSSFWorkbook(fi);
		XSSFSheet sheet = book.getSheetAt(0);
		String data = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);

	}
}
