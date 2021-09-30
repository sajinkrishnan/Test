package com.sk.testcases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGrid {
	
	
	static WebDriver driver;
	static String GridURL; 
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
			//throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Cruise\\Downloads\\Selenium\\geckodriver.exe");
		GridURL="http://192.168.0.104:4444/wd/hub";
		DesiredCapabilities dc = DesiredCapabilities.firefox();
//		DesiredCapabilities dc = DesiredCapabilities.chrome();
//		ChromeOptions options = new ChromeOptions();
		FirefoxOptions options = new FirefoxOptions();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
//		dc.setPlatform(Platform.LINUX);
//		dc.setVersion("92.0.1");
	//	dc.setCapability(FirefoxDriver.BINARY, new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe"));
//		dc.setJavascriptEnabled(true);
		//dc.setCapability("marionette", true);
		options.merge(dc);
		
		driver = new RemoteWebDriver(new URL(GridURL),options);
		
//		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
