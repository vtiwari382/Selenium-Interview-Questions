package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FindAllTheTextBoxsOnPage {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Browser\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("******Scrolling down the page********");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,250);");
		driver.findElement(By.id("createacc")).click();
		
		System.out.println("******Searching for all text input********");
		List<WebElement> count=driver.findElements(By.xpath("//input[@type='text']"));
	
//		 System.out.println("Count of text box is " +count.size());
		 
		 for(WebElement name:count) {
			 System.out.println("count and text of text box is " +name.getSize());
		 }
		
		 
//		driver.quit(); 

	}

}
