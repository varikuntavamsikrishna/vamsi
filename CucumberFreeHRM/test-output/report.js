$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/java/Features/myInfo.feature");
formatter.feature({
  "line": 1,
  "name": "Free MyInfo OrangeHRM",
  "description": "",
  "id": "free-myinfo-orangehrm",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User is able to edit MyInfo page",
  "description": "",
  "id": "free-myinfo-orangehrm;user-is-able-to-edit-myinfo-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of login page is OrangeHRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"\u003cusername\u003e\" and User enters \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on MyInfo tab",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Edit button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters \"\u003cfname\u003e\" and \"\u003cmname\u003e\" and \"\u003clname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "free-myinfo-orangehrm;user-is-able-to-edit-myinfo-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "fname",
        "mname",
        "lname"
      ],
      "line": 17,
      "id": "free-myinfo-orangehrm;user-is-able-to-edit-myinfo-page;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123",
        "Hania",
        "baby",
        "G"
      ],
      "line": 18,
      "id": "free-myinfo-orangehrm;user-is-able-to-edit-myinfo-page;;2"
    },
    {
      "cells": [
        "Admin",
        "admin123",
        "Hanu",
        "baby",
        "Janu"
      ],
      "line": 19,
      "id": "free-myinfo-orangehrm;user-is-able-to-edit-myinfo-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "User is able to edit MyInfo page",
  "description": "",
  "id": "free-myinfo-orangehrm;user-is-able-to-edit-myinfo-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of login page is OrangeHRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"Admin\" and User enters \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on MyInfo tab",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Edit button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters \"Hania\" and \"baby\" and \"G\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "MyinfoStepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 64848660238,
  "status": "passed"
});
formatter.match({
  "location": "MyinfoStepDefinition.title_of_login_page_is_OrangeHRM()"
});
formatter.result({
  "duration": 363830051,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    },
    {
      "val": "admin123",
      "offset": 37
    }
  ],
  "location": "MyinfoStepDefinition.user_enters_username_and_User_enters_password(String,String)"
});
formatter.result({
  "duration": 4066554369,
  "status": "passed"
});
formatter.match({
  "location": "MyinfoStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 11115942523,
  "status": "passed"
});
formatter.match({
  "location": "MyinfoStepDefinition.user_clicks_on_MyInfo_tab()"
});
formatter.result({
  "duration": 5152873518,
  "status": "passed"
});
formatter.match({
  "location": "MyinfoStepDefinition.user_clicks_on_Edit_button()"
});
formatter.result({
  "duration": 483463013,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hania",
      "offset": 13
    },
    {
      "val": "baby",
      "offset": 25
    },
    {
      "val": "G",
      "offset": 36
    }
  ],
  "location": "MyinfoStepDefinition.user_enters_fname_and_mname_and_lname(String,String,String)"
});
formatter.result({
  "duration": 2189329968,
  "status": "passed"
});
formatter.match({
  "location": "MyinfoStepDefinition.user_clicks_on_save_button()"
});
formatter.result({
  "duration": 3548485025,
  "status": "passed"
});
formatter.match({
  "location": "MyinfoStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 2275951948,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User is able to edit MyInfo page",
  "description": "",
  "id": "free-myinfo-orangehrm;user-is-able-to-edit-myinfo-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of login page is OrangeHRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"Admin\" and User enters \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on MyInfo tab",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Edit button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters \"Hanu\" and \"baby\" and \"Janu\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "MyinfoStepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 27980856747,
  "status": "passed"
});
formatter.match({
  "location": "MyinfoStepDefinition.title_of_login_page_is_OrangeHRM()"
});
formatter.result({
  "duration": 16328178,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    },
    {
      "val": "admin123",
      "offset": 37
    }
  ],
  "location": "MyinfoStepDefinition.user_enters_username_and_User_enters_password(String,String)"
});
formatter.result({
  "duration": 563321909,
  "status": "passed"
});
formatter.match({
  "location": "MyinfoStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 9821587837,
  "status": "passed"
});
formatter.match({
  "location": "MyinfoStepDefinition.user_clicks_on_MyInfo_tab()"
});
formatter.result({
  "duration": 2395512120,
  "status": "passed"
});
formatter.match({
  "location": "MyinfoStepDefinition.user_clicks_on_Edit_button()"
});
formatter.result({
  "duration": 303014085,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hanu",
      "offset": 13
    },
    {
      "val": "baby",
      "offset": 24
    },
    {
      "val": "Janu",
      "offset": 35
    }
  ],
  "location": "MyinfoStepDefinition.user_enters_fname_and_mname_and_lname(String,String,String)"
});
formatter.result({
  "duration": 1855174152,
  "status": "passed"
});
formatter.match({
  "location": "MyinfoStepDefinition.user_clicks_on_save_button()"
});
formatter.result({
  "duration": 2328738909,
  "status": "passed"
});
formatter.match({
  "location": "MyinfoStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 1113106917,
  "status": "passed"
});
});