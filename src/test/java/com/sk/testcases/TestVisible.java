package com.sk.testcases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestVisible {
	
	public static void main(String[] args) throws InterruptedException {
			//throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	 	Thread.sleep(3000);
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 	WebElement e = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

		System.out.println("Is Visible Before Click :: "+e.isDisplayed());
	 	driver.findElement(By.xpath("//button[text()='Start']")).click();
	 	
	 	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	 	LocalDateTime begin = LocalDateTime.now();  
	 	System.out.println("time begin : "+dtf.format(begin));
	 	
	//   	Thread.sleep(10000);	
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(e));
	 	
		Wait<WebDriver> fw = new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class);
		
		
		WebElement we = fw.until(new Function<WebDriver,WebElement>(){
		
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//h4[text()='Hello World!']"));
			}
		});
 		
		LocalDateTime end = LocalDateTime.now();  
	 	System.out.println("time end : "+dtf.format(end));
	 	
		System.out.println("Is Visible After Click :: "+e.isDisplayed());

		Thread.sleep(2000);
		driver.quit();
	}

}
