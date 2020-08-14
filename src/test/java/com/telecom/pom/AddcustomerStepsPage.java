package com.telecom.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commonaction.CommonAction;

public class AddcustomerStepsPage extends CommonAction{
   public AddcustomerStepsPage() {
	PageFactory.initElements(driver, this);
}
 @FindBy(id="fname")
  private WebElement fname;
  public WebElement getFname() {
	return fname;
}
public WebElement getLname() {
	return lname;
}
public WebElement getEmail() {
	return email;
}
public WebElement getAddr() {
	return addr;
}
public WebElement getPhno() {
	return phno;
}
@FindBy(id="lname")
 private WebElement lname;
 @FindBy(id="email")
 private WebElement email;
 @FindBy(name="addr")
 private WebElement addr;
 @FindBy(id="telephoneno")
 private WebElement phno;
 

}