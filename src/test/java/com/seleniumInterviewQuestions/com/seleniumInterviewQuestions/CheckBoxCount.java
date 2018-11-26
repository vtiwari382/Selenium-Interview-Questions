package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxCount {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Browser\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
/*		 String checkbox = driver.findElement(By.xpath("//input[@type='checkbox'][@value='1_1']")).getAttribute("type");
		System.out.println("Attribute of checkbox is :::: " +checkbox);*/
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Attribute of checkbox is :::: " +checkbox.size());
		
		for(int i=0; i<checkbox.size(); i++) {
			System.out.println(checkbox.get(i).getText());

				
//		 driver.quit();
	
	}
	}	
	
}

/*
note:
	1. attribute (type) of checkbox type is checkbox, means (//input[type='checkbox']) ---- to find all the checkbox on page.
	2. tagName for the Dropdown is "Select", driver.findElements(By.tagName("Select")); ---- to find all dropdown on page.
	
			*/