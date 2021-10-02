package com.sk.testngsamples;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class DependsTest {
	
	
	//Test will run only if the depends on test passes. otherwise skipped.
	//Cyclid dependency occurs if the dependency is looped and none of the tests in the class are executed.
	
	@Test
	public void bTest()
	{
		System.out.println("Inside Method bTest");
	}
	
	@Test(dependsOnMethods= {"bTest","cTest"})
	public void aTest()
	{
		System.out.println("Inside Method aTest");
	}
	
	@Test
	public void cTest()
	{
		System.out.println("Inside Method cTest");
	}
	
	@Test(timeOut=1000)
	public void dTest()
	{
		//while(true);
		System.out.println("Inside Method dTest");
	}
	
	@Test(dependsOnMethods="dTest")
	public void eTest()
	{
		System.out.println("Inside Method eTest");
	}
	
	@Test(dependsOnMethods="eTest")
	public void fTest()
	{
		System.out.println("Inside Method fTest");
	}
	
}
