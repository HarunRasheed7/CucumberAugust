#Author: your.email@your.domain.com
Feature: Adding tariff

  Scenario: Adding Tariff plan
    Given User launch the telecom website for adding tariff
    And User clicks on Add Tariff
    When User filling all the details in tariff plans
    And User clicks on add tariff submit button
    Then User will be displayed with congratulation msg