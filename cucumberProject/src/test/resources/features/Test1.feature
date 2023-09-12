Feature: Validating the login functionality of Orange HRM  
Scenario: Validating the login with valid username and password

Given User should be on login page
When User provides Admin and admin123
And click on login button
Then user should be redirected to the homepage