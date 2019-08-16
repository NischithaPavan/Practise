package com.bugasura.Library;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class HtmlReportListener implements ITestListener{

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static String[] sDataGuest=null;
	
	public void onTestStart(ITestResult result) {
		
		try {
				try {
					sDataGuest = GenericLibrary.toReadExcelData("LoginData",result.getName());
				} catch (EncryptedDocumentException | InvalidFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	public void onTestSuccess(ITestResult result) {
		test.pass(MarkupHelper.createLabel(result.getName()+"Case has PASSED",ExtentColor.GREEN));
		
	}

		
	

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		test.fail(MarkupHelper.createLabel(result.getName()+"case has FAILED due to following reasons", ExtentColor.RED));
		test.fail(result.getThrowable());
		test.fail("Test case failure visible area screenshot is below");
		try {
			
			test.addScreenCaptureFromPath(GenericLibrary.getVisibleAreaScreenshot(BaseLibrary.driver, result.getName()));
			
		}
		catch(IOException e ) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		test.skip(MarkupHelper.createLabel(result.getName()+"test Has SKIPPED due to following issue",ExtentColor.ORANGE));
		test.skip(result.getThrowable());
		
	}
	public void onStart(ITestContext context) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy_hh_mm_ss");
		String sDate=sdf.format(date);
		//Setting report location
		
		htmlReporter=new ExtentHtmlReporter(new File(BaseLibrary.sDirPath+"\\Reports\\"+sDate+"HtmlReport.html"));
		htmlReporter.setAppendExisting(false);
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("AuthorName", "Sandeep");
		extent.setSystemInfo("OS", System.getProperty("os.name"));
		extent.setSystemInfo("Mobile Device Name", context.getCurrentXmlTest().getParameter("DeviceName"));
		extent.setSystemInfo("Platform Name", "Android");
		extent.setSystemInfo("Platform Version", GenericLibrary.getConfigValue(BaseLibrary.sConfigPath, "PlatformVersion"));
		extent.setSystemInfo("Test Type", context.getName());
		//extent.setSystemInfo("Build Version", GenericLibrary.getConfigValue(BaseLibrary.sConfigPath, "BuildVersion"));
		
		
		//htmlReporter.loadXMLConfig(BaseLibrary.sDirPath+"\\extent-config.xml\\");
		htmlReporter.config().getChartVisibilityOnOpen();
		htmlReporter.config().setDocumentTitle("Bugasura");
		htmlReporter.config().setReportName("Bugasura Test Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.setAppendExisting(true);
		
		
		
	}
    
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

	

	
	
}
