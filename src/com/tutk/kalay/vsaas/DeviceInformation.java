package com.tutk.kalay.vsaas;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import com.experitest.appium.SeeTestAndroidDriver;
import com.experitest.appium.SeeTestCapabilityType;

public class DeviceInformation {
	Definition def = new Definition();
	public SeeTestAndroidDriver driver[] = new SeeTestAndroidDriver[def.deviceName.size()];
	public DesiredCapabilities cap[] = new DesiredCapabilities[def.deviceName.size()];

	public DeviceInformation() {
		for (int i = 0; i < def.deviceName.size(); i++) {
			cap[i] = new DesiredCapabilities();
		}

		for (int i = 0; i < def.deviceName.size(); i++) {

			for (int j = i; j < def.platformVersion.size(); j++) {

				cap[i].setCapability(SeeTestCapabilityType.WAIT_FOR_DEVICE_TIMEOUT_MILLIS, def.sec * 1000);
				cap[i].setCapability(MobileCapabilityType.UDID, def.deviceName.get(i));
				cap[i].setCapability(AndroidMobileCapabilityType.APP_PACKAGE, def.appPackage);
				cap[i].setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, def.appActivity);

				// Appium
				/*
				 * cap[i].setCapability("platformName", "Android");
				 * cap[i].setCapability("deviceName", def.deviceName.get(i));
				 * cap[i].setCapability("platformVersion",
				 * def.platformVersion.get(j));
				 * cap[i].setCapability("appPackage", def.appPackage);
				 * cap[i].setCapability("appActivity", def.appActivity);
				 * cap[i].setCapability("udid", def.deviceName.get(i));
				 */
				try {
					driver[j] = new SeeTestAndroidDriver<>(new URL("http://localhost:" + def.port + "/wd/hub"), cap[j]);
				} catch (MalformedURLException e) {
					;
				}
				break;
			}
			def.port = def.port + 2;
		}
	}

	public static void main(String[] args) {
		/*
		 * try { Thread.sleep(6000); } catch (InterruptedException e) { ; } File
		 * screenShotFile = (File) driver[0].getScreenshotAs(OutputType.FILE);
		 * 
		 * try { FileUtils.copyFile(screenShotFile, new
		 * File(def.deviceName.get(0)+".jpg")); } catch (IOException e) { ; }
		 */
	}
}
