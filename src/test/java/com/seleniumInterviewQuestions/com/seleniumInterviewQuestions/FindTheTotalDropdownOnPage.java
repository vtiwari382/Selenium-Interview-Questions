package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FindTheTotalDropdownOnPage {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Browser\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
        System.out.println("locating all the dropdown of page and printing the size of them ");	
        
		List<WebElement> dropdown = driver.findElements(By.tagName("Select"));
		 System.out.println("Total count of checkbox is :::: " +dropdown.size());
		 
		 System.out.println("*******locating all the elements available in dropdown of page with the size *******");
		 
	WebElement ele= driver.findElement(By.xpath("//select[@id='day']"));
	Select select = new Select(ele);
	List<WebElement>  ele1=select.getOptions();
	System.out.println("Number of elements in dropdown is " +ele1.size());
	for(int i=0; i<ele1.size(); i++) {
		System.out.println("text of the text is " +ele1.get(i).getText());
		 select.selectByIndex(12);
   
		
	}
		 
		 

	}

}
/*
Note: for the dropdown use "TagName" when no locators found, use " driver.findElements(By.tagName("Select")); "
2. tagName for the Dropdown is "Select", driver.findElements(By.tagName("Select")); ---- to find all dropdown on page.

*/


