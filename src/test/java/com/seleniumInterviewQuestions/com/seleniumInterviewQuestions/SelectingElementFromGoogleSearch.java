package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectingElementFromGoogleSearch {
	
	

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("lst-ib")).sendKeys("Testing");
		List<WebElement>list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));  
		// here i have used // after listbox'] to get all childs in it.
		System.out.println("total number of suggestions in searchbox is " +list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("printing text of elements number" + i + "is " +list.get(i).getText());
			if(list.get(i).getText().contains("testing interview questions")) {
				list.get(i).click();
				break;
			}
		}
		driver.close();
	}

}



//In this script we are going to search testing text on google and based on that we are selecting the found option in dropdown.
// descendant is use to move into the child/grand child/div from parent. it will move anywhere in div based on xpath