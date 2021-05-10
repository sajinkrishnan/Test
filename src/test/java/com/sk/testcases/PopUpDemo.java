package com.sk.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpDemo {
	
		public static void main(String[] args) throws InterruptedException, AWTException { 
			
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver(); 
		driver.get("file:///C:/Users/Cruise/OneDrive/Documents/MyHtml.html"); 
		driver.manage().window().maximize(); 
		Thread.sleep(1000);
		driver.findElement(By.id("PopUp")).click(); // Clicking on the popup button
//		Robot robot = new Robot();
//		robot.mouseMove(400,5); // Navigating through mouse hover. Note that the coordinates might differ, kindly check the coordinates of x and y axis and update it accordingly.
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(2000);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(2000);
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		System.out.println(allWindowHandles.size());
		Iterator<String> I1= allWindowHandles.iterator();

		while(I1.hasNext())
		{

			
		String window=I1.next();
		System.out.println(window);
		if(window.contains("10737418241"));
			driver.switchTo().window(window);
		}		
		
		driver.quit();
		}

}
