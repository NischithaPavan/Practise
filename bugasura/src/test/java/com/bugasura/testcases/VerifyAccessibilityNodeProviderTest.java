package com.bugasura.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bugasura.Library.BaseLibrary;
import com.bugasura.Pages.TC_01_VerifyAccessibilityNodeProvider;

public class VerifyAccessibilityNodeProviderTest extends BaseLibrary {

	
	TC_01_VerifyAccessibilityNodeProvider homepage;
	@Parameters("device")
	@Test
	public void testHome(String device) throws Exception {
		homepage=new TC_01_VerifyAccessibilityNodeProvider(driver);
		
			
			System.out.println("Test case started in Home Test");
			homepage.getAccessibility().click();
			Assert.assertTrue(homepage.getAccessibility().isDisplayed());
			Thread.sleep(2000);
			homepage.clickOnAccessibilityNodeProvider().click();
			Assert.assertTrue(homepage.clickOnAccessibilityNodeProvider().isDisplayed());
		
	}
}
