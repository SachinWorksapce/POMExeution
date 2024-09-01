package assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromExcel {
public static void main(String[] args) throws IOException {
	
	FileInputStream f=new FileInputStream("./data/Commondata.properties");
	Properties p=new Properties();
	p.load(f);
	
	String url=p.getProperty("url");
	System.out.println(url);
	
}
}

