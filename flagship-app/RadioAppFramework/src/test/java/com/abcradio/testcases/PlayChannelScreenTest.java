package com.abcradio.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.abcradio.base.TestBase;
import com.abcradio.screens.androidnative.PlayChannelScreen;

public class PlayChannelScreenTest extends TestBase {
	
	@BeforeTest
	public void init() {
		playChannelScreen = new PlayChannelScreen(driver);
	}
	
	@Test
	public void playScreenCalendarTest() throws InterruptedException {
		playChannelScreen.playScreenCalendar();
	}
	
	@Test
	public void clickNextPrevLinkTest() throws InterruptedException {
		playChannelScreen.clickNextPrevLink();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
