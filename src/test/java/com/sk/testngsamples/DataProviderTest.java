package com.sk.testngsamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
	@DataProvider(name="ds")
	public Object[][] dataSet()
	{
		
		Object[][] data = new Object[2][2];
		
		data[0][0]="sk";
		data[0][1]="spec";
		
		data[1][0]="gj";
		data[1][1]="kash";
	
		return data;
	}
	
	@Test(dataProvider="ds")
	public void dataTest(String col1, String col2)
	{
		System.out.println(col1+"------"+col2);
	}
	
	@Test(dataProvider="Data From Other Class", dataProviderClass=DPDemo.class)
	public void dataTest1(String col1, String col2)
	{
		System.out.println(col1+"------"+col2);
	}
	
	
	@Test(dataProvider="Create", dataProviderClass=DPDemoBasedOnTest.class)
	public void dataTest2(String col1, String col2)
	{
		System.out.println(col1+"------"+col2);
	}
	
	@Test(dataProvider="Create", dataProviderClass=DPDemoBasedOnTest.class)
	public void dataTest3(String col1, String col2, String col3)
	{
		System.out.println(col1+"------"+col2+"------"+col3);
	}
	
	

}
