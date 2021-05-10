package com.sk.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorldPopulation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String totalXpath="//div[@class='maincounter-number']/span[@class='rts-counter']";
		driver.get("https://www.worldometers.info/world-population/");
		Thread.sleep(2000);
		int i=0;
		while(i<5)
		{
			printPopulation(totalXpath,driver);
			i++;
			
		}
		
		Thread.sleep(5000);
		
		driver.quit();
	}
	
	public static void printPopulation(String x, WebDriver driver)
	{
		List<WebElement> list = driver.findElements(By.xpath(x));
		System.out.println("List Size : "+list.size());
		for(WebElement e : list)
		{
			System.out.println(e.getText());
		}

	}

}
