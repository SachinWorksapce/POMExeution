package com.actitime.testScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Project {
	
	@Test(groups = "smokeTest")
	public void createProject() {
		Reporter.log("SmokeTesrinProject", true);
		Reporter.log("createProject", true);
	}
	@Test(groups = "regressionTest")
	public void deleteProject() {
		Reporter.log("RegressionTestInProjec", true);
		Reporter.log("deleteProject", true);
	}


}
