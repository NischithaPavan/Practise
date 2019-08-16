package com.bugasura.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class TC_02_VerifyWallPaper {
	AppiumDriver driver;
	
	public TC_02_VerifyWallPaper(AppiumDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//click On App
	@FindBy(xpath="//*[@text='App']")
    private WebElement Apptext;
	public WebElement clickOnAppText() {
		return Apptext;
	}
	
	//clicking on Activity
	@FindBy(xpath="//*[@text='Activity']")
	private WebElement Activity ;
	public WebElement clickOnAppActivity(){
		return Activity;
	}
	
	//Click on Wall Paper
	@FindBy(xpath="//*[@content-desc='Wallpaper']")
	private WebElement clickWallPaper;
	public WebElement clickOnWallpaper() {
		return clickWallPaper;
		
	}
}
