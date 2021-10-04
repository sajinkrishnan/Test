package com.sk.testngsamples;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;



public class DPDemoBasedOnTest {
	
	@DataProvider(name="Create")
	public Object[][] dataSet(Method m)
	{
		
		Object[][] data = null;
		
		if(m.getName().equalsIgnoreCase("dataTest2"))
		{
				data=new Object[2][2];
				data[0][0]="sk2";
				data[0][1]="spec2";
		
				data[1][0]="gj2";
				data[1][1]="kash2";
		}
		else
		{
			data = new Object[][] {{"u1","p1","h1"},{"u2","p2","h2"},{"u3","p3","h3"}};
		}
		return data;
	}

}
