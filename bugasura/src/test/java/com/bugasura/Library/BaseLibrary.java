package com.bugasura.Library;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseLibrary {
	
	public DesiredCapabilities capabilities=null;	
	public static AppiumDriver<MobileElement> driver=null;	
	public static String sDirPath = System.getProperty("user.dir");
	public static String sConfigPath = sDirPath+"\\config.properties";
	public String sApp=GenericLibrary.getConfigValue(sConfigPath,"TestApp");


 @BeforeClass
 public void launchApp() throws MalformedURLException {
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", GenericLibrary.getConfigValue(sConfigPath, "AutomationName"));
		capabilities.setCapability("platformName", GenericLibrary.getConfigValue(sConfigPath, "PlatformName"));
		capabilities.setCapability("platformVersion", GenericLibrary.getConfigValue(sConfigPath, "PlatformVersion"));
		capabilities.setCapability("deviceName", GenericLibrary.getConfigValue(sConfigPath, "DeviceName"));
		capabilities.setCapability("Did", GenericLibrary.getConfigValue(sConfigPath, "DID"));
        capabilities.setCapability("appPackage", GenericLibrary.getConfigValue(sConfigPath, "AppPackage"));
		capabilities.setCapability("appActivity", GenericLibrary.getConfigValue(sConfigPath, "AppActivity"));
		capabilities.setCapability("noReset", GenericLibrary.getConfigValue(sConfigPath, "UnclearCache"));
		
		capabilities.setCapability("newCommandTimeOut",GenericLibrary.getConfigValue(sConfigPath, "TimeOut"));
        driver = new AndroidDriver<MobileElement>(new URL(GenericLibrary.getConfigValue(sConfigPath, "AppiumServer_URL")),capabilities);
        //capabilities.setCapability("app", sDirPath+"\\"+"app\\"+sApp+".apk");
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
}
	@AfterClass
	public void tearDown()
	{
		driver.closeApp();
	}
	

}

