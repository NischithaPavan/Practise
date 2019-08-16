package com.bugasura.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class TC_05_VerifyCheckBox {

	
	AppiumDriver driver;
	
	public  TC_05_VerifyCheckBox(AppiumDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@text='Accessibility']")
	private WebElement textAccess;
	public WebElement clickAccessText() {
		return textAccess;
	}
	@FindBy(xpath="//*[@text='Accessibility Node Querying']")
	private WebElement textAccessNodeQuery;
	public WebElement clickOnAccessNodeQuery(){
		return textAccessNodeQuery;
	}
	@FindBy(xpath="(//*[@text='Conquer World']/following::android.widget.CheckBox)[1]")
	private WebElement thirdCheckBox;
	public WebElement clickOnThirdCheckBox() {
		return thirdCheckBox;
		
	}
	@FindBy(xpath="//*[@class='android.widget.CheckBox']")
	private List<WebElement> clickCheckBoxs;
	public List<WebElement> clickOnAllCheckBox() {
		return clickCheckBoxs;
	
	
	
	}
	}
