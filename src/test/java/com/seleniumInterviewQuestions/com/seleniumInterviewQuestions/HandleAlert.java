package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandleAlert {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		 
		 System.setProperty("webdriver.gecko.driver", ".\\Browser\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebElement element = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		 
		 // For the mouse hover
	        Actions action = new Actions(driver);

	        action.moveToElement(element).perform();
//	        action.moveToElement(element).build().perform();     // use Build option when we have to perform multiple mouse hover
	        
	        
	        // for the right click
	        Actions act=new Actions(driver);
	        act.contextClick(element).perform();
	        
	        
// KeyBoard event to perform action class (For this we will use previous example after right click we will select second option from list for this we will use ARROW_DOWN key two times then we will hit ENTER Key.)
	        Actions act1=new Actions(driver);
	        
	        act1.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	        
	    //  ***************************** Other Action Class Keyboard Event  *********************************	      	        
	        
	        /*action.moveToElement(WebElement). //Mouse Hover

	        action.contextClick()-- Right click on page

	        action.contextClick(WebElement)-- Right click on specific Element

	        action.sendKeys(KEYS.TAB)--For keyboard events

	        action.clickAndHold(WebElement)--Click on element and hold until next operation

	        action.release() Release the current control*/
	        
	        
//  ***************************** Performing Drag and Drop  *********************************	        
	     // find element which we need to drag
	        WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
	         
	        // find element which we need to drop
	        WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));
	         
	        // this will drag element to destination
	        action.dragAndDrop(drag, drop).build().perform();
          

	}

}
