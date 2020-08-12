package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffplanSteps {
	

	@Given("User clicks on Add Tariff")
	public void user_clicks_on_Add_Tariff() throws InterruptedException {
		handleFrame();
	   AddCustomerSteps.driver.findElement(By.xpath("(//a[@href='addtariffplans.php'])[1]")).click();
	}

	@When("User filling all the details in tariff plans")
	public void user_filling_all_the_details_in_tariff_plans() throws InterruptedException {
		handleFrame();
	    AddCustomerSteps.driver.findElement(By.id("rental1")).sendKeys("2000");
	    AddCustomerSteps.driver.findElement(By.id("local_minutes")).sendKeys("100");
	    AddCustomerSteps.driver.findElement(By.id("inter_minutes")).sendKeys("200");
	    AddCustomerSteps.driver.findElement(By.id("sms_pack")).sendKeys("10");
	    AddCustomerSteps.driver.findElement(By.id("minutes_charges")).sendKeys("1");
	    AddCustomerSteps.driver.findElement(By.id("inter_charges")).sendKeys("3");
	    AddCustomerSteps.driver.findElement(By.id("sms_charges")).sendKeys("2");
	}
	@When("User filling all the details in tariff plans using one dimensional list")
	public void user_filling_all_the_details_in_tariff_plans_using_one_dimensional_list(DataTable dT) throws InterruptedException {
		handleFrame();
		List<String> li = dT.asList();
	    AddCustomerSteps.driver.findElement(By.id("rental1")).sendKeys(li.get(0));
	    AddCustomerSteps.driver.findElement(By.id("local_minutes")).sendKeys(li.get(1));
	    AddCustomerSteps.driver.findElement(By.id("inter_minutes")).sendKeys(li.get(2));
	    AddCustomerSteps.driver.findElement(By.id("sms_pack")).sendKeys(li.get(3));
	    AddCustomerSteps.driver.findElement(By.id("minutes_charges")).sendKeys(li.get(4));
	    AddCustomerSteps.driver.findElement(By.id("inter_charges")).sendKeys(li.get(5));
	    AddCustomerSteps.driver.findElement(By.id("sms_charges")).sendKeys(li.get(6));
	}
	@When("User filling all the details in tariff plans using two dimensional list")
	public void user_filling_all_the_details_in_tariff_plans_using_two_dimensional_list(DataTable dT) throws InterruptedException {
		handleFrame();
		List<List<String>> li = dT.asLists();
		AddCustomerSteps.driver.findElement(By.id("rental1")).sendKeys(li.get(0).get(6));
	    AddCustomerSteps.driver.findElement(By.id("local_minutes")).sendKeys(li.get(1).get(0));
	    AddCustomerSteps.driver.findElement(By.id("inter_minutes")).sendKeys(li.get(3).get(1));
	    AddCustomerSteps.driver.findElement(By.id("sms_pack")).sendKeys(li.get(3).get(2));
	    AddCustomerSteps.driver.findElement(By.id("minutes_charges")).sendKeys(li.get(0).get(3));
	    AddCustomerSteps.driver.findElement(By.id("inter_charges")).sendKeys(li.get(2).get(4));
	    AddCustomerSteps.driver.findElement(By.id("sms_charges")).sendKeys(li.get(3).get(5));
	}
	@When("User filling all the details in tariff plans using one dimensional map")
	public void user_filling_all_the_details_in_tariff_plans_using_one_dimensional_map(DataTable dT) throws InterruptedException {
		handleFrame();
		Map<String,String> li = dT.asMap(String.class,String.class);
		 AddCustomerSteps.driver.findElement(By.id("rental1")).sendKeys(li.get("A"));
		    AddCustomerSteps.driver.findElement(By.id("local_minutes")).sendKeys(li.get("B"));
		    AddCustomerSteps.driver.findElement(By.id("inter_minutes")).sendKeys(li.get("C"));
		    AddCustomerSteps.driver.findElement(By.id("sms_pack")).sendKeys(li.get("D"));
		    AddCustomerSteps.driver.findElement(By.id("minutes_charges")).sendKeys(li.get("E"));
		    AddCustomerSteps.driver.findElement(By.id("inter_charges")).sendKeys(li.get("F"));
		    AddCustomerSteps.driver.findElement(By.id("sms_charges")).sendKeys(li.get("G"));
		
	}
	@When("User filling all the details in tariff plans using two dimensional map")
	public void user_filling_all_the_details_in_tariff_plans_using_two_dimensional_map(DataTable dT) throws InterruptedException {
		handleFrame();
		List<Map<String, String>> li = dT.asMaps();
		AddCustomerSteps.driver.findElement(By.id("rental1")).sendKeys(li.get(0).get("A"));
	    AddCustomerSteps.driver.findElement(By.id("local_minutes")).sendKeys(li.get(1).get("B"));
	    AddCustomerSteps.driver.findElement(By.id("inter_minutes")).sendKeys(li.get(3).get("C"));
	    AddCustomerSteps.driver.findElement(By.id("sms_pack")).sendKeys(li.get(3).get("D"));
	    AddCustomerSteps.driver.findElement(By.id("minutes_charges")).sendKeys(li.get(0).get("E"));
	    AddCustomerSteps.driver.findElement(By.id("inter_charges")).sendKeys(li.get(2).get("F"));
	    AddCustomerSteps.driver.findElement(By.id("sms_charges")).sendKeys(li.get(3).get("G"));
	}
    
	@When("User filling all the details in tariff plans {string},{string},{string},{string},{string},{string},{string},")
	public void user_filling_all_the_details_in_tariff_plans(String A, String B, String C, String D, String E, String F, String G) throws InterruptedException {
		handleFrame();
		AddCustomerSteps.driver.findElement(By.id("rental1")).sendKeys(A);
	    AddCustomerSteps.driver.findElement(By.id("local_minutes")).sendKeys(B);
	    AddCustomerSteps.driver.findElement(By.id("inter_minutes")).sendKeys(C);
	    AddCustomerSteps.driver.findElement(By.id("sms_pack")).sendKeys(D);
	    AddCustomerSteps.driver.findElement(By.id("minutes_charges")).sendKeys(E);
	    AddCustomerSteps.driver.findElement(By.id("inter_charges")).sendKeys(F);
	    AddCustomerSteps.driver.findElement(By.id("sms_charges")).sendKeys(G);
	}


	@When("User clicks on add tariff submit button")
	public void user_clicks_on_add_tariff_submit_button() {
		
	    AddCustomerSteps.driver.findElement(By.name("submit")).click();
	}

	@Then("User will be displayed with congratulation msg")
	public void user_will_be_displayed_with_congratulation_msg() throws InterruptedException {
		handleFrame();
	   Assert.assertTrue(AddCustomerSteps.driver.findElement(By.xpath("//h2[@style='text-align: center;font-weight: 700;font-size:28px;']")).isDisplayed());
	   String text = AddCustomerSteps.driver.findElement(By.xpath("//h2[@style='text-align: center;font-weight: 700;font-size:28px;']")).getText();
	   System.out.println(text);
	   AddCustomerSteps.driver.close();
	}
	

 public void handleFrame() throws InterruptedException {
	 Thread.sleep(5000);
	 AddCustomerSteps.driver.switchTo().frame("flow_close_btn_iframe");
	 AddCustomerSteps.driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
	 AddCustomerSteps.driver.switchTo().defaultContent();
 }

}
