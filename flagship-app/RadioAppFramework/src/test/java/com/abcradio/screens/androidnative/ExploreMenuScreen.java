package com.abcradio.screens.androidnative;

import junit.framework.Assert;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import com.abcradio.base.ScreenBase;
import com.abcradio.screens.locators.ExploreMenuScreenLocators;
import com.abcradio.screens.locators.PlayChannelScreenLocator;
import com.abcradio.utils.ApplicationUtils;

public class ExploreMenuScreen extends ScreenBase {
	
	PlayChannelScreenLocator playChannelLocator = new PlayChannelScreenLocator(driver);
	ExploreMenuScreenLocators exploreMenuScreenLocators = new ExploreMenuScreenLocators(driver);
		
	public ExploreMenuScreen(AndroidDriver<WebElement> driver) {
		super(driver);
	}

	/* 
	 * This method verifies the elements on the Explore menu screen 
	 */
	public ExploreMenuScreen verifyElementsPresent()
			throws InterruptedException {
		Thread.sleep(4000);
		Assert.assertEquals("By Category", exploreMenuScreenLocators.category.getText());
		Assert.assertEquals("A-Z", exploreMenuScreenLocators.aToZ.getText());
		Assert.assertEquals("By Station", exploreMenuScreenLocators.byStation.getText());
		return this;		
	}

	/* 
	 * Assert the sub menu's By Category, A-Z and By Station 
	 */
	public ExploreMenuScreen verifySubTabElementsPresence() {
		action = new TouchAction(driver);
		action.tap(exploreMenuScreenLocators.category).perform();
		Assert.assertTrue(exploreMenuScreenLocators.byCategoryListItem.get(0).isDisplayed());
		action.tap(exploreMenuScreenLocators.aToZ).perform();
		Assert.assertTrue(exploreMenuScreenLocators.alphabets.get(3).isDisplayed());
		action.tap(exploreMenuScreenLocators.byStation).perform();
		Assert.assertTrue(exploreMenuScreenLocators.byStationElements.get(0).isDisplayed());
		return this;
	}
	
	/* 
	 * Click on an item from By Category, select a channel, 
	 * verify the headers and assert the items on the screen. 
	 */
	public ExploreMenuScreen clickByCategoryListItem()  {
		
		action = new TouchAction(driver);
		action.tap(exploreMenuScreenLocators.category).perform();
		exploreMenuScreenLocators.byCategoryListItem.get(0).click();
		exploreMenuScreenLocators.subCategoryListItem.get(0).click();
		ApplicationUtils.wait("byCategoryListItem");
		
		Assert.assertTrue(exploreMenuScreenLocators.subListItemScreenMyPrograms.isDisplayed());
		Assert.assertTrue(exploreMenuScreenLocators.subListItemScreenShare.get(1).isDisplayed());
		Assert.assertTrue(exploreMenuScreenLocators.sublistItemScreenOption.get(0).isDisplayed());
		Assert.assertTrue(exploreMenuScreenLocators.sublistItemScreenOption.get(1).isDisplayed());
		Assert.assertTrue(exploreMenuScreenLocators.sublistItemScreenOption.get(2).isDisplayed());
		Assert.assertTrue(exploreMenuScreenLocators.sublistItemScreenOption.get(3).isDisplayed());
		
		playChannelLocator.backButton.click();
		exploreMenuScreenLocators.exploreBackButton.click();
		return this;
	}
	
	/* 
	 * Click on an item from A-Z, select a channel, 
	 * verify the headers and assert the items on the screen. 
	 */
	public ExploreMenuScreen clickAtoZListItem()  {
		
		action = new TouchAction(driver);
		action.tap(exploreMenuScreenLocators.aToZ).perform();
		exploreMenuScreenLocators.exploreListItems.get(4).click();
		
		Assert.assertTrue(exploreMenuScreenLocators.subListItemScreenMyPrograms.isDisplayed());
		Assert.assertTrue(exploreMenuScreenLocators.subListItemScreenShare.get(1).isDisplayed());
		Assert.assertTrue(exploreMenuScreenLocators.sublistItemScreenOption.get(0).isDisplayed());
		Assert.assertTrue(exploreMenuScreenLocators.sublistItemScreenOption.get(1).isDisplayed());
		Assert.assertTrue(exploreMenuScreenLocators.sublistItemScreenOption.get(2).isDisplayed());
		Assert.assertTrue(exploreMenuScreenLocators.sublistItemScreenOption.get(3).isDisplayed());
		
		exploreMenuScreenLocators.exploreBackButton.click();
		
		return this;
	}
	
	/* 
	 * Click on an item from By Station, select a channel, 
	 * verify the headers and assert the items on the screen. 
	 */
	public ExploreMenuScreen clickByStationListItem() {
		
		action = new TouchAction(driver);
		action.tap(exploreMenuScreenLocators.byStation).perform();
		exploreMenuScreenLocators.exploreListItems.get(1).click();
		exploreMenuScreenLocators.byStationSubList.get(1).click();
		
		Assert.assertTrue(exploreMenuScreenLocators.subListItemScreenMyPrograms.isDisplayed());
		Assert.assertTrue(exploreMenuScreenLocators.subListItemScreenShare.get(1).isDisplayed());
		Assert.assertTrue(exploreMenuScreenLocators.sublistItemScreenOption.get(0).isDisplayed());
		Assert.assertTrue(exploreMenuScreenLocators.sublistItemScreenOption.get(1).isDisplayed());
		Assert.assertTrue(exploreMenuScreenLocators.sublistItemScreenOption.get(2).isDisplayed());
		Assert.assertTrue(exploreMenuScreenLocators.sublistItemScreenOption.get(3).isDisplayed());
		
		playChannelLocator.backButton.click();
		exploreMenuScreenLocators.exploreBackButton.click();
		
		return this;
	}
	
	
	/*
	 * This method navigates the user to the home screen 
	 */	
	public ABCRadioHomeScreen homeScreenNavigation() {
		action = new TouchAction(driver);
		action.tap(exploreMenuScreenLocators.homeMenu).perform();
		return new ABCRadioHomeScreen(driver);
	}
	
	
}
