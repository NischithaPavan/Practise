package com.bugasura.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class TC_12_EnableWifi {
	
	AppiumDriver driver;
	public TC_12_EnableWifi(AppiumDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath= "//*[@text='Views']")
	private WebElement textViews;
	public WebElement clickOnViews() {
		return textViews;
	}
	@FindBy(xpath="//*[@text='Expandable Lists']")
	private WebElement textExpandableLists;
	public WebElement clickOnExpandableLists() {
		return textExpandableLists;
	}
	@FindBy(xpath="//android.widget.TextView[@text='2. Cursor (People)']")
	private WebElement textCursor;
	public WebElement clickOnCursor() {
		return textCursor;
		
	}
	@FindBy(xpath="//*[@text='Instant help 24x7']")
	private WebElement dropDown;
	public WebElement clickOndropDown() {
		return dropDown;
		
	}

	
}
