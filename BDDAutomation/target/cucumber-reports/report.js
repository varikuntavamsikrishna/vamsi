$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginLogout.feature");
formatter.feature({
  "line": 1,
  "name": "Registered and non registered user will come on application and perform activities",
  "description": "",
  "id": "registered-and-non-registered-user-will-come-on-application-and-perform-activities",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Registered user comes to application, login and logout",
  "description": "",
  "id": "registered-and-non-registered-user-will-come-on-application-and-perform-activities;registered-user-comes-to-application,-login-and-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should be loggedin",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User click on Logout button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be logged out",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 438327100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_username()"
});
formatter.result({
  "duration": 51794,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_password()"
});
formatter.result({
  "duration": 50860,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 271569,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_loggedin()"
});
formatter.result({
  "duration": 52727,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_Logout_button()"
});
formatter.result({
  "duration": 51794,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_logged_out()"
});
formatter.result({
  "duration": 55061,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Non Registered user comes to application, Register and Login",
  "description": "",
  "id": "registered-and-non-registered-user-will-come-on-application-and-perform-activities;non-registered-user-comes-to-application,-register-and-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User is on Registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enter username",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enters email address",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enters password",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters password",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters confirm password",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User enters phone number",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enters address",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User click on home address type",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User select gender",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User select country",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User select state",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User select city",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User enters zip code",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User click on agree checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User click on sign up button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User account should be created",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_on_Registration_page()"
});
formatter.result({
  "duration": 66725,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_username()"
});
formatter.result({
  "duration": 55060,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_email_address()"
});
formatter.result({
  "duration": 49928,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_password()"
});
formatter.result({
  "duration": 30329,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_password()"
});
formatter.result({
  "duration": 30796,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_confirm_password()"
});
formatter.result({
  "duration": 46661,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_date_of_birth()"
});
formatter.result({
  "duration": 101255,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_phone_number()"
});
formatter.result({
  "duration": 51794,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_address()"
});
formatter.result({
  "duration": 74191,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_home_address_type()"
});
formatter.result({
  "duration": 52260,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_gender()"
});
formatter.result({
  "duration": 46661,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_country()"
});
formatter.result({
  "duration": 50394,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_state()"
});
formatter.result({
  "duration": 51794,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_city()"
});
formatter.result({
  "duration": 47128,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_zip_code()"
});
formatter.result({
  "duration": 50394,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_agree_checkbox()"
});
formatter.result({
  "duration": 55060,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_sign_up_button()"
});
formatter.result({
  "duration": 51794,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_account_should_be_created()"
});
formatter.result({
  "duration": 127852,
  "status": "passed"
});
});