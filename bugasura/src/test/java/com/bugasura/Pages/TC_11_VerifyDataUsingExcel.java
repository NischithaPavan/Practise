package com.bugasura.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class TC_11_VerifyDataUsingExcel {
	AppiumDriver driver;
	
	public TC_11_VerifyDataUsingExcel(AppiumDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@content-desc='Text Entry dialog']")
	private WebElement textEnteryDialogue;
	public WebElement clickOnEnteryDialogue() {
		return textEnteryDialogue;
		
	}
	@FindBy(xpath="//android.widget.EditText[@id='username_edit']")
	private WebElement editUsername;
	public WebElement enterUsername() {
		return editUsername;
		
	}
	@FindBy(xpath="//android.widget.EditText[@id='password_edit']")
	private WebElement editPassword;
	public WebElement enterPassword() {
		return editPassword;
		
	}

}
