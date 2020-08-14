$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature File/AddCustomer.feature");
formatter.feature({
  "name": "Creating a new Customer",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Add Customer button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_clicks_on_Add_Customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User filling of all the details",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_filling_of_all_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will be displayed with the customer Id that is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.user_will_be_displayed_with_the_customer_Id_that_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Feature File/AddTariff.feature");
formatter.feature({
  "name": "Adding tariff",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Add Tariff",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffplanSteps.user_clicks_on_Add_Tariff()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding Tariff plan using one dimensional list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User filling all the details in tariff plans using one dimensional list",
  "rows": [
    {
      "cells": [
        "2000",
        "100",
        "500",
        "10",
        "5",
        "3",
        "1"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffplanSteps.user_filling_all_the_details_in_tariff_plans_using_one_dimensional_list(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on add tariff submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffplanSteps.user_clicks_on_add_tariff_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will be displayed with congratulation msg",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffplanSteps.user_will_be_displayed_with_congratulation_msg()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});