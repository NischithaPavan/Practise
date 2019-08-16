package com.bugasura.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bugasura.Library.BaseLibrary;
import com.bugasura.Library.GenericLibrary;
import com.bugasura.Library.HtmlReportListener;
import com.bugasura.Pages.TC_08_VerifyListDialogue;
import com.bugasura.Pages.TC_11_VerifyDataUsingExcel;

public class VerifyDataUsingExcel extends BaseLibrary{
	String[] sData=null;
	
	TC_11_VerifyDataUsingExcel Vdata;
	TC_08_VerifyListDialogue VList;
	@Parameters("device")
	@Test
	public void VerifyData(String device) throws EncryptedDocumentException, InvalidFormatException, IOException {
		Vdata=new TC_11_VerifyDataUsingExcel(driver);
		VList=new TC_08_VerifyListDialogue(driver);
		sData = HtmlReportListener.sDataGuest;
		HtmlReportListener.test=HtmlReportListener.extent.createTest("ApiDemo", "Verify data");
		
		GenericLibrary.click(VList.clickOnAppTextT(), driver);
		GenericLibrary.click(VList.clickOnActivityText(), driver);
		GenericLibrary.click(VList.clickOnAnimationText(), driver);
		GenericLibrary.click(VList.clickOnFadeInText(), driver);
		GenericLibrary.click(Vdata.clickOnEnteryDialogue(), driver);
		Vdata.enterUsername().sendKeys(sData[1]);
		
		//GenericLibrary.sendkeys(Vdata.enterUsername(), sData[2], driver);
		 //sData=GenericLibrary.toReadExcelData("LoginData","Login");
	
		// GenericLibrary.sendkeys(Vdata.enterUsername(), sData[0], driver);
	}

}
