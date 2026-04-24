package org.trmga.genericUtility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenerUtility implements ITestListener, ISuiteListener {

	ExtentReports report;
	ExtentSparkReporter spark;
	ExtentTest test;
	
	@Override
	public void onStart(ISuite suite) {
		Reporter.log("onstart",true);
		
		//Step 1: Create object for ExtentSparkReporter class
				spark = new ExtentSparkReporter("./reports/report.html");
				
				//Step 2: create Object for extentReports
				report = new ExtentReports();
				
				//Step 3: attach spark to report
				report.attachReporter(spark);
				
				//Step 4: create the report using createTest() from ExtentReport
				test = report.createTest(suite.getName());
	}

	@Override
	public void onFinish(ISuite suite) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("onTestSuccess",true);
		
		//information
		test.info(result.getMethod().getMethodName());
		
		///Step 5: log the report
		test.log(Status.PASS, "Test case passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

}
