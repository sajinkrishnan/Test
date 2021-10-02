package com.sk.testngsamples;

import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OtherConcepts {
	
	
	//enabled=false will ignore the test
	//SkipException, skips the Test with the exception
	//timeOut waits until the time for the test to execute, throws timeout exception after the time exceeds
	//expecetdException marks the test passed if the expected exception occurs, otherwise fail
	
	@Test(enabled=false)
	public void aTest()
	{
		System.out.println("Method aTest is not ready");
	}
	
	@Ignore
	@Test(enabled=false)
	public void ignoreTest()
	{
		System.out.println("Method ignoreTest is not ready");
	}
	
	
	@Test()
	public void bTest()
	{
		throw new SkipException("Skipping OC");
	}
	
	@Test(timeOut=2000)
	public void cTest() throws InterruptedException
	{
	//	while(true);
		Thread.sleep(2100);
	}
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void dTest()
	{
		//Codes after the exceptions are not executed even if the test is passed.
		System.out.println("Inside Method dTest OC : Before");
		int a =10/0;
		System.out.println("Inside Method dTest : After");
	}
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void eTest()
	{
		int a[]= {0,1,2,3,4};
		System.out.println("Inside Method eTest OC : "+a[5]);
	}
	
}
