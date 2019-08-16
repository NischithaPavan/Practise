package com.bugasura.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class TC_01_VerifyAccessibilityNodeProvider {
	AppiumDriver driver;
	
	public TC_01_VerifyAccessibilityNodeProvider(AppiumDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@text='Accessibility']")	
	private WebElement eleAccessibility;
	
	public WebElement getAccessibility()
	{
		return eleAccessibility;
	}
	@FindBy(xpath="//*[contains(@text,'Accessibility Node Provider')]")
	
	private WebElement AccessibilityNodeProvider;
	
	public WebElement clickOnAccessibilityNodeProvider() {
		return AccessibilityNodeProvider;
	}

}
