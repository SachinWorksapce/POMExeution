package com.spotify.generic;

import java.io.File;

import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernerImplementation extends Base_spotify implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		TakesScreenshot sc=(TakesScreenshot)driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File destination=new File("");
		try{
			FileUtils.copyFile(source, destination);
		}
	catch(Exception e) {
		e.printStackTrace();
	}
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

}
