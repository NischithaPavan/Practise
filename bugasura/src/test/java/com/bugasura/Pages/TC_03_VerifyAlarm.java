package com.bugasura.Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class TC_03_VerifyAlarm {

	AppiumDriver driver;
	public TC_03_VerifyAlarm(AppiumDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}


