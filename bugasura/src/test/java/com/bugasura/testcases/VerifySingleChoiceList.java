package com.bugasura.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bugasura.Library.BaseLibrary;
import com.bugasura.Library.GenericLibrary;
import com.bugasura.Library.HtmlReportListener;
import com.bugasura.Pages.TC_08_VerifyListDialogue;
import com.bugasura.Pages.TC_09_VerifySingleChoiceList;

public class VerifySingleChoiceList extends BaseLibrary {
	TC_09_VerifySingleChoiceList VerifySingle;
	TC_08_VerifyListDialogue vd;

	
	@Parameters("device")
	@Test
	public void SingleChoiceList(String device) {
		
		VerifySingle=new TC_09_VerifySingleChoiceList(driver);
	     vd=new TC_08_VerifyListDialogue(driver);
		HtmlReportListener.test=HtmlReportListener.extent.createTest("Api Demo Test","Verify Single Choice List");
		
		
		GenericLibrary.click(vd.clickOnAppTextT(), driver);
		GenericLibrary.click(vd.clickOnActivityText(), driver);
		GenericLibrary.click(vd.clickOnAnimationText(), driver);
		GenericLibrary.click(vd.clickOnFadeInText(), driver);
		GenericLibrary.click(VerifySingle.clickOnSingleChoice(), driver);
		GenericLibrary.click(VerifySingle.clickOnStreetView(), driver);
		GenericLibrary.click(VerifySingle.clickOnTextOk(), driver);
		
		
		
	}

}
