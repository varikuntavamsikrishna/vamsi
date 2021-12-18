Feature: Free MyInfo OrangeHRM

	Scenario Outline: User is able to edit MyInfo page

	Given User is already on login page
	When Title of login page is OrangeHRM
	Then User enters "<username>" and User enters "<password>"
	Then User clicks on login button
	Then user clicks on MyInfo tab
	Then user clicks on Edit button
	Then user enters "<fname>" and "<mname>" and "<lname>"
	Then user clicks on save button 
	Then close the browser
	
	Examples: 
	
	|username|password|fname|mname|lname|
	|Admin|admin123|Hania|baby|G|
	|Admin|admin123|Hanu|baby|Janu|
