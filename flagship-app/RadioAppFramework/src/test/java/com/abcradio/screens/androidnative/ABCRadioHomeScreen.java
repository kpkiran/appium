package com.abcradio.screens.androidnative;

import junit.framework.Assert;

import org.openqa.selenium.WebElement;

import com.abcradio.base.ScreenBase;
import com.abcradio.screens.locators.ABCRadioHomeScreenLocators;
import com.abcradio.screens.locators.PlayChannelScreenLocator;
import com.abcradio.utils.ApplicationUtils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class ABCRadioHomeScreen extends ScreenBase {

	ABCRadioHomeScreenLocators homeScreenLocators = new ABCRadioHomeScreenLocators(driver);
	PlayChannelScreenLocator playChannelLocator = new PlayChannelScreenLocator(driver);
	
	public ABCRadioHomeScreen(AndroidDriver<WebElement> driver) {
		super(driver);
	}

	/* 
	 * This method verifies the elements presence on the home screen 
	 */
	public ABCRadioHomeScreen verifyElementsPresent()
			throws InterruptedException {
		Thread.sleep(4000);
		
		Assert.assertEquals("Live", homeScreenLocators.liveTextView.get(0).getText());
		Assert.assertEquals("What's on now?", homeScreenLocators.liveTextView.get(1).getText());
		Assert.assertEquals("Choose local stations",
				homeScreenLocators.chooseLocalStationsText.getText());
		return this;
	}

	/* 
	 * This method scrolls across all the Live radio channels and plays each and every channel 
	 */
	public ABCRadioHomeScreen liveRadioChannel() throws InterruptedException {
		Thread.sleep(4000);
		action = new TouchAction(driver);
		for (int i = 0; i < homeScreenLocators.radioStations.size(); i++) {
			homeScreenLocators.radioStations.get(i).click();
			playChannelLocator.backButton.click();
		}
		action.longPress(homeScreenLocators.radioStations.get(3)).moveTo(18, 392).release()
				.perform();
		for (int i = 1; i < homeScreenLocators.radioStations.size(); i++) {
			homeScreenLocators.radioStations.get(i).click();
			playChannelLocator.backButton.click();
		}
		action.longPress(homeScreenLocators.radioStations.get(3)).moveTo(18, 392).release()
				.perform();
		for (int i = 1; i < homeScreenLocators.radioStations.size(); i++) {
			homeScreenLocators.radioStations.get(i).click();
			playChannelLocator.backButton.click();
		}
		action.longPress(homeScreenLocators.radioStations.get(3)).moveTo(18, 392).release()
				.perform();
		for (int i = 1; i < homeScreenLocators.radioStations.size(); i++) {
			homeScreenLocators.radioStations.get(i).click();
			playChannelLocator.backButton.click();
		}
		action.longPress(homeScreenLocators.radioStations.get(3)).moveTo(18, 392).release()
				.perform();
		for (int i = 1; i < homeScreenLocators.radioStations.size(); i++) {
			homeScreenLocators.radioStations.get(i).click();
			playChannelLocator.backButton.click();
		}
		return this;
	}
	
	/* 
	 * This method scrolls across all the featured radio channels and plays each and every channel 
	 */
	public ABCRadioHomeScreen featuredRadioChannel()
			throws InterruptedException {

		Thread.sleep(4000);
		action = new TouchAction(driver);

		homeScreenLocators.featuredRadioChannels.get(0).click();
		playChannelLocator.backButton.click();
		Thread.sleep(2000);
		action.longPress(homeScreenLocators.featuredRadioChannels.get(0)).moveTo(5, 5).release()
				.perform();

		homeScreenLocators.featuredRadioChannels.get(1).click();
		playChannelLocator.backButton.click();
		Thread.sleep(3000);
		action.longPress(homeScreenLocators.featuredRadioChannels.get(1)).moveTo(5, 5).release()
				.perform();

		homeScreenLocators.featuredRadioChannels.get(1).click();
		playChannelLocator.backButton.click();
		Thread.sleep(3000);
		action.longPress(homeScreenLocators.featuredRadioChannels.get(1)).moveTo(5, 5).release()
				.perform();

		homeScreenLocators.featuredRadioChannels.get(1).click();
		playChannelLocator.backButton.click();
		Thread.sleep(3000);
		action.longPress(homeScreenLocators.featuredRadioChannels.get(1)).moveTo(5, 5).release()
				.perform();

		homeScreenLocators.featuredRadioChannels.get(1).click();
		playChannelLocator.backButton.click();
		Thread.sleep(3000);
		action.longPress(homeScreenLocators.featuredRadioChannels.get(1)).moveTo(5, 5).release()
				.perform();

		homeScreenLocators.featuredRadioChannels.get(1).click();
		playChannelLocator.backButton.click();
		Thread.sleep(3000);
		action.longPress(homeScreenLocators.featuredRadioChannels.get(1)).moveTo(5, 5).release()
				.perform();

		homeScreenLocators.featuredRadioChannels.get(1).click();
		playChannelLocator.backButton.click();
		Thread.sleep(3000);
		action.longPress(homeScreenLocators.featuredRadioChannels.get(1)).moveTo(5, 5).release()
				.perform();

		homeScreenLocators.featuredRadioChannels.get(1).click();
		playChannelLocator.backButton.click();
		Thread.sleep(3000);
		action.longPress(homeScreenLocators.featuredRadioChannels.get(1)).moveTo(5, 5).release()
				.perform();

		homeScreenLocators.featuredRadioChannels.get(1).click();
		playChannelLocator.backButton.click();
		Thread.sleep(3000);
		action.longPress(homeScreenLocators.featuredRadioChannels.get(1)).moveTo(5, 5).release()
				.perform();
		
		driver.closeApp();
		driver.launchApp();
		return this;
	}
	
	/* 
	 * This method selects the Listen Later option for a channel and confirms OK on the pop up. 
	 */
	public ABCRadioHomeScreen listenLater() throws InterruptedException {
		Thread.sleep(4000);
		homeScreenLocators.listenLater.click();
		Assert.assertEquals(
				"Remove episodes from the Listen Later list 24 hrs after listening?",
				homeScreenLocators.listenLaterText.getText());
		homeScreenLocators.listenLaterOK.click();
		return this;
	}

	/* 
	 * This method checks of the lower carousel on the home screen displays the radio channel that was selected 
	 */
	public ABCRadioHomeScreen lowerCarousel() throws InterruptedException {
		Thread.sleep(4000);
		action = new TouchAction(driver);
		// Tap on a radio station
		action.tap(homeScreenLocators.radioStations.get(0)).perform();
		// On the play screen, get the text of the header
		String playChannelHeaderText = ApplicationUtils
				.getHeaderText(playChannelLocator.channelHeaderText);
		// Click on back button
		playChannelLocator.backButton.click();
		// On the home screen, get the text from the lower carousel
		String homeScreenCarouselText = ApplicationUtils
				.getHeaderText(homeScreenLocators.radioChannelText);
		// Assert text from home screen and text from play screen
		Assert.assertEquals(homeScreenCarouselText, playChannelHeaderText);
		return this;
	}
	
	/*
	 * This method navigates to the What's On Now  
	 */
	public WhatsOnNowScreen whatsOnNow() throws InterruptedException {
		Thread.sleep(4000);
		action = new TouchAction(driver);
		action.tap(homeScreenLocators.whatsOnNow).perform();
		return new WhatsOnNowScreen(driver);
	}
	
	/* 
	 * This method navigates to the explore menu 
	 */
	public ExploreMenuScreen exploreMenu() throws InterruptedException {
		Thread.sleep(5000);
		action = new TouchAction(driver);
		action.tap(homeScreenLocators.exploreMenu).perform();
		return new ExploreMenuScreen(driver);
	}
	
	
}