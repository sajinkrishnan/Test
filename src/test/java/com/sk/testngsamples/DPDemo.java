package com.sk.testngsamples;

import org.testng.annotations.DataProvider;

public class DPDemo {
	
	@DataProvider(name="Data From Other Class")
	public Object[][] dataSet()
	{
		
		Object[][] data = new Object[2][2];
		
		data[0][0]="sk1";
		data[0][1]="spec1";
		
		data[1][0]="gj1";
		data[1][1]="kash1";
	
		return data;
	}

}
