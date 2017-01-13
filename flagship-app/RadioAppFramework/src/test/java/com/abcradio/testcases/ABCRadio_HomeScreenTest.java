package com.abcradio.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.abcradio.base.TestBase;
import com.abcradio.screens.androidnative.ABCRadioHomeScreen;

public class ABCRadio_HomeScreenTest extends TestBase{
	
	@BeforeTest
	public void init() {
		homeScreen = new ABCRadioHomeScreen(driver);
	}
	
	@Test
	public void validateHomeScreenTest() throws InterruptedException {
		homeScreen.verifyElementsPresent();
	}
	
	@Test
	public void liveRadioChannelTest() throws InterruptedException {
		homeScreen.liveRadioChannel();
	}
	
	@Test
	public void featuredRadioChannelTest() throws InterruptedException {
		homeScreen.featuredRadioChannel();
	}
	
	@Test
	public void listenLaterTest() throws InterruptedException {
		homeScreen.listenLater();
	}
	
//	@Test
//	public void lowerCarouselTest() throws InterruptedException {
//		homeScreen.lowerCarousel();
//	}
	
	@Test
	public void exploreMenuTest() throws InterruptedException {
		homeScreen.exploreMenu();
	}
	
	@Test
	public void whatsOnNowTest() throws InterruptedException {
		homeScreen.whatsOnNow();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}