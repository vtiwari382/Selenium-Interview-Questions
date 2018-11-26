package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridTutorial {

	public static void main(String[] args) throws Exception {
		
//	Define Desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		// Chrome Options Definition:
/*		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		String hubUrl = "http://192.168.0.12:4444/wd/hub";           //copy the hub URL from web and in place of GRID use "wd/hub"
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);
		
		driver.get("http://www.freecrm.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());*/
		
//		driver.quit();

	}

}
/*
note: For the grid use selenium version above or 3.8, because some features are not available in lower version
*/