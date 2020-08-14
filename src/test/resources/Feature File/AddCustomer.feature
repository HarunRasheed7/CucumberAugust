#Author: your.email@your.domain.com

@regression
Feature: Creating a new Customer

Background:
 
 And User clicks on Add Customer button
@smoke @regression
  Scenario: Add Customer
   
    When User filling of all the details
    And User click on submit button
    Then User will be displayed with the customer Id that is generated


  Scenario: Add Customer with one dimensional list
    
    When User filling of all the details with one dimensional list
      | java | Selenium | js@mail.com | lan | 8699898798 |
    And User click on submit button
    Then User will be displayed with the customer Id that is generated

  Scenario: Add Customer with one dimensional Map
   
    When User filling of all the details with one dimensional Map
      | fname | Harun       |
      | lname | Rasheed     |
      | mail  | js@mail.com |
      | addr  | chennai     |
      | phno  |   897987987 |
    And User click on submit button
    Then User will be displayed with the customer Id that is generated

  Scenario: Add Customer with two dimensional list
    
    When User filling of all the details with two dimensional list
      | java  | Selenium | js@mail.com | lan | 8699898798 |
      | HArun | Rasheed  | js@mail.com | lan | 8699898798 |
      | Prem  | Kumar    | js@mail.com | lan | 8699898798 |
      | Satz  | Kumar    | js@mail.com | lan | 8699898798 |
    And User click on submit button
    Then User will be displayed with the customer Id that is generated

  Scenario: Add Customer with two dimensional map
    
    When User filling of all the details with two dimensional map
      | Fname | Lname    | Mail        | Addr | Phno       |
      | java  | Selenium | js@mail.com | lan  | 8699898798 |
      | HArun | Rasheed  | js@mail.com | lan  | 8699898798 |
      | Prem  | Kumar    | js@mail.com | lan  | 8699898798 |
      | Satz  | Kumar    | js@mail.com | lan  | 8699898798 |
    And User click on submit button
    Then User will be displayed with the customer Id that is generated

  Scenario Outline: 
    
    When User filling of all the details "<Fname>","<Lname>","<Mail>","<Addr>","<Phno>"
    And User click on submit button
    Then User will be displayed with the customer Id that is generated

    Examples: 
      | Fname | Lname    | Mail        | Addr | Phno       |
      | java  | Selenium | js@mail.com | lan  | 8699898798 |
      | HArun | Rasheed  | js@mail.com | lan  | 8699898798 |
      | Prem  | Kumar    | js@mail.com | lan  | 8699898798 |
      | Satz  | Kumar    | js@mail.com | lan  | 8699898798 |
