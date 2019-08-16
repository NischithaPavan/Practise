package com.bugasura.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class TC_06_VerifyCustomCheckBox {

	AppiumDriver driver;
	public  TC_06_VerifyCustomCheckBox(AppiumDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@text='Animation']")
	private WebElement textAnimation;
	public WebElement clickOnAnimation() {
		return textAnimation;
    }
	@FindBy(xpath="//*[contains(@text,'Hide-Show Animations')]")
	private WebElement textShowAnimations;
	public WebElement clickOnShowAnimations() {
		return textShowAnimations;
		
	}
	@FindBy(xpath="//android.widget.CheckBox[@text='Custom Animations']")
	private WebElement CustomCheckBox;
	public WebElement clickOnCustomCheckBox() {
		return CustomCheckBox;
		
	}
}
