package com.abcradio.base;

import java.util.List;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

public class ScreenBase {
	
	public static AndroidDriver<WebElement> driver;
	public static TouchAction action;
	public static TouchActions actions;
	public static List<WebElement> channelList;
	
	public ScreenBase(AndroidDriver<WebElement> driver) {
		ScreenBase.driver = driver;
		loadElements();
	}
	
	public void loadElements() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
}
