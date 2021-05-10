package com.sk.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElement {
	//Did not work
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		Thread.sleep(2000);
		
		By homeBtn = By.xpath("//button[@class='btn home']");
		By cutomerLoginBtn = By.xpath("//button[text()='Customer Login']");
		
		driver.findElement(cutomerLoginBtn).click();
		Thread.sleep(2000);
		driver.findElement(homeBtn).click();
		Thread.sleep(2000);
		driver.findElement(cutomerLoginBtn).click();
		Thread.sleep(2000);
		driver.close();
		
//	List<WebElement> listOfAnchors = driver.findElements(By.tag("a"));
//	for(WebElement anchor : listOfAnchors) {
//	anchor.click();
//	System.out.println(driver.getTitle());
//	driver.navigate.back();
//	}

	}

}
