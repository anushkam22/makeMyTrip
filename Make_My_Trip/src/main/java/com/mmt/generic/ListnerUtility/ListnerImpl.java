package com.mmt.generic.ListnerUtility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.mmt.generic.BaseUtility.BaseTest;
import com.mmt.generic.WebDriverUtility.UtilityClassObject;


public class ListnerImpl implements ITestListener, ISuiteListener

{

	public static ExtentReports report;
	public static ExtentTest test;

	public void onStart(ISuite suite) {
		String time = new Date().toString().replace("", "_").replace(":", "_");

		ExtentSparkReporter  spark = new ExtentSparkReporter("./advancereports/report_"+time+".html");
		spark.config().setDocumentTitle("GOIBIBO Test Result");
		spark.config().setReportName("GOIBIBO Report");
		spark.config().setTheme(Theme.DARK);
		// add env info
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-10");
		report.setSystemInfo("Browser", "Chrome-120");

	}

	public void onFinish(ISuite suite) {
		report.flush();
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method
		test = report.createTest(result.getMethod().getMethodName());
		test.generateLog(Status.INFO, result.getMethod().getMethodName() + "started");
		UtilityClassObject.setTest(test);

	}

	public void onTestSuccess(ITestResult result) {
		test.generateLog(Status.PASS, result.getMethod().getMethodName() + "started");

	}

	public void onTestFailure(ITestResult result) {
		String testname = result.getMethod().getMethodName();
		TakesScreenshot ts = (TakesScreenshot) BaseTest.sdriver;
		String time = new Date().toString().replace("", "_").replace(":", "-");
		String filepath = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromPath(filepath, testname + "_" + time);
		test.generateLog(Status.FAIL, result.getMethod().getMethodName() + "started");
		test.log(Status.FAIL, result.getThrowable());

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
