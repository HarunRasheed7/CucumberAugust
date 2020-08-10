#Author: your.email@your.domain.com
Feature: Creating a new Customer

  Scenario Outline: 
    Given User Launch Telecom Site
    And User clicks on Add Customer button
    When User filling of all the details "<Fname>","<Lname>","<Mail>","<Addr>","<Phno>"
    And User click on submit button
    Then User will be displayed with the customer Id that is generated

    Examples: 
      | Fname | Lname    | Mail        | Addr | Phno       |
      | java  | Selenium | js@mail.com | lan  | 8699898798 |
      | HArun | Rasheed  | js@mail.com | lan  | 8699898798 |
      | Prem  | Kumar    | js@mail.com | lan  | 8699898798 |
      | Satz  | Kumar    | js@mail.com | lan  | 8699898798 |
