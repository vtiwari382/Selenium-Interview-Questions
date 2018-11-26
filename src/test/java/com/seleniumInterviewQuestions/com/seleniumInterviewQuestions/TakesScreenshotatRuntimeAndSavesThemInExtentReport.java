package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TakesScreenshotatRuntimeAndSavesThemInExtentReport {
	
	ExtentReports extent;
	ExtentTest logger;
	 static WebDriver driver;
	
	public static String TakesScreenshotAtEndOfTheTest() throws Exception {
		File scr=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String filename =  new SimpleDateFormat("dd-MM-yyyy hh-mm-ss").format(new Date());
		String currentdir = System.getProperty("user.dir")+"/Screenshots/"+System.currentTimeMillis() +".png";
		File dest = new File(currentdir);
		FileUtils.copyFile(scr, dest);
		return currentdir;
	}
	
	@BeforeMethod
	public void setup() {
	ExtentHtmlReporter report = new ExtentHtmlReporter("./Report/automation.html");
	extent = new ExtentReports();
	extent.attachReporter(report);
	logger = extent.createTest("LoginTest");
	}
	
	
	@Test
	public void loginTest() {
		System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Title is " +driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Google"));
	}
	
	
	@AfterMethod
	public void Teardown(ITestResult result) throws Exception {
		if(result.getStatus()==ITestResult.FAILURE) {
			String temp	=TakesScreenshotatRuntimeAndSavesThemInExtentReport.TakesScreenshotAtEndOfTheTest();
			 logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
			}
	extent.flush();
		
	}
	
}

