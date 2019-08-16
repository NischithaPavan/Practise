package com.bugasura.testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bugasura.Library.BaseLibrary;
import com.bugasura.Library.GenericLibrary;
import com.bugasura.Library.HtmlReportListener;
import com.bugasura.Pages.TC_05_VerifyCheckBox;

public class VerifyCheckBoxTest extends BaseLibrary {

	TC_05_VerifyCheckBox chkBox;
	@Parameters("device")
	@Test
	public void verifyCheckBox(String device) {
		chkBox=new TC_05_VerifyCheckBox(driver);
		HtmlReportListener.test=HtmlReportListener.extent.createTest("ApiDemo test", "Verify all the checkbox");
		
		GenericLibrary.click(chkBox.clickAccessText(), driver);
		GenericLibrary.click(chkBox.clickOnAccessNodeQuery(), driver);
		//GenericLibrary.click(chkBox.clickOnThirdCheckBox(), driver);
		//GenericLibrary.waitForVisibility(chkBox.clickOnThirdCheckBox(), driver);
		//Assert.assertTrue(chkBox.clickOnThirdCheckBox().isEnabled(), "Checkbox is not selected");
		//System.out.println("CheckBox is selected");
		//boolean checkForCheckBox=chkBox.clickOnThirdCheckBox().isSelected();
		//System.out.println(checkForCheckBox);
		
		
		//System.out.println(chkBox.clickOnAllCheckBox().size());
		for (int i =1 ; i < chkBox.clickOnAllCheckBox().size(); i++) {
			if(chkBox.clickOnAllCheckBox().get(i).isSelected()) {
				//System.out.println("Not checked");
				//chkBox.clickOnAllCheckBox().get(i).click();
				continue;
			}
			else
			{
				GenericLibrary.click(chkBox.clickOnAllCheckBox().get(i), driver);
				System.out.println("Clicking on checkbox");
			}
		}
		
	}
}
