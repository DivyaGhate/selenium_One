Feature: Open SauceDemo feature with datatable with Example

Scenario Outline: Open SauceDemo website and login with databases
	Given user launches
	When user enters the credential values
	|standard_user|secret_sauce|
	|standard_user|secret_sauce1|
	
	Then close the browser window and quit
	