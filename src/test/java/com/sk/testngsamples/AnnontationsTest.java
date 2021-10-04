package com.sk.testngsamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AnnontationsTest {
		
	//enabled=false will disable the methods including all the before/after methods if specified.
	
	@BeforeSuite()
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest(enabled=false)
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	
	@BeforeClass(enabled=false)
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod(enabled=false)
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void aTest()
	{
		System.out.println("Inside aTest AT");
	}
	
	@Test
	public void bTest()
	{
		int a = 10/0;
		System.out.println("Inside bTest AT");
	}
	

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
}
