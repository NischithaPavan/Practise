package com.bugasura.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class TC_10_VerifyToastermessage {
	AppiumDriver driver;
	public TC_10_VerifyToastermessage(AppiumDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//android.widget.ListView/android.widget.TextView[@text='Media']")
	private WebElement textMedia;
	public WebElement clickOnMediaText() {
		return textMedia;
		
	}
	@FindBy(xpath="//*[@text='MediaPlayer']")
	private WebElement textMediaPlayer;
	public WebElement clickOnMediaPlayer() {
		return textMediaPlayer;
		
	}
	@FindBy(xpath="//*[@content-desc='Play Video from Local File']")
	private WebElement textPlayVideo;
	public WebElement clickOnPlayVideo() {
		return textPlayVideo;
		
	}

}
