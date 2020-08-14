#Author: your.email@your.domain.com
Feature: Adding tariff

Background:

And User clicks on Add Tariff


  Scenario: Adding Tariff plan
   
    
    When User filling all the details in tariff plans
    And User clicks on add tariff submit button
    Then User will be displayed with congratulation msg
@smoke
  Scenario: Adding Tariff plan using one dimensional list
    
    When User filling all the details in tariff plans using one dimensional list
      | 2000 | 100 | 500 | 10 | 5 | 3 | 1 |
    And User clicks on add tariff submit button
    Then User will be displayed with congratulation msg

  Scenario: Adding Tariff plan using two dimensional list
    
    When User filling all the details in tariff plans using two dimensional list
      | 2000 | 100 | 500 |  10 |  5 | 3 | 1 |
      | 3000 | 200 |  70 | 300 | 20 | 9 | 9 |
      | 2000 | 100 | 500 |   7 |  5 | 8 | 8 |
      | 3000 | 200 |  70 | 300 | 20 | 5 | 7 |
    And User clicks on add tariff submit button
    Then User will be displayed with congratulation msg

  Scenario: Adding Tariff plan using one dimensional map
    
    When User filling all the details in tariff plans using one dimensional map
      | A | 2000 |
      | B |  100 |
      | C |   30 |
      | D |   10 |
      | E |    3 |
      | F |    5 |
      | G |    2 |
    And User clicks on add tariff submit button
    Then User will be displayed with congratulation msg

  Scenario: Adding Tariff plan using two dimensional map
   
    When User filling all the details in tariff plans using two dimensional map
      | A    | B   | C   | D   | E  | F | G |
      | 2000 | 100 | 500 |  10 |  5 | 3 | 1 |
      | 3000 | 200 |  70 | 300 | 20 | 9 | 9 |
      | 2000 | 100 | 500 |   7 |  5 | 8 | 8 |
      | 3000 | 200 |  70 | 300 | 20 | 5 | 7 |
    And User clicks on add tariff submit button
    Then User will be displayed with congratulation msg

  Scenario Outline: 
    
    When User filling all the details in tariff plans "<A>","<B>","<C>","<D>","<E>","<F>","<G>",
    And User clicks on add tariff submit button
    Then User will be displayed with congratulation msg

    Examples: 
      | A    | B   | C   | D   | E  | F | G |
      | 2000 | 100 | 500 |  10 |  5 | 3 | 1 |
      | 3000 | 200 |  70 | 300 | 20 | 9 | 9 |
      | 2000 | 100 | 500 |   7 |  5 | 8 | 8 |
      | 3000 | 200 |  70 | 300 | 20 | 5 | 7 |
