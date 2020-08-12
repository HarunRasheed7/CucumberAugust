$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature File/AddCustomer.feature");
formatter.feature({
  "name": "Creating a new Customer",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add Customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Telecom Site",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerSteps.user_Launch_Telecom_Site()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Add Customer button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_clicks_on_Add_Customer_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User filling of all the details",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_filling_of_all_the_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on submit buttonss",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User will be displayed with the customer Id that is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.user_will_be_displayed_with_the_customer_Id_that_is_generated()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src/test/resources/Feature File/AddTariff.feature");
formatter.feature({
  "name": "Adding tariff",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Adding Tariff plan",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Telecom Site",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerSteps.user_Launch_Telecom_Site()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Add Tariff",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffplanSteps.user_clicks_on_Add_Tariff()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User filling all the details in tariff plans",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffplanSteps.user_filling_all_the_details_in_tariff_plans()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on add tariff submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffplanSteps.user_clicks_on_add_tariff_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will be displayed with congratulation msg",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffplanSteps.user_will_be_displayed_with_congratulation_msg()"
});
formatter.result({
  "status": "skipped"
});
});