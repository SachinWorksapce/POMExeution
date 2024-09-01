package testNgExam;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationClassExample {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("openBrowser", true);
	}

	@BeforeMethod
	public void login() {
		Reporter.log("login", true);
	}

	@Test
	public void createCustomer() {
		
		Reporter.log("createCustomer", true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("logout", true);
	}

	@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser", true);
	}

	@Test
	public void deleteCustomer() {
		Reporter.log("deleteCustomer", true);
	}

	@Test
	public void modifyCustomer() {
		Reporter.log("ModifyCustomer", true);
	}

}
