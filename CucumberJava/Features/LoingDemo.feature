Feature: Test Login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given Browser is opens
    And User is on Login page
    When User enters <username> and <password>
    And User clicks on login button
    Then User is navigated to the home page

    Examples: 
      | username | password |
      | Hania    |    12345 |
      | Wazid    |    12345 |
