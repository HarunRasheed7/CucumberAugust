package com.commonaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonAction {
 public static WebDriver driver;
 
 public static void launch() {
		System.setProperty("webdriver.chrome.driver",".//driver//chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    driver.manage().window().maximize();
	   
	}
 public void insertText(WebElement ele,String value) {
	 ele.sendKeys(value);
	 
 }
 public void submit(WebElement ele) {
	 ele.click();
 }
 }
