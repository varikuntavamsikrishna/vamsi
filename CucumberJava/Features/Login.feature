 @SmokeFeature
Feature: Feature to test login functionlity

@smoketest
Scenario: Check login is successfull with valid credential 
Given User is on login page 
When User enter username and password 
And User clicks on login button 
Then User should is navigated to the home page 


