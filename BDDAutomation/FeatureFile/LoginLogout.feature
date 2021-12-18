Feature: Registered and non registered user will come on application and perform activities

Scenario: Registered user comes to application, login and logout
Given User is on login page
When User enters username
And User enters password
And User clicks on signin button
Then User should be loggedin
When User click on Logout button
Then User should be logged out

Scenario: Non Registered user comes to application, Register and Login
Given User is on Registration page
When User enter username
And User enters email address
And User enters password
And User enters password
And User enters confirm password
And User enters date of birth
And User enters phone number
And User enters address
And User click on home address type
And User select gender
And User select country
And User select state
And User select city
And User enters zip code
And User click on agree checkbox
And User click on sign up button
Then User account should be created

