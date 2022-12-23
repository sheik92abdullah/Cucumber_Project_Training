@dataDriven
Feature: This is to test the Loging Functionality of OrangeHRM site
Scenario: Login Scenerio
Given you are on login page
When you enter the belo credentials username and password
|Admin | admin123| 
And you click the login button to enter to his profile
Then you should see his page