package com.abcradio.screens.androidnative;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.abcradio.base.ScreenBase;
import com.abcradio.screens.locators.WhatsOnNowScreenLocators;

public class WhatsOnNowScreen extends ScreenBase {
	
	WhatsOnNowScreenLocators whatsonnowScreenLocators = new WhatsOnNowScreenLocators(driver);

	public WhatsOnNowScreen(AndroidDriver<WebElement> driver) {
		super(driver);
	}
	
	/*
	 * This method asserts the header element and the back button are available on the screen.
	 */
	public WhatsOnNowScreen verifyElementsPresent() throws InterruptedException {
		Thread.sleep(4000);
		Assert.assertTrue((whatsonnowScreenLocators.whatsonnowBackButton.isDisplayed()));
		Assert.assertTrue(whatsonnowScreenLocators.whatsonnowHeaderText.isDisplayed());
		
		return this;
	}
	
	/*
	 * This method clicks on the back button that is available on the screen.
	 */
	public ABCRadioHomeScreen backButton() throws InterruptedException {
		Thread.sleep(4000);
		whatsonnowScreenLocators.whatsonnowBackButton.click();
		return new ABCRadioHomeScreen(driver);
	}
}
