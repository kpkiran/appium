package com.abcradio.trial;

import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestProperties {

	public static AndroidDriver<WebElement> driver;

//	public static void main(String[] args) throws IOException, InterruptedException {
//		
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		File appRoot = new File(System.getProperty("user.dir"));
//		File app = new File(appRoot, "/src/test/resources/app/base.apk"); 
//		
//		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
//		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "APPIUM");
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "f48a3b55");
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0");
//		capabilities.setCapability("app", app.getAbsolutePath());
//		capabilities.setCapability("appPakage", "com.thisisaim.abcradio");
//		capabilities.setCapability("appActivity", "com.thisisaim.abcradio.ABCIntroActivity");
//		
//		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//		
//		getVersion();
//	}
//
//	private static void getVersion() throws InterruptedException {
//		System.out.println(driver.getCapabilities().getVersion());
//		Thread.sleep(3000);		
//	}
	
	public static void main(String [] args) {

		
		Date curDate = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String DateToStr = format.format(curDate);
		System.out.println(DateToStr);
		
		format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);
		
		format = new SimpleDateFormat("dd MMMM yyyy zzzz");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);
		
		format = new SimpleDateFormat("EEEEE, dd MMMMM");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);
		try {
			Date strToDate = format.parse(DateToStr);
			System.out.println(strToDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
