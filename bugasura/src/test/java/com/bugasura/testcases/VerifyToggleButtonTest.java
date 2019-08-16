package com.bugasura.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bugasura.Library.BaseLibrary;
import com.bugasura.Library.GenericLibrary;
import com.bugasura.Pages.TC_07_VerifyToggleButton;

public class VerifyToggleButtonTest extends BaseLibrary {
	TC_07_VerifyToggleButton toggleBtn;
	@Parameters("device")
	@Test
	public void verifyTogglebtn(String device) {
		
		toggleBtn=new TC_07_VerifyToggleButton(driver);
		GenericLibrary.click(toggleBtn.clickOnPreference(), driver);
		GenericLibrary.click(toggleBtn.clickOnSwitch(), driver);
		
	    if(toggleBtn.clickOnSwitchToggleButton().getText().contains("OFF")) {
	    	GenericLibrary.click(toggleBtn.clickOnSwitchToggleButton(), driver);
	    	System.out.println("toggle button is disabled.Making it enable");
	    }
	    else {
	    	System.out.println("toggle button is already ON");
	    }
		
		
	}
	
}
