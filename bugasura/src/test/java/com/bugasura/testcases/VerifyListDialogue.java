package com.bugasura.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bugasura.Library.BaseLibrary;
import com.bugasura.Library.GenericLibrary;
import com.bugasura.Library.HtmlReportListener;
import com.bugasura.Pages.TC_08_VerifyListDialogue;

public class VerifyListDialogue extends BaseLibrary {
	TC_08_VerifyListDialogue vd;

	@Parameters("device")
	@Test
	public void verifyDialogueBox() {
		vd = new TC_08_VerifyListDialogue(driver);
		HtmlReportListener.test = HtmlReportListener.extent.createTest("ApiDemo test", "Verify dialogue box");
		GenericLibrary.click(vd.clickOnAppTextT(), driver);
		GenericLibrary.click(vd.clickOnActivityText(), driver);
		GenericLibrary.click(vd.clickOnAnimationText(), driver);
		GenericLibrary.click(vd.clickOnFadeInText(), driver);
		GenericLibrary.click(vd.clickOnListDialogue(), driver);
		GenericLibrary.click(vd.clickOnDialogueBox(), driver);
	}
}
