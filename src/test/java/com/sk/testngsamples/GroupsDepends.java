package com.sk.testngsamples;

import org.testng.SkipException;
import org.testng.annotations.Test;

@Test(groups="All")
public class GroupsDepends {
	
	
	//Test will run only if the depends on test passes. otherwise skipped.
	
	@Test(groups="Sanity1")
	public void aGroupTest()
	{
		System.out.println("Inside Method aGroupTest");
	}
	
	@Test(groups="Sanity2")
	public void bGroupTest()
	{
		int a=10/0;
		System.out.println("Inside Method bGroupTest");
	}
	
	@Test(groups="Regression", dependsOnGroups= {"Sanity1","Sanity2"})
	public void cGroupTest()
	{
		System.out.println("Inside Method cGroupTest");
	}
	
	
	@Test(groups="Sanity", description="Desc of dGroupTest")
	public void dGroupTest()
	{
		System.out.println("Inside Method dGroupTest");
	}
	
	
}
