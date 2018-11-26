package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElement {
	
	public static WebDriver driver;
	
	
	
	// Applying Implicit wait (static wait) ------ it applies for the whole page
	public static void ImplicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	// Explicit wait (dynamic wait)  ----- it applies for specific element only
	public static void ExplicitWait(int time, String locator) {
		WebDriverWait wait = new WebDriverWait(driver, time);
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	boolean status = element.isDisplayed();
	}
	
	// Fluent wait
	// Waiting 30 seconds for an element to be present on the page, checking
	// for its presence once every 5 seconds.
	 FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
			                      .withTimeout(30, TimeUnit.SECONDS)
			                      .pollingEvery(5, TimeUnit.SECONDS)
			                      .ignoring(NoSuchElementException.class);


	public static void main(String[] args) {
		
		

	}

}
