#Author: your.email@your.domain.com
Feature: Adding tariff

  Scenario: Adding Tariff plan
    Given User launch the telecom website for adding tariff
    And User clicks on Add Tariff
    When User filling all the details in tariff plans
    And User clicks on add tariff submit button
    Then User will be displayed with congratulation msg

 Scenario: Adding Tariff plan using one dimensional list
    Given User launch the telecom website for adding tariff
    And User clicks on Add Tariff
    When User filling all the details in tariff plans using one dimensional list
      | 2000 | 100 | 500 | 10 | 5 | 3 | 1 |
    And User clicks on add tariff submit button
    Then User will be displayed with congratulation msg

  Scenario: Adding Tariff plan using two dimensional list
    Given User launch the telecom website for adding tariff
    And User clicks on Add Tariff
    When User filling all the details in tariff plans using two dimensional list
      | 2000 | 100 | 500 |  10 |  5 | 3 | 1 |
      | 3000 | 200 |  70 | 300 | 20 | 9 | 9 |
      | 2000 | 100 | 500 |   7 |  5 | 8 | 8 |
      | 3000 | 200 |  70 | 300 | 20 | 5 | 7 |
    And User clicks on add tariff submit button
    Then User will be displayed with congratulation msg
