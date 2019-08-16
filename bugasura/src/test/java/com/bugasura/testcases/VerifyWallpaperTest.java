package com.bugasura.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bugasura.Library.BaseLibrary;
import com.bugasura.Library.GenericLibrary;
import com.bugasura.Pages.TC_02_VerifyWallPaper;

public class VerifyWallpaperTest extends BaseLibrary{
   TC_02_VerifyWallPaper verifyWallPaper;
   @Parameters("device")
   
   @Test
   public void appPage(String device) throws Exception {
	       verifyWallPaper=new TC_02_VerifyWallPaper(driver);
	       Thread.sleep(4000);
	       
		   verifyWallPaper.clickOnAppText().click();
		   Assert.assertTrue(verifyWallPaper.clickOnAppText().isDisplayed());
		   Thread.sleep(4000);
		   verifyWallPaper.clickOnAppActivity().click();
		   
		   for(int i=1;i<=5;i++) {
		try {
		  
		         Thread.sleep(1000);
				  verifyWallPaper.clickOnWallpaper().click();
				
				  break;
		   }
		   catch(Exception e) {
			   GenericLibrary.swipeBottomToTop(0.8,0.3, driver);
			   
		   }
				   
		   }		   
			   }
		   }

		   
	  
	   
 
	

