package com.abcradio.screens.locators;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import org.openqa.selenium.WebElement;
import com.abcradio.base.ScreenBase;

public class WhatsOnNowScreenLocators extends ScreenBase {

	public WhatsOnNowScreenLocators(AndroidDriver<WebElement> driver) {
		super(driver);
	}
	
	/*
	 * XPath for the header text of What's on now screen 
	 */
	@AndroidFindBys({
		@AndroidFindBy(id="com.thisisaim.abcradio:id/tlbMain"),
		@AndroidFindBy(className="android.widget.TextView")
	})
	public WebElement whatsonnowHeaderText;
	
	/*
	 * XPath for the back button on What's on now screen 
	 */
	@AndroidFindBys({
		@AndroidFindBy(id="com.thisisaim.abcradio:id/tlbMain"),
		@AndroidFindBy(className="android.widget.ImageButton")
	})
	public WebElement whatsonnowBackButton;
	
	

}
