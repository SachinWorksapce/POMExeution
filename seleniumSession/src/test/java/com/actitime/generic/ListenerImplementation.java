package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation extends Base implements ITestListener {

//	@Override
//	public void onTestStart(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestStart(result);
//	}

//	@Override
//	public void onTestSuccess(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestSuccess(result);
//	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		TakesScreenshot sc=(TakesScreenshot) dr;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File destination =new File("./screenShots/image.png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	}
//
//	@Override
//	public void onTestSkipped(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestSkipped(result);
//	}
//
//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
//	}
//
//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedWithTimeout(result);
//	}
//
//	@Override
//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onStart(context);
//	}
//
//	@Override
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onFinish(context);
//	}
	
}
