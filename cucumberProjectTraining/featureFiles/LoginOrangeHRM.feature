@orangeValidLogin
Feature: This is the Login Feature for OrangeHRM website
Scenario: This is Login Senerio
Given user is on login page
When user enters a valid username "Admin" and password "admin123"
And click the login button
Then the user should be navigate to homepage  