package com.bugasura.Library;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
//import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
//import static io.appium.java_client.touch.TapOptions.tapOptions;

public class GenericLibrary extends BaseLibrary {
	public static Dimension screenSize;
	public static int screenHeight;
	public static int screenWidth;
	public static String sTestDataFile=BaseLibrary.sDirPath+"\\apidemo.xlsx";

	public static String getConfigValue(String sFile, String sKey) {
		Properties prop = new Properties();
		String sValue = null;
		try {
			InputStream ip = new FileInputStream(sFile);
			prop.load(ip);
			sValue = prop.getProperty(sKey);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sValue;
	}

	public static void swipeTopToBottom(double startY, double endY, AppiumDriver driver) {
		driver = BaseLibrary.driver;
		screenSize = driver.manage().window().getSize();
		screenHeight = screenSize.height;
		screenWidth = screenSize.width;
		int startx = screenHeight / 2;
		int starty = (int) (screenHeight * startY);
		int endy = (int) (screenWidth * endY);
		BaseLibrary.driver.swipe(startx, endy, startx, starty, 3000);
	}

	public static void tabOnElement(double x, double y) {
		int elementX = (int) (screenWidth * x);
		int elementY = (int) (screenHeight * y);
		BaseLibrary.driver.tap(1, elementX, elementY, 1);
	}

	public static void swipeBottomToTop(double startY, double endY, AppiumDriver driver) {
		driver = BaseLibrary.driver;
		screenSize = driver.manage().window().getSize();
		screenHeight = screenSize.height;
		screenWidth = screenSize.width;
		int startx = screenHeight / 2;
		int starty = (int) (screenHeight * startY);
		int endy = (int) (screenHeight * endY);
		BaseLibrary.driver.swipe(startx, starty, startx, endy, 3000);

	}

	// public static void scrollUntillElementIsPresent( ,AppiumDriver driver) {
	// BaseLibrary.driver.findElementByXPath("new UiScrollable(new
	// UiSelector()).scrollIntoView(text(element));");
	public static void scrollAndClick(String visibleText, AppiumDriver driver) {
		driver.findElementByXPath(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))")
				.click();
	}

	public static void waitForVisibility(WebElement element, AppiumDriver driver) {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForAllVisibility(WebElement eleLocation, AppiumDriver driver) {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfAllElements((List<WebElement>) eleLocation));
	}

	public static void waitForclickable(WebElement element, AppiumDriver driver) {
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void click(WebElement element, AppiumDriver driver) {
		waitForVisibility(element, driver);
		waitForclickable(element, driver);
		element.click();

	}

	public static void sendkeys(WebElement element, String value, AppiumDriver driver) {
		waitForVisibility(element, driver);
		waitForclickable(element, driver);
		element.sendKeys(value);
	}

	public static void dragAndDrop(WebElement ele1,WebElement ele2) {
		System.out.println("ele1" + ele1.toString());
		System.out.println("ele2" + ele2.toString());
		System.out.println("driver " + driver);
		TouchAction action = new TouchAction(driver);

		//WebElement ele1 = driver.findElementById("drag_dot_1");
		//WebElement ele2 = driver.findElementById("drag_dot_2");
		//action.longPress(ele1).moveTo(ele2).perform().release();

//		action.longPress(driver.findElementById("drag_dot_1")).moveTo(driver.findElementById("drag_dot_2")).perform().release();

		
		action.longPress(ele1).moveTo(ele2).release().perform();
		
       }
	public static String getVisibleAreaScreenshot(AppiumDriver driver,String ScreenshotName) {
		//Convert Webdriver instance to takeAScreenShot
		TakesScreenshot ts=(TakesScreenshot)driver;
		//Call getScreenShotAs to create image File
		File source=ts.getScreenshotAs(OutputType.FILE);
		String dest=System.getProperty("user.dir")+"//VisibleViewScreenshots//"+ScreenshotName+".png";
		File destination=new File (dest);
		
		try {
			FileUtils.copyFile(source, destination);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return dest;
	}
	
	public static String[] toReadExcelData(String sSheet,String sTestCaseID) throws EncryptedDocumentException, InvalidFormatException, IOException {
		String[] sData=null;
		FileInputStream fis=new FileInputStream(sTestDataFile);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sht=wb.getSheet(sSheet);
		int rowNum=sht.getLastRowNum();
		
		for(int i=1; i<=rowNum; i++) {
			
			if(sht.getRow(i).getCell(0).toString().equals(sTestCaseID)) {
				
				int cellNum=sht.getRow(i).getLastCellNum();
				sData=new String[cellNum];
				
				for(int j=0; j<cellNum; j++) {
					sData[j]=sht.getRow(i).getCell(j).getStringCellValue();
				}
				break;
			}
			
		}
		return sData;
		
		
		
		
		
		
	}
	

}
