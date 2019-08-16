package com.bugasura.testcases;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bugasura.Library.BaseLibrary;
import com.bugasura.Library.GenericLibrary;
import com.bugasura.Pages.TC_06_VerifyCustomCheckBox;

public class VerifyCustomCheckBoxTest extends BaseLibrary {

	TC_06_VerifyCustomCheckBox customCheck;
	
	@Parameters("device")
	@Test
	public void verifyCustomBox(String device) {
		customCheck=new TC_06_VerifyCustomCheckBox(driver);
		GenericLibrary.click(customCheck.clickOnAnimation(), driver);
		GenericLibrary.click(customCheck.clickOnShowAnimations(), driver);
		GenericLibrary.click(customCheck.clickOnCustomCheckBox(), driver);
		Assert.assertTrue(customCheck.clickOnCustomCheckBox().isEnabled(),"Check box is not checked");
		System.out.println("Custom Animation check box is checked");
		
	}
	
}
