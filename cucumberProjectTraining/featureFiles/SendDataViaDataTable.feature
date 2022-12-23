@dataDriven
Feature: Checking the functionality of OrangeHRM Login Page
Scenario Outline: Checking Login web elements with valid username and password
Given the user lands in Login page
When the user is trying to login with his username "<userName>" and "<passWord>"
And clicked the login button in the webpage
Then the user can able to login sucessfully

Examples:
|userName|passWord|
|Admin   |admin123|
|Admin   |admin13 |