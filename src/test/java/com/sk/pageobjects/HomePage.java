package com.sk.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;

	public HomePage(WebDriver driver) {           
        this.driver = driver; 
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//button[@class='btn home']")
	private WebElement homeButton;
	
	@FindBy(xpath="//button[text()='Home']")
	private WebElement homeBtn;
	
	@FindBy(xpath="//button[text()='Customer Login']")
	private WebElement cutomerLoginBtn;
	
	@FindBy(xpath="//button[text()='Bank Manager Login']")
	private WebElement managerLoginBtn;
	
	@FindBy(xpath="//strong[@class='mainHeading1']")
	private WebElement heading;
	
	public String getHeading()
	{
		return heading.getText();
	}
	
	

}
