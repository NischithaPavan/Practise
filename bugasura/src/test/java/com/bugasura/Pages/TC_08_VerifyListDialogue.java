package com.bugasura.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class TC_08_VerifyListDialogue {

	AppiumDriver driver;

	public TC_08_VerifyListDialogue(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@text='App']")
	private WebElement textApp;

	public WebElement clickOnAppTextT() {
		return textApp;
	}

	@FindBy(xpath = "//*[@text='Activity']")
	private WebElement textActivity;

	public WebElement clickOnActivityText() {
		return textActivity;

	}

	@FindBy(xpath = "//*[@text='Animation']")
	private WebElement textAnimation;

	public WebElement clickOnAnimationText() {
		return textAnimation;

	}

	@FindBy(xpath = "//*[@content-desc='Fade in']")
	private WebElement textFadeIn;

	public WebElement clickOnFadeInText() {
		return textFadeIn;
	}

	@FindBy(xpath = "//*[@text='LIST DIALOG']")
	private WebElement textListDialogue;

	public WebElement clickOnListDialogue() {
		return textListDialogue;

	}

	@FindBy(xpath = "//android.widget.ListView/android.widget.TextView[@text='Command one']")
	private WebElement dialogueBox;

	public WebElement clickOnDialogueBox() {
		return dialogueBox;

	}

	// @FindBy(xpath="//*[@resource-id='android:id/message']")
	// private WebElement textmessage;
	// public WebElement captureMessage() {
	// return textmessage;
	//
	// }

}
