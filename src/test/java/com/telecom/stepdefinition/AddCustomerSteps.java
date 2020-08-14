package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.commonaction.CommonAction;
import com.telecom.pom.AddcustomerStepsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerSteps extends CommonAction{
	
	AddcustomerStepsPage ac=new AddcustomerStepsPage();

        @Given("User clicks on Add Customer button")
	  public void user_clicks_on_Add_Customer_button() throws InterruptedException {
    	  handleFrame();
	 driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	   
	}

	@When("User filling of all the details")
        public void user_filling_of_all_the_details() throws InterruptedException {
		handleFrame();
		submit(driver.findElement(By.xpath("//label[@for='done']")));
	    //driver.findElement(By.id("fname")).sendKeys("Harun");
	    insertText(ac.getFname(), "Harun");
        //driver.findElement(By.id("lname")).sendKeys("Rasheed");
	    insertText(ac.getLname(), "Rasheed");
	    driver.findElement(By.id("email")).sendKeys("harun@mail.com");
	    driver.findElement(By.name("addr")).sendKeys("Chennai");
	    driver.findElement(By.id("telephoneno")).sendKeys("88887858474");
    
	}
	@When("User filling of all the details with one dimensional list")
	public void user_filling_of_all_the_details_with_one_dimensional_list(DataTable dT) throws InterruptedException {
	   List<String> li = dT.asList();
	   handleFrame();
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(li.get(0));
        driver.findElement(By.id("lname")).sendKeys(li.get(1));
	    driver.findElement(By.id("email")).sendKeys(li.get(2));
	    driver.findElement(By.name("addr")).sendKeys(li.get(3));
	    driver.findElement(By.id("telephoneno")).sendKeys(li.get(4));
	   
	}
	@When("User filling of all the details with one dimensional Map")
	public void user_filling_of_all_the_details_with_one_dimensional_Map(DataTable dT) throws InterruptedException {
		Map<String, String> li = dT.asMap(String.class, String.class);
		handleFrame();
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(li.get("fname"));
        driver.findElement(By.id("lname")).sendKeys(li.get("lname"));
	    driver.findElement(By.id("email")).sendKeys(li.get("mail"));
	    driver.findElement(By.name("addr")).sendKeys(li.get("addr"));
	    driver.findElement(By.id("telephoneno")).sendKeys(li.get("phno"));
	}
	
	
	@When("User filling of all the details with two dimensional list")
	public void user_filling_of_all_the_details_with_two_dimensional_list(DataTable dT) throws InterruptedException {
		List<List<String>> li = dT.asLists();
		handleFrame();
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(li.get(1).get(0));
        driver.findElement(By.id("lname")).sendKeys(li.get(1).get(1));
	    driver.findElement(By.id("email")).sendKeys(li.get(2).get(2));
	    driver.findElement(By.name("addr")).sendKeys(li.get(3).get(3));
	    driver.findElement(By.id("telephoneno")).sendKeys(li.get(3).get(4));
	}
	
	@When("User filling of all the details with two dimensional map")
	public void user_filling_of_all_the_details_with_two_dimensional_map(DataTable dT) throws InterruptedException {
		List<Map<String, String>> li = dT.asMaps(String.class, String.class);
		handleFrame();
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(li.get(1).get("Fname"));
        driver.findElement(By.id("lname")).sendKeys(li.get(1).get("Lname"));
	    driver.findElement(By.id("email")).sendKeys(li.get(2).get("Mail"));
	    driver.findElement(By.name("addr")).sendKeys(li.get(3).get("Addr"));
	    driver.findElement(By.id("telephoneno")).sendKeys(li.get(3).get("Phno"));
	}
	
	@When("User filling of all the details {string},{string},{string},{string},{string}")
	public void user_filling_of_all_the_details(String fname, String lname, String mail, String addr, String phno) throws InterruptedException {
		handleFrame();
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(fname);
        driver.findElement(By.id("lname")).sendKeys(lname);
	    driver.findElement(By.id("email")).sendKeys(mail);
	    driver.findElement(By.name("addr")).sendKeys(addr);
	    driver.findElement(By.id("telephoneno")).sendKeys(phno);
	}


    @When("User click on submit button")
	public void user_click_on_submit_button() throws InterruptedException {
    	
	    driver.findElement(By.name("submit")).click();
	}

	@Then("User will be displayed with the customer Id that is generated")
	public void user_will_be_displayed_with_the_customer_Id_that_is_generated() throws InterruptedException {
		handleFrame();
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	String text = driver.findElement(By.xpath("(//td[@align='center'])[2]")).getText();
	System.out.println(text);
	
	}
	public void handleFrame() throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		driver.switchTo().defaultContent();
		
	}
	
	
}



