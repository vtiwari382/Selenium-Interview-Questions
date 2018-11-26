package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllTestNGAnnotation {
	
	public static WebDriver driver=null;
	
	// Order = 1,
	@BeforeSuite
	public void BeforeSuiteTest() {
		System.out.println("@BeforeSuite : Setup the chrome path");
	}
	
	// Order = 2,  
	@BeforeTest
	@Parameters({"browser"})
	public void BeforeTestRunning(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("i am before class");
			}
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("@BeforeTest: launch browser");
			}
		}
		
	
    // Order = 3
	@BeforeClass
	public void LaunchBrowser(String browser) {
			System.out.println("@BeforeClass : login to application");
	}
	
	
	
	// Order = 4, order=7
	@BeforeMethod
	public void BeforeMethodExecution() {
		System.out.println("@BeforeMethod: Enter the URL");
	}
	
	
	// Order = 5,    // invocationCount execute the same test case multiple times
	@Test(priority=0, enabled=true, groups="faaltu", invocationCount=10)
	@Parameters({"url1"})
	public void RunningTest1(String url1) {
//		driver.get("https://www.google.com/");
		driver.get(url1);
		System.out.println("@Test 1: login into the google.com");
		
	}
	
	// Order = 8
	@Test(priority=1, dependsOnMethods= {"RunningTest1"}, groups="bekaar")
	@Parameters({"url2"})
	public void RunningTest2(String url2) {
//		driver.get("https://www.youtube.com/");
		driver.get(url2);
		System.out.println("@Test 2: login into the youtube");
	}
	
		
	// Order = 6, // Order = 9
	@AfterMethod
	public void AfterMethodExecution() {
		System.out.println("@AfterMethod: logout from App ");
	}
	
	// Order = 10
	@AfterClass
	public void QuitBrowser() {
		driver.quit();
		System.out.println("@AfterClass: close the browser");
	}
	
	// Order = 11
	@AfterTest
	public void AfterTestRunning() {
	System.out.println("@AfterTest: delete all cookies");
		}
	//Order = 12
	@AfterSuite
	public void AfterSuiteTest() {
		System.out.println("@AfterSuite: Generate the report after the execution");
	}


}
