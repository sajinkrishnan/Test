package com.sk.testngsamples;

import org.testng.SkipException;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Test(groups="All")
public class GroupsDepends {
	
	
	//Test will run only if the depends on test passes. otherwise skipped.
	
	@BeforeGroups("Sanity1")
	public void beforeSomeGroup()
	{
		System.out.println("Inside Method beforeSomeGroup");
	}
	
	@AfterGroups("Sanity2")
	public void afterSomeGroup()
	{
		System.out.println("Inside Method afterSomeGroup");
	}
	
	@Test(groups="Sanity1", enabled=false)
	@Ignore
	public void aGroupTest()
	{
		System.out.println("Inside Method aGroupTest");
	}
	
	@Test(groups="Sanity2")
	public void bGroupTest()
	{
		//int a=10/0;
		System.out.println("Inside Method bGroupTest");
	}
	
	@Test(groups="Regression", dependsOnGroups= {"Sanity3","Sanity2"})
	public void cGroupTest()
	{
		System.out.println("Inside Method cGroupTest");
	}
	
	
	@Test(groups="Sanity3", description="Desc of dGroupTest")
	public void dGroupTest()
	{
		System.out.println("Inside Method dGroupTest");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Inside Method afterTest");
	}
	
	
}
