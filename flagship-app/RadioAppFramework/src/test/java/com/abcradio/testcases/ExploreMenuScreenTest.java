package com.abcradio.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.abcradio.base.TestBase;
import com.abcradio.screens.androidnative.ExploreMenuScreen;

public class ExploreMenuScreenTest extends TestBase {
	
	@BeforeTest
	public void init() {
		exploreMenuScreen = new ExploreMenuScreen(driver);
	}
	
	@Test
	public void validateExploreMenuScreenTest() throws InterruptedException {
		exploreMenuScreen.verifyElementsPresent();
	}
	
	@Test
	public void verifySubTabElementsPresenceTest() {
		exploreMenuScreen.verifySubTabElementsPresence();
	}
	
	@Test
	public void clickByCategoryListItemTest()  {
		exploreMenuScreen.clickByCategoryListItem();
	}
	
	@Test
	public void clickAtoZListItemTest() {
		exploreMenuScreen.clickAtoZListItem();
	}
	
	@Test
	public void clickByStationListItemTest() {
		exploreMenuScreen.clickByStationListItem();
	}
	
	@Test
	public void homeScreenNavigationTest() {
		exploreMenuScreen.homeScreenNavigation();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
