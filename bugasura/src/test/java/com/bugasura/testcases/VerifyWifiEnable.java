package com.bugasura.testcases;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bugasura.Library.BaseLibrary;
import com.bugasura.Library.HtmlReportListener;
import com.bugasura.Pages.TC_12_EnableWifi;

public class VerifyWifiEnable extends BaseLibrary {
	
	TC_12_EnableWifi ew;
	@Parameters("device")
	@Test
	public void VerifyWifi(String device) throws InterruptedException {
		
		ew=new TC_12_EnableWifi(driver);
		String command="adb -s ZY322C6KX6 shell \"svc wifi disable\"";
		String cmd="adb -s ZY322C6KX6 shell";
		String a="\"";
		String cmd1="svc wifi disable";
		String b="\"";
		String full=cmd+a+cmd1+b;
		System.out.println(full);
		HtmlReportListener.test=HtmlReportListener.extent.createTest("verify Wifi","wifi should be enabled");
		Thread.sleep(6000);
		
		
	}
	

}
