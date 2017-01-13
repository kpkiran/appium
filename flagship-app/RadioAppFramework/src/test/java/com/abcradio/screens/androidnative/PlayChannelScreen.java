package com.abcradio.screens.androidnative;

import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.Assert;

import org.openqa.selenium.WebElement;

import com.abcradio.base.ScreenBase;
import com.abcradio.screens.locators.ABCRadioHomeScreenLocators;
import com.abcradio.screens.locators.PlayChannelScreenLocator;
import com.abcradio.screens.locators.SchedulerScreenLocator;
import com.abcradio.utils.ApplicationUtils;

import io.appium.java_client.android.AndroidDriver;

public class PlayChannelScreen extends ScreenBase {
	
	ABCRadioHomeScreenLocators homeScreenLocators = new ABCRadioHomeScreenLocators(driver);
	PlayChannelScreenLocator playChannelLocator = new PlayChannelScreenLocator(driver);
	SchedulerScreenLocator schedulerScreenLocator = new SchedulerScreenLocator(driver);
	
	public PlayChannelScreen(AndroidDriver<WebElement> driver) {
		super(driver);
	}
	
	
	/*
	 * This method clicks on the calendar in the channel play screen and assert the element present.
	 * It also asserts the dates existence and if it is equal to the current date.
	 */
	public PlayChannelScreen playScreenCalendar() throws InterruptedException {
		Thread.sleep(7000);
		homeScreenLocators.radioStations.get(1).click();
		ApplicationUtils.wait(playChannelLocator.calendar.toString());
		playChannelLocator.calendar.click();
		Assert.assertTrue(playChannelLocator.calendarScreenHeader.isDisplayed());
		Assert.assertTrue(playChannelLocator.calendarSubHeader.isDisplayed());

		Date curDate = new Date();
		SimpleDateFormat format = new SimpleDateFormat("EEEEE dd MMMMM");
		String DateToStr = format.format(curDate);
		
		Assert.assertEquals(DateToStr, playChannelLocator.calendarSubHeader.getText());
		Assert.assertEquals("prev", playChannelLocator.prevLink.getText());
		Assert.assertEquals("next", playChannelLocator.rightLink.getText());
		
		return this;
	}
	
	/*
	 * This method clicks on the next and prev links on the scheduler / calendar 
	 */
	public PlayChannelScreen clickNextPrevLink() throws InterruptedException {
		Thread.sleep(7000);

		if(playChannelLocator.rightLink.isEnabled())
			playChannelLocator.rightLink.click();
		
		if(playChannelLocator.rightLink.isEnabled())
			playChannelLocator.prevLink.click();
		
		playChannelLocator.backButton.click();
		schedulerScreenLocator.schedulerBackButton.click();
		
		return this;
	}
}
