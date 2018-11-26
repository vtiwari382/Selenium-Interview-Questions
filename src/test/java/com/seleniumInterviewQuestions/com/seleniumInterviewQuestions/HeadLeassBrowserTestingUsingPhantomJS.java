package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadLeassBrowserTestingUsingPhantomJS {

	public static void main(String[] args) {
		System.setProperty("phantomjs.binary.path", ".\\Browser\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		driver.get("http://automationpractice.com/index.php");
		String title=driver.getTitle();
		System.out.println("Title of the login page is " +title);

	}

}

/*
Note:
	1. phantomJS driver internally uses ghost driver.
	2. ghostdriver ----> is used as JSON wire protocol ----- HTTP REST calls
	3. headless browser testing.
	4. no browser will be launched.
	5. Testing is happening behind the scene
	6. it's very fast.
	7. It directly interact with your app HTML DOM.
	*/