package com.bugasura.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class TC_07_VerifyToggleButton {
	AppiumDriver driver;
	public TC_07_VerifyToggleButton(AppiumDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(xpath="//android.widget.TextView[@text='Preference']")
	private WebElement textPreference;
	public WebElement clickOnPreference() {
		return textPreference;
	}
	
	@FindBy(xpath="//android.widget.TextView[9]")
	private WebElement textSwitch;
	public WebElement clickOnSwitch() {
		return textSwitch;
		
	}
	@FindBy(xpath="//android.widget.Switch[@text='OFF']")
	private WebElement togglebuttonSwitch;
	public WebElement clickOnSwitchToggleButton() {
		return togglebuttonSwitch;
	}

}
