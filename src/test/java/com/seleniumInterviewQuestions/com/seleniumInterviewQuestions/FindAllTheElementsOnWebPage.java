package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllTheElementsOnWebPage {
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", ".\\Browser\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		List<WebElement> elements = driver.findElements(By.xpath("//*"));
		System.out.println("Printing the size of all element ******* " +Integer.toString(elements.size()));
//		System.out.println("Printing the size of all element ******* " +elements.size());
		
		for(WebElement ele: elements) {
			
			System.out.println(ele.getTagName() +" " +ele.getText());
		}
		
		driver.quit();

	}
}

/*
note:
1.	Above code will print all the element showing on the page, with the tag name and text.
*/