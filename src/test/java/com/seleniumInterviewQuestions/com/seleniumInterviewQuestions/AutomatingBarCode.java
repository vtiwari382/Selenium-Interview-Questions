package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class AutomatingBarCode {
	
	public static WebDriver driver;
	
	@Test
	public void BarcodeTest() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver.exe");
		driver = new FirefoxDriver();
//		driver.get("https://barcode.tec-it.com/en");
		driver.get("https://barcode.tec-it.com/en/Code128?data=hello%20vivek");
		String barcode = driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println(barcode);
		
	URL url = new URL(barcode);
	BufferedImage bufferedimage = ImageIO.read(url);
	
	LuminanceSource luminancesource = new BufferedImageLuminanceSource(bufferedimage);
	BinaryBitmap binarybitmap = new BinaryBitmap(new HybridBinarizer(luminancesource));
	
	Result result = new MultiFormatReader().decode(binarybitmap);
	System.out.println(result.getText());
		
		
		
		driver.quit();
	}

}
