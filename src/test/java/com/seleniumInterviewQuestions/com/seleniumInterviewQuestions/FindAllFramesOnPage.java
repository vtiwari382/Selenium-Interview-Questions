package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllFramesOnPage {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Browser\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		
		for(WebElement ele:iframeElements) {
			System.out.println(ele.getText());
		}

	}

}
/*
Note: Handling frame by:
	Switch to Frames by Name:  driver.switchTo().frame("iframe1");
    Switch to Frame by ID   :  driver.switchTo().frame("IF1");
    Switch to Frame by WebElement: 
	//First find the element using any of locator strategy
			WebElement iframeElement = driver.findElement(By.id("IF1"));
	 
			//now use the switch command
			driver.switchTo().frame(iframeElement);
			
	Switching back to Main page from Frame: driver.switchTo().defaultContent();      // after completing all the task user has to switch back

*/