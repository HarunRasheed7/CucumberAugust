#Author: your.email@your.domain.com
Feature: Creating a new Customer

  Scenario: Add Customer
    Given User Launch Telecom Site
    And User clicks on Add Customer button
    When User filling of all the details
    And User click on submit buttonss
    Then User will be displayed with the customer Id that is generated

  