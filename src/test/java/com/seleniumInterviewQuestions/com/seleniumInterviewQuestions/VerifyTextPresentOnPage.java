package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTextPresentOnPage {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Browser\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if(driver.getPageSource().contains("Facebook Lite")) {
			System.out.println("Text found");
			
		} else {
			System.out.println("Text Not found");
		}
		
// Scrolling window at bottom using java script		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,250);");
		
// Scrolling until text or element is found on page
		WebElement element = driver.findElement(By.partialLinkText("Forgotten account"));
	js.executeScript("arguements[0].scrollintoview(true);",element);

	}

}
