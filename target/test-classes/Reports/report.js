$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/login.feature");
formatter.feature({
  "name": "user is on the adactin hotel app",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying adactin hotel login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on the facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user in on page",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_in_on_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verify_user_page()"
});
formatter.result({
  "status": "passed"
});
});