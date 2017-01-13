package com.abcradio.screens.locators;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import java.util.List;
import org.openqa.selenium.WebElement;
import com.abcradio.base.ScreenBase;

public class ABCRadioHomeScreenLocators extends ScreenBase {
	
	public ABCRadioHomeScreenLocators(AndroidDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/* 
	 * XPath of the text choose local stations 
	 */
	@AndroidFindBy(id = "com.thisisaim.abcradio:id/btnChooseLocalStations")
	public WebElement chooseLocalStationsText;

	/* 
	 * XPath for Live text above the horizontal carousel 
	 */
	@AndroidFindBys({
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lytStationsHeader"),
			@AndroidFindBy(className = "android.widget.TextView") })
	public List<WebElement> liveTextView;
	
	/*
	 * XPath for "What's On Now?"
	 */
	@AndroidFindBy(id="com.thisisaim.abcradio:id/btnWhatsOn") public WebElement whatsOnNow;

	/* 
	 * XPath for the outer element of the horizontal channel Carousel 
	 */
	@AndroidFindBys({
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/recStations"),
			@AndroidFindBy(className="android.widget.RelativeLayout"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/btnStationLogo") })
	public List<WebElement> radioStations;

	/* 
	 * XPath for Featured radio channel path 
	 */
	@AndroidFindBys({
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/recFeatured"),
			@AndroidFindBy(className = "android.widget.RelativeLayout") })
	public List<WebElement> featuredRadioChannels;

	/* 
	 * XPath for Listen later path on home screen 
	 */
	@AndroidFindBys({
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/recFeatured"),
			@AndroidFindBy(className = "android.widget.RelativeLayout"),
			@AndroidFindBy(className = "android.widget.LinearLayout"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/btnAdd"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/imgAdd") })
	public WebElement listenLater;

	/* 
	 * XPath for listen later OK button 
	 */
	@AndroidFindBys({ 
			@AndroidFindBy(id = "android:id/parentPanel"),
			@AndroidFindBy(id = "android:id/buttonPanel"),
			@AndroidFindBy(id = "android:id/button1") })
	public WebElement listenLaterOK;

	/* 
	 * XPath for listen later Cancel button 
	 */
	@AndroidFindBys({ @AndroidFindBy(id = "android:id/parentPanel"),
			@AndroidFindBy(id = "android:id/buttonPanel"),
			@AndroidFindBy(id = "android:id/button2") })
	public WebElement listenLaterCancel;

	/* 
	 * Radio channel name on the home screen lower carousel 
	 */
	@AndroidFindBys({
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lytControls"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lytInfo"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/txtInfo1") })
	public WebElement radioChannelText;

	/* 
	 * XPath for Listen Later text 
	 */
	@AndroidFindBys({ @AndroidFindBy(id = "android:id/parentPanel"),
			@AndroidFindBy(id = "android:id/contentPanel"),
			@AndroidFindBy(id = "android:id/message") })
	public WebElement listenLaterText;
	
	/* 
	 * XPath for exploreMenu 
	 */
	@AndroidFindBys({
		@AndroidFindBy(id="com.thisisaim.abcradio:id/lytTab"),
		@AndroidFindBy(id="com.thisisaim.abcradio:id/btnExplore")
	}) public WebElement exploreMenu;
}