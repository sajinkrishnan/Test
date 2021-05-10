package com.sk.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		Thread.sleep(2000);
		
		By homeBtn = By.xpath("//button[@class='btn home']");
		By cutomerLoginBtn = By.xpath("//button[text()='Customer Login']");
		By selectDrop = By.id("userSelect");
		By loginBtn = By.xpath("//button[text()='Login']");
		
		driver.findElement(cutomerLoginBtn).click();
		Thread.sleep(2000);
		
		
		Select s = new Select(driver.findElement(selectDrop));
		s.selectByIndex(1);
		System.out.println(driver.findElement(loginBtn).isDisplayed());
		
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
