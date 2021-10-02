package com.sk.testngsamples;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityOfExecutionTest {
	
	// Default priority is 0 if not mentioned
	// Least value takes more precedence say -1 id higher priority than 0. 
	// Can give only integer as priority. both -ve and +ve. 
	
	@Test(priority=1)
	public void aTest()
	{
		System.out.println("In Method aTest");
	}
	
	@Test(priority=-1)
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
