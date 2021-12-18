Feature: Demo Error fuctionality test

  Scenario: Check login with valid credential
    Given user calculate 1/10
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

	@smoke
  Scenario: Check login with invalid credential
    Given user is on login page
    When user enters invalid username and password
    And clicks on login button
    Then error message is displayed- invalid credentials
