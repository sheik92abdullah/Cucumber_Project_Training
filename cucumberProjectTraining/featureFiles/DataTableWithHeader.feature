@dataDriven
Feature: testing for Loging Function of OrangeHR webpage
Scenario: user login page senerio
Given user deployed on login page to login the webpage
When enter credentials username, password with the below table
|userName|passWord|
|Admin   |admin123| 
And click the login to navigate to your profile
Then  your page should get displayed