package com.actitime.testScripts;

import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Base;
import com.actitime.generic.ListenerImplementation;
@Listeners(ListenerImplementation.class)

public class CustomerModule extends Base

{
	
	@Test(groups = "smokeTest")
	public void createCustomer() {
		
		Reporter.log("SmokeTest", true);
		Reporter.log("createCustomer", true);
        
	}
	@Test(groups = "regressionTest")
	public void modifyCustomer() {
		Reporter.log("RegressionTestInCustomermodule", true);
		
		Reporter.log("modifyCustomer", true);
        
	}


}
