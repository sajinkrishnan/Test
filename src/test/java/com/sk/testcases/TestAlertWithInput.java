package com.sk.testcases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAlertWithInput {
	
	public static void main(String[] args) {
			//throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	 	//Thread.sleep(2000);
	 	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	 	LocalDateTime begin = LocalDateTime.now();  
	 	System.out.println("time begin : "+dtf.format(begin));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 	driver.findElement(By.xpath("//button[text()='Start']")).click();
	 	try {
		driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
	 	}
	 	catch(Exception e)
	 	{
	 		System.out.println("Exception Occured : "+e.getMessage());
	 		//throw e;
	 	}
	 	finally
	 	{
	 		LocalDateTime end = LocalDateTime.now();  
		 	System.out.println("time end : "+dtf.format(end));
	 	}
		
	// 	Thread.sleep(2000);
		driver.quit();
	}

}
