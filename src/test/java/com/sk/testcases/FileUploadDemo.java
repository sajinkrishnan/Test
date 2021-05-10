package com.sk.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		String baseUrl = "http://demo.guru99.com/test/upload/"; 
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
       // uploadElement.sendKeys("C:\\Users\\Cruise\\OneDrive\\Documents\\MyHtml.html");

        // check the "I accept the terms of service" check box
       // driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
      //  driver.findElement(By.name("send")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("file_wraper0")).click();
		Thread.sleep(2000);
		
		/* Upload using Robot class*/
		
		  //put path to your image in a clipboard
//	     StringSelection ss = new StringSelection("C:\\Users\\Cruise\\OneDrive\\Documents\\MyHtml.html");
//	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//	     //imitate mouse events like ENTER, CTRL+C, CTRL+V
//	     Robot robot = new Robot();
//	     robot.delay(250);
//	     robot.keyPress(KeyEvent.VK_ENTER);
//	     robot.keyRelease(KeyEvent.VK_ENTER);
//	     robot.keyPress(KeyEvent.VK_CONTROL);
//	     robot.keyPress(KeyEvent.VK_V);
//	     robot.keyRelease(KeyEvent.VK_V);
//	     robot.keyRelease(KeyEvent.VK_CONTROL);
//	     robot.keyPress(KeyEvent.VK_ENTER);
//	     robot.delay(50);
//	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	     
	     
	  // below line execute the AutoIT script .
	     Runtime.getRuntime().exec("C:\\Users\\Cruise\\OneDrive\\Documents\\AutoIT_FileUpload1.exe");
	     
	     Thread.sleep(2000);
	     
		driver.quit();
		
		
	}

}
