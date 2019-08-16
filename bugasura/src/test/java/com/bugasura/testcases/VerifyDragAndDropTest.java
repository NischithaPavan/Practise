package com.bugasura.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bugasura.Library.BaseLibrary;
import com.bugasura.Library.GenericLibrary;
import com.bugasura.Pages.TC_04_VerifyDragAndDrop;

public class VerifyDragAndDropTest extends BaseLibrary {

	TC_04_VerifyDragAndDrop dp;

	@Parameters("device")
	@Test
	public void testDragAndDrop(String device) throws InterruptedException {
		dp = new TC_04_VerifyDragAndDrop(driver);
		GenericLibrary.swipeBottomToTop(0.6, 0.3, driver);
		GenericLibrary.click(dp.clickOnView(), driver);

		// System.out.println(dp.clickOnDragAndDropText());
		GenericLibrary.click(dp.clickOnDragAndDropText(), driver);
//		System.out.println("step1 : click "+ dp.clickOnDragAndDropText());
		GenericLibrary.waitForVisibility(dp.getDragFirst(), driver);
//		System.out.println("step2 : wait for  "+ dp.getDragFirst());
		GenericLibrary.waitForVisibility(dp.getDragSecond(),driver);
//		System.out.println("step3 wait for "+ dp.getDragSecond());
//		System.out.println("perform dragand drop");
		GenericLibrary.dragAndDrop(dp.getDragFirst(), dp.getDragSecond());
		System.out.println("step4: action completed");
		Thread.sleep(3000);
		//GenericLibrary.dragAndDrop(driver);

	}

}
