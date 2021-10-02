package com.sk.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.sk.base.BaseTest;
import com.sk.listeners.ExtentListeners;
import com.sk.pageobjects.HomePage;

public class BankManagerLoginTest extends BaseTest {

	
//	@Test
//	public void bankManagerLoginTest() throws InterruptedException, IOException{		
//		verifyEquals("abc", "xyz");
//		Thread.sleep(3000);
//		log.debug("Inside Login Test");
//		click("bmlBtn_CSS");
//		Assert.assertEquals(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),true,"Login not successful");
//		log.debug("Login successfully executed");
//		Assert.fail("Login not successful");
//	}
	
	
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException{
		HomePage hp= new HomePage(driver);
		String heading = hp.getHeading();
		log.debug("Heading is ::"+heading);
	//	ExtentListeners.testReport.get().log(Status.PASS, heading);
		Assert.assertEquals(heading,"XYZ Bank");
		Thread.sleep(2000);

	}	
}
