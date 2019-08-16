package com.bugasura.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bugasura.Library.BaseLibrary;
import com.bugasura.Library.GenericLibrary;
import com.bugasura.Library.HtmlReportListener;
import com.bugasura.Pages.TC_10_VerifyToastermessage;

public class VerifyToasterMessage extends BaseLibrary {
	TC_10_VerifyToastermessage toast;
	@Parameters("device")
	@Test
	public void toastMessage(String device) {
		toast=new TC_10_VerifyToastermessage(driver);
		HtmlReportListener.test=HtmlReportListener.extent.createTest("Api demo Test","verify Toaster Message");
		GenericLibrary.click(toast.clickOnMediaText(), driver);
		GenericLibrary.click(toast.clickOnMediaPlayer(), driver);
		GenericLibrary.click(toast.clickOnPlayVideo(), driver);
	}

}
