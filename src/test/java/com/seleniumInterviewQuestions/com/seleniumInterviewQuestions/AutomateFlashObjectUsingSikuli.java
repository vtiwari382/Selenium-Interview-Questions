package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class AutomateFlashObjectUsingSikuli {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", ".\\Browser\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=l6EjYuUSn1Y");
		String title=driver.getTitle();
		System.out.println("Title of the login page is " +title);
		
		Screen sc = new Screen();
		
		Pattern PauseIcon = new Pattern("PauseButtonIcon.png");
		sc.wait(PauseIcon,200);
		sc.click();
		
		Pattern MuteIcon = new Pattern("MuteIcon.png");
		sc.wait(MuteIcon,2000);
		sc.click();
		


	}

}
/*
Note: 
	1. sikuli is use to perform action on flash objects. like click on pause/play/sound icon on youtube or any search icon.
	2. It uses the image of that flash object to perform the action. (save image is project folder)
	3. Create the Object of Screen and Pattern and pass the image name in them.
	
	
	
	*/