package com.telecom.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffplanSteps {
	static WebDriver driver;
	
	
	@Given("User launch the telecom website for adding tariff")
	public void user_launch_the_telecom_website_for_adding_tariff() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace-new\\CucumberAugust\\driver\\chromedriver.exe");
			driver =new ChromeDriver();	
			driver.get("http://demo.guru99.com/telecom/index.html");
			driver.manage().window().maximize();
	   
	}

	@Given("User clicks on Add Tariff")
	public void user_clicks_on_Add_Tariff() throws InterruptedException {
		handleFrame();
	   driver.findElement(By.xpath("(//a[@href='addtariffplans.php'])[1]")).click();
	}

	@When("User filling all the details in tariff plans")
	public void user_filling_all_the_details_in_tariff_plans() throws InterruptedException {
		handleFrame();
	    driver.findElement(By.id("rental1")).sendKeys("2000");
	    driver.findElement(By.id("local_minutes")).sendKeys("100");
	    driver.findElement(By.id("inter_minutes")).sendKeys("200");
	    driver.findElement(By.id("sms_pack")).sendKeys("10");
	    driver.findElement(By.id("minutes_charges")).sendKeys("1");
	    driver.findElement(By.id("inter_charges")).sendKeys("3");
	    driver.findElement(By.id("sms_charges")).sendKeys("2");
	}
	@When("User filling all the details in tariff plans using one dimensional list")
	public void user_filling_all_the_details_in_tariff_plans_using_one_dimensional_list(DataTable dT) throws InterruptedException {
		handleFrame();
		List<String> li = dT.asList();
	    driver.findElement(By.id("rental1")).sendKeys(li.get(0));
	    driver.findElement(By.id("local_minutes")).sendKeys(li.get(1));
	    driver.findElement(By.id("inter_minutes")).sendKeys(li.get(2));
	    driver.findElement(By.id("sms_pack")).sendKeys(li.get(3));
	    driver.findElement(By.id("minutes_charges")).sendKeys(li.get(4));
	    driver.findElement(By.id("inter_charges")).sendKeys(li.get(5));
	    driver.findElement(By.id("sms_charges")).sendKeys(li.get(6));
	}
	@When("User filling all the details in tariff plans using two dimensional list")
	public void user_filling_all_the_details_in_tariff_plans_using_two_dimensional_list(DataTable dT) throws InterruptedException {
		handleFrame();
		List<List<String>> li = dT.asLists();
		driver.findElement(By.id("rental1")).sendKeys(li.get(0).get(6));
	    driver.findElement(By.id("local_minutes")).sendKeys(li.get(1).get(0));
	    driver.findElement(By.id("inter_minutes")).sendKeys(li.get(3).get(1));
	    driver.findElement(By.id("sms_pack")).sendKeys(li.get(3).get(2));
	    driver.findElement(By.id("minutes_charges")).sendKeys(li.get(0).get(3));
	    driver.findElement(By.id("inter_charges")).sendKeys(li.get(2).get(4));
	    driver.findElement(By.id("sms_charges")).sendKeys(li.get(3).get(5));
	}



	@When("User clicks on add tariff submit button")
	public void user_clicks_on_add_tariff_submit_button() {
		
	    driver.findElement(By.name("submit")).click();
	}

	@Then("User will be displayed with congratulation msg")
	public void user_will_be_displayed_with_congratulation_msg() throws InterruptedException {
		handleFrame();
	   Assert.assertTrue(driver.findElement(By.xpath("//h2[@style='text-align: center;font-weight: 700;font-size:28px;']")).isDisplayed());
	   String text = driver.findElement(By.xpath("//h2[@style='text-align: center;font-weight: 700;font-size:28px;']")).getText();
	   System.out.println(text);
	}
	

 public void handleFrame() throws InterruptedException {
	 Thread.sleep(5000);
	 driver.switchTo().frame("flow_close_btn_iframe");
	 driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
	 driver.switchTo().defaultContent();
 }

}
