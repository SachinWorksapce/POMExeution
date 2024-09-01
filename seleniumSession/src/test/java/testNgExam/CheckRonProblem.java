package testNgExam;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckRonProblem {
	
	@Test(priority = 0, enabled = false)
	public void Create_Customer() {

		// Assert.fail();
		Reporter.log("Customer is created Successfully", true);
	}

	@Test(priority = 0)
	public void Modify_Customer() {
		Reporter.log("Customer is modified Successfully", true);
	}

	@Test( dependsOnMethods = "Create_Customer")
	public void Delete_Customer() {
		Reporter.log("Customer is Deleted Successfully", true);
	}

}
