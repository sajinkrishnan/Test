package com.sk.testngsamples;

import org.testng.annotations.Test;

public class OrderOfExecutionTest {

	// Runs in the alphabetical order if no priority is set, default priority is 0
	@Test
	public void aTest()
	{
		System.out.println("In Method aTest");
	}
	
	@Test
	public void cTest()
	{
		System.out.println("In Method cTest");
	}
	
	@Test
	public void bTest()
	{
		System.out.println("In Method bTest");
	}

}
