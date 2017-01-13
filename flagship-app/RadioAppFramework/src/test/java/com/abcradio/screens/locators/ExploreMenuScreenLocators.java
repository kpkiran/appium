package com.abcradio.screens.locators;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import java.util.List;
import org.openqa.selenium.WebElement;
import com.abcradio.base.ScreenBase;

public class ExploreMenuScreenLocators extends ScreenBase{

	public ExploreMenuScreenLocators(AndroidDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/* 
	 * XPath for By Category menu 
	 */
	@AndroidFindBys({ @AndroidFindBy(id = "com.thisisaim.abcradio:id/lytTabs"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/btnByGenreTab") })
	public WebElement category;

	/* 
	 * XPath for AtoZ menu 
	 */
	@AndroidFindBys({ @AndroidFindBy(id = "com.thisisaim.abcradio:id/lytTabs"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/btnAZTab") })
	public WebElement aToZ;

	/* 
	 * XPath for Station menu 
	 */
	@AndroidFindBys({ @AndroidFindBy(id = "com.thisisaim.abcradio:id/lytTabs"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/btnByStationTab") })
	public WebElement byStation;

	/* 
	 * XPath for elements inside Station menu 
	 */
	@AndroidFindBy(className = "android.widget.RelativeLayout")
	public List<WebElement> byStationElements;

	/*
	 * XPath for alphabets in A-Z view 
	 */
	@AndroidFindBys({
			@AndroidFindBy(className = "android.widget.LinearLayout"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/txtSectionTitle") })
	public List<WebElement> alphabets;

	/* 
	 * XPath for back button 
	 */
	@AndroidFindBys({ @AndroidFindBy(id = "com.thisisaim.abcradio:id/lytRoot"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/tlbMain"),
			@AndroidFindBy(className = "android.widget.ImageButton") })
	public WebElement exploreBackButton;

	/* 
	 * XPath for the items list under By Category 
	 */
	@AndroidFindBys({ @AndroidFindBy(id = "com.thisisaim.abcradio:id/pgrMain"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lytRoot"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lstItems"),
			@AndroidFindBy(className = "android.widget.RelativeLayout"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/txtName") })
	public List<WebElement> byCategoryListItem;

	/* 
	 * XPath for the list of items which are sub elements of category 
	 */
	@AndroidFindBys({
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lstItems"),
			@AndroidFindBy(className = "android.widget.RelativeLayout") })
	public List<WebElement> subCategoryListItem;

	/* 
	 * XPath for the Sub category item screen header 
	 */
	@AndroidFindBys({ @AndroidFindBy(id = "com.thisisaim.abcradio:id/lytRoot"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/tlbMain") })
	public WebElement subCategoryListItemScreenHeader;

	/* 
	 * XPath for the MyPrograms 
	 */
	@AndroidFindBys({ @AndroidFindBy(id = "com.thisisaim.abcradio:id/lytRoot"),
			@AndroidFindBy(className = "android.widget.RelativeLayout"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lytRoot"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lytButtons"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/btnSubscribe"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/txtSubscribe") })
	public WebElement subListItemScreenMyPrograms;

	/* 
	 * XPath for the Share 
	 */
	@AndroidFindBys({ @AndroidFindBy(id = "com.thisisaim.abcradio:id/lytRoot"),
			@AndroidFindBy(className = "android.widget.RelativeLayout"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lstItems"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lytRoot"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lytButtons"),
			@AndroidFindBy(className = "android.widget.LinearLayout"),
			@AndroidFindBy(className = "android.widget.TextView") })
	public List<WebElement> subListItemScreenShare;

	/*
	 * XPath for the options of a challen like All, Unplayed, Listen later and
	 * Downloaded
	 */
	@AndroidFindBys({ @AndroidFindBy(id = "com.thisisaim.abcradio:id/lytRoot"),
			@AndroidFindBy(className = "android.widget.RelativeLayout"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lstItems"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lytRoot"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lytTabBorder"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lytTabs"),
			@AndroidFindBy(className = "android.widget.TextView") })
	public List<WebElement> sublistItemScreenOption;

	/* 
	 * XPath for the aTozList items 
	 */
	@AndroidFindBys({ @AndroidFindBy(id = "com.thisisaim.abcradio:id/pgrMain"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lytRoot"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lstItems"),
			@AndroidFindBy(className = "android.widget.RelativeLayout") })
	public List<WebElement> exploreListItems;

	/* 
	 * XPath for byStationSubList elements 
	 */
	@AndroidFindBys({ @AndroidFindBy(id = "com.thisisaim.abcradio:id/lytRoot"),
			@AndroidFindBy(id = "com.thisisaim.abcradio:id/lstItems"),
			@AndroidFindBy(className = "android.widget.RelativeLayout") })
	public List<WebElement> byStationSubList;
	
	/*
	 * XPath to navigate back to the home screen 
	 */
	@AndroidFindBys({
		@AndroidFindBy(id="com.thisisaim.abcradio:id/tlbMain"),
		@AndroidFindBy(id="com.thisisaim.abcradio:id/lytTab"),
		@AndroidFindBy(id="com.thisisaim.abcradio:id/btnHome")
	}) public WebElement homeMenu;
}
