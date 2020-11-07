package com.sk.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sk.base.BaseTest;

public class BankManagerLoginTest extends BaseTest {

	
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException{		
//		verifyEquals("abc", "xyz");
//		Thread.sleep(3000);
		log.debug("Inside Login Test");
		click("bmlBtn_CSS");
		Assert.assertEquals(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),true,"Login not successful");
		log.debug("Login successfully executed");
//		Assert.fail("Login not successful");
	}	
}