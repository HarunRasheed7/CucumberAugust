package com.telecom.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.commonaction.CommonAction;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends CommonAction {
	
	
	@Before
	public void beforeScenario() {
		launch();
	
   }
	@After
	public void afterScenario() {
		driver.close();
	}
	
}
