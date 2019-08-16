package com.bugasura.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.org.apache.xml.internal.security.Init;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TC_09_VerifySingleChoiceList {
	
	AppiumDriver driver;
	public TC_09_VerifySingleChoiceList(AppiumDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	

	@FindBy(xpath="//*[@content-desc='Single choice list']")
	private WebElement textSingleChoice;
	public WebElement clickOnSingleChoice() {
		return textSingleChoice;
		
	}
	@FindBy(xpath="//android.widget.ListView/android.widget.CheckedTextView[@text='Street view']")
	private WebElement radioBtnStreetView;
	public WebElement clickOnStreetView() {
		return radioBtnStreetView;
		
	}
	@FindBy(xpath="//*[@text='OK']")
	private WebElement textOk;
	public WebElement clickOnTextOk() {
		return textOk;
		
	}
	

}
