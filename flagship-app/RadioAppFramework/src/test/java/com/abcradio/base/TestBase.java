package com.abcradio.base;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.abcradio.screens.androidnative.ABCRadioHomeScreen;
import com.abcradio.screens.androidnative.ExploreMenuScreen;
import com.abcradio.screens.androidnative.PlayChannelScreen;
import com.abcradio.screens.androidnative.WhatsOnNowScreen;
import com.abcradio.utils.ApplicationUtils;

public class TestBase {

	public static AndroidDriver<WebElement> driver;
	public static ABCRadioHomeScreen homeScreen;
	public static ExploreMenuScreen exploreMenuScreen;
	public static PlayChannelScreen playChannelScreen;
	public static WhatsOnNowScreen whatsOnNowScreen; 

	@BeforeSuite
	public void setUp() throws IOException {
		if (driver == null) {
			ApplicationUtils.loadConfigFile("androidtestapp");
			ApplicationUtils.setAndroidCapabilities();
			driver = ApplicationUtils.getDriver();
		}
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}