package testNgExam;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class DemonstartingTestNG {

	@Test(invocationCount = 1)
	public void creatCustomer() {
		//Assert.fail();
		org.testng.Assert.fail();
		
	}
	@Test(priority = 1,dependsOnMethods = "creatCustomer")
	public void deleteCustomer() {
		Reporter.log("ModifyCustomer", true);
	}
}
