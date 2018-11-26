package com.seleniumInterviewQuestions.com.seleniumInterviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssersion {

	SoftAssert softassert = new SoftAssert();

	@Test
	public void test1() {
		System.out.println("Open Browser");
		softassert.assertEquals(true, false, "home page title is missing");        // hard assert
	

		System.out.println("Enter username");
		System.out.println("Enter Password");
		System.out.println("Click on SignIn Button");
		Assert.assertEquals(true, true, "Not able to click on signin button");                // hard assert

		System.out.println("Validate Home page");
//		Assert.assertEquals(true, false);               // Soft assert

		System.out.println("go to deals page");
		System.out.println("create a deal");
		softassert.assertEquals(true, true, "Not able to create the deal");             // Soft assert

		System.out.println("GO to Contact page");
		System.out.println("create a Contact");
		softassert.assertEquals(true, false, "Not able to create the contact");            // Soft assert
		softassert.assertAll();

	}

}
/*
 note:
1. Hard Assert: if hard assert become fail it will not execute next line,program will terminate immediately and it will fail the test case.
2. Soft Assert:	if Soft assert become fail it will still execute next line, program will not terminate and it will fail the test case.
3. Hard or soft assert will not effect to those cases which are written in @Test annotation.
4. AssertAll: to mark the test case as failed, if any soft assertion got failed.
*/