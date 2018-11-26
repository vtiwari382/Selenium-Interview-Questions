package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FindAllRadioButtonOnPage {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Browser\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> count=driver.findElements(By.xpath("//input[@type='radio']"));
	
		 System.out.println("Count of Radio Button is " +count.size());
		 
		 for(int i=0; i<count.size(); i++) {
			 System.out.println("count and text of radio button is " +count.get(i).getText());
		 }
		
		 
		driver.quit(); 

	}

}
