package com.bugasura.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bugasura.Library.BaseLibrary;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TC_04_VerifyDragAndDrop extends BaseLibrary {

	public TC_04_VerifyDragAndDrop(AppiumDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@text='Views']")
	private WebElement textView;

	public WebElement clickOnView() {
		return textView;
	}

	@FindBy(xpath = "//*[contains(@text,'Drag and Drop')]")
	private WebElement dragAndDropText;

	public WebElement clickOnDragAndDropText() {
		return dragAndDropText;

	}

	@FindBy(id = "drag_dot_1")
	private WebElement dragFirst;

	@FindBy(id = "drag_dot_2")
	private WebElement dragSecond;

	public WebElement getDragFirst() {
		return driver.findElementById("drag_dot_1");
	}

	public WebElement getDragSecond() {
		return driver.findElementById("drag_dot_2");
	}

}
