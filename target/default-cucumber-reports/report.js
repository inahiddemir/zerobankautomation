$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivityNavigation.feature");
formatter.feature({
  "name": "Navigating to specific accounts in Accounts Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Savings account redirect",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountActivityNavigation.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Savings\" link on the \"Zero - Account Summary\" page",
  "keyword": "When "
});
formatter.match({
  "location": "AccountActivityNavigation.the_user_clicks_on_link_on_the_page(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Zero - Account Activity\" page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountActivityNavigation.the_page_should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account dropdown should have \"Savings\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "AccountActivityNavigation.account_dropdown_should_have_selected(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Brokerage account redirect",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountActivityNavigation.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Brokerage\" link on the \"Zero - Account Summary\" page",
  "keyword": "When "
});
formatter.match({
  "location": "AccountActivityNavigation.the_user_clicks_on_link_on_the_page(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Zero - Account Activity\" page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountActivityNavigation.the_page_should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account dropdown should have \"Brokerage\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "AccountActivityNavigation.account_dropdown_should_have_selected(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});