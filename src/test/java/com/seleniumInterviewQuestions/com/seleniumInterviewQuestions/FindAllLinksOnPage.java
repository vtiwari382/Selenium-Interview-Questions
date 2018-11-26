package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllLinksOnPage {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Browser\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		List<WebElement> count = driver.findElements(By.tagName("a"));
		System.out.println("count of total link is" +count.size());
		
		for(WebElement ele:count) {
			System.out.println(ele.getAttribute("href"));
		}

	}

}
