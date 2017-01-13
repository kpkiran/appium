package com.abcradio.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.abcradio.base.TestBase;
import com.abcradio.screens.androidnative.WhatsOnNowScreen;

public class WhatsOnNowScreenTest extends TestBase {
	
	@BeforeTest
	public void init() {
		whatsOnNowScreen = new WhatsOnNowScreen(driver);
	}
	
	@Test
	public void verifyElementsPresentTest() throws InterruptedException {
		whatsOnNowScreen.verifyElementsPresent();
	}
	
	@Test
	public void backButtonTest() throws InterruptedException {
		whatsOnNowScreen.backButton();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
