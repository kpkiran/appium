package com.abcradio.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationUtils {

	private static Properties properties = new Properties();
	public static int EXPLICIT_WAIT_TIME;
	public static int IMPLICIT_WAIT_TIME;
	public static int DEFAULT_WAIT_TIME;
	public static String APPLICATION_PATH;
	public static String APPLICATION_PACKAGE;
	public static String APPLICATION_ACTIVITY;
	public static String APPIUM_SERVER_PORT;
	public static String AUTOMATION_INSTRUMENTATION;
	public static String BROWSER_NAME;
	public static String DEVICE_NAME;
	public static String PLATFORM_NAME;
	public static String PLATFORM_VERSION;
	public static String COMMAND_TIMEOUT;
	public static String DEVICE_TIMEOUT;
	private static DesiredCapabilities capabilities = new DesiredCapabilities();
	private static URL serverUrl;
	private static AndroidDriver<WebElement> driver;

	public static void loadConfigFile(String propertyFileName)
			throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")
						+ "/src/test/resources/properties/" + propertyFileName
						+ ".properties");
		
		properties.load(fis);

		EXPLICIT_WAIT_TIME = Integer.parseInt(properties
				.getProperty("explicit.wait"));
		IMPLICIT_WAIT_TIME = Integer.parseInt(properties
				.getProperty("implicit.wait"));
		DEFAULT_WAIT_TIME = Integer.parseInt(properties
				.getProperty("default.wait"));
		APPLICATION_PATH = properties.getProperty("application.path");
		APPLICATION_PACKAGE = properties.getProperty("app.package");
		APPLICATION_ACTIVITY = properties.getProperty("app.activity");
		APPIUM_SERVER_PORT = properties.getProperty("appium.server.port");
		AUTOMATION_INSTRUMENTATION = properties
				.getProperty("automation.instrumentation");
		BROWSER_NAME = properties.getProperty("browser.name");
		DEVICE_NAME = properties.getProperty("device.name");
		PLATFORM_NAME = properties.getProperty("platform.name");
		PLATFORM_VERSION = properties.getProperty("platform.version");
		COMMAND_TIMEOUT = properties.getProperty("new.command.timeout");
		DEVICE_TIMEOUT = properties.getProperty("device.ready.timeout");
	}

	public static void setAndroidCapabilities() {
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,
				"APPIUM");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,
				ApplicationUtils.BROWSER_NAME);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
				ApplicationUtils.DEVICE_NAME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
				ApplicationUtils.PLATFORM_NAME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
				ApplicationUtils.PLATFORM_VERSION);
		capabilities.setCapability("app", ApplicationUtils.APPLICATION_PATH);
		capabilities.setCapability("appActivity",
				ApplicationUtils.APPLICATION_ACTIVITY);
		capabilities.setCapability("appPackage",
				ApplicationUtils.APPLICATION_PACKAGE);
	}
	
	public static AndroidDriver<WebElement> getDriver() throws MalformedURLException {
		serverUrl = new URL("http://127.0.0.1:"+APPIUM_SERVER_PORT+"/wd/hub");
		driver = new AndroidDriver<WebElement>(serverUrl, capabilities);
		driver.manage().timeouts().implicitlyWait(ApplicationUtils.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		return driver;
	}
	
	public String getProgramHeadingText(String locator) {
		return driver.findElement(By.id(locator)).getText();
	}
	
	public static String getHeaderText(WebElement locator) {
		System.out.println(locator.getText());
		return locator.getText();
	}
	
	public static void wait(String locator) {
		
		if(locator == "Id") {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
		}
		if(locator == "className") {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locator)));
		}
	}
}