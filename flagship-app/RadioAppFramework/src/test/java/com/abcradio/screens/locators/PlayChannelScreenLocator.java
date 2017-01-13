package com.abcradio.screens.locators;

import org.openqa.selenium.WebElement;
import com.abcradio.base.ScreenBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

public class PlayChannelScreenLocator extends ScreenBase {

	public PlayChannelScreenLocator(AndroidDriver<WebElement> driver) {
		super(driver);
	}

	/*
	 * XPath for back button in the channel header
	 */
	@AndroidFindBys({ @AndroidFindBy(id = "com.thisisaim.abcradio:id/tlbMain"),
			@AndroidFindBy(className = "android.widget.TextView") })
	public WebElement channelHeaderText;

	/*
	 * XPath for back button in the channel screen
	 */
	@AndroidFindBys({ @AndroidFindBy(id = "com.thisisaim.abcradio:id/tlbMain"),
			@AndroidFindBy(className = "android.widget.ImageButton") })
	public WebElement backButton;

	/*
	 * XPath for the calendar
	 */
	@AndroidFindBy(id = "com.thisisaim.abcradio:id/menProgramGuide")
	public WebElement calendar;
	
	/*
	 * XPath for the calendar screen header
	 */
	@AndroidFindBys({
		@AndroidFindBy(id="com.thisisaim.abcradio:id/tlbMain"),
		@AndroidFindBy(className="android.widget.TextView")
	}) public WebElement calendarScreenHeader;
	
	/*
	 * XPath for the calendar screen sub header
	 */
	@AndroidFindBy(id="com.thisisaim.abcradio:id/txtSubHeaderTitle") 
	public WebElement calendarSubHeader;
	
	@AndroidFindBy(id="com.thisisaim.abcradio:id/btnLeft")
	public WebElement prevLink;
	
	
	@AndroidFindBy(id="com.thisisaim.abcradio:id/btnRight")
	public WebElement rightLink;
}
