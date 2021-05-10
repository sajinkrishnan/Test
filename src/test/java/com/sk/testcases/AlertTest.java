package com.sk.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTest {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		Thread.sleep(2000);
		
		By homeBtn = By.xpath("//button[@class='btn home']");
		By cutomerLoginBtn = By.xpath("//button[text()='Customer Login']");
		By managerLoginBtn = By.xpath("//button[text()='Bank Manager Login']");
		
		By addCustomerMenuBtn = By.xpath("//button[@class='btn btn-lg tab'][1]");
		By addCustomerBtn = By.xpath("//button[text()='Add Customer']");
		By firstName = By.xpath("//input[@placeholder='First Name']");
		By lastName = By.xpath("//input[@placeholder='Last Name']");
		By postCode = By.xpath("//input[@placeholder='Post Code']");
		
		driver.findElement(managerLoginBtn).click();
		Thread.sleep(2000);
		
		driver.findElement(addCustomerMenuBtn).click();
		Thread.sleep(2000);
		
		driver.findElement(firstName).sendKeys("Sajin");
		driver.findElement(lastName).sendKeys("Krishnan");
		Thread.sleep(1000);
		driver.findElement(postCode).sendKeys("132028");
		Thread.sleep(1000);
		driver.findElement(addCustomerBtn).click();
//		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		driver.quit();
	}
	
	
	/*Exception in thread "main" org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Customer added successfully with customer id :6}
  (Session info: chrome=89.0.4389.128): Customer added successfully with customer id :6
Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'
System info: host: 'CRUISE', ip: '192.168.1.72', os.name: 'Windows 10', os.arch: 'amd64', os.version: '10.0', java.version: '11'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.128, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\Users\Cruise\AppData\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:60049}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}
Session ID: a101b23e4493ceee653606f99f94f672
	at org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)
	at org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)*/
	

}
