package assignments;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckTheAnnotation {
	
	
	@BeforeClass
	public void BC() {
		System.out.println(" I am beforclass");
	}
	@AfterClass
	public void AC() {
		System.out.println(" I am after class");
	}
	@BeforeSuite
	public void BS() {
		System.out.println(" am beforeSuite");
	}
	@AfterSuite
	public void AS() {
		System.out.println(" I am AfterSuite");
	}
	
	@BeforeTest
	public void BT() {
		System.out.println("I am Before test");
	}
	@AfterTest
	public void AT() {
		System.out.println( " I am after test");
	}
	@Test
public void testMetho() {
		System.out.println(" test metho");
	}
	
	@Test
public void testMetho2() {
		System.out.println(" test metho2");
	}
	
	@BeforeMethod
	
	public void beforeM() {
		System.out.println(" I am BeforeMethod");
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("I am AfterMethod");
	}
	
	
	

}
