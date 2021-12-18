Feature: Free OrangeHRM
#
#Scenario: Free HRM Login test
#
#	Given User is already on login page
#	When Title of login page is OrangeHRM
#	Then User enters "Admin" and User enters "admin123"
#	Then User clicks on login button
#	Then User is on Home page
#	Then close the browser
	
	Scenario Outline: Free HRM Login test

	Given User is already on login page
	When Title of login page is OrangeHRM
	Then User enters "<username>" and User enters "<password>"
	Then User clicks on login button
	Then User is on Home page
	Then close the browser
	
	Examples: 
	
	|username|password|
	|Admin|admin123|
	|admin|admin123|
#	
#Scenario: User is able to edit MyInfo page
#
#	Given User is already on Home page
#	When user clicks on MyInfo tab
#	Then user clicks on Edit button
#	Then user enters fname and mname and lname
#	Then user clicks on save button 
#
