package com.abcradio.screens.locators;

import org.openqa.selenium.WebElement;

import com.abcradio.base.ScreenBase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

public class SchedulerScreenLocator extends ScreenBase {
	
	public SchedulerScreenLocator(AndroidDriver<WebElement> driver) {
		super(driver);
	}

	@AndroidFindBys({
		@AndroidFindBy(id="com.thisisaim.abcradio:id/tlbMain"),
		@AndroidFindBy(className="android.widget.ImageButton")
	})
	public WebElement schedulerBackButton;
	
}
