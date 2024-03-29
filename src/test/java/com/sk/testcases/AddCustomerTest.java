package com.sk.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.sk.base.BaseTest;
import com.sk.utilities.TestUtil;

public class AddCustomerTest extends BaseTest {
	
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void addCustomerTest(Hashtable<String,String> data) throws InterruptedException{
		
		if(!data.get("runmode").equals("Y")){
			
			throw new SkipException("Skipping the test case as the Run mode for data set is NO");
		}
		
		TestUtil.click("addCustBtn_CSS");
		TestUtil.type("firstname_CSS",data.get("firstname"));
		TestUtil.type("lastname_XPATH",data.get("lastname"));
		TestUtil.type("postcode_CSS",data.get("postcode"));
		TestUtil.click("addbtn_CSS");
		Thread.sleep(2000);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
		alert.accept();
		
		Thread.sleep(2000);
		
	}
	
	

}
