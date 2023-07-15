Feature: Login functionality for Leaf Taps application

Background:
Given Open the chrome browser
And Load the url  

@Regression
Scenario: Login for Positive credentials
Given Enter the username as 'Demosalesmanager'
And Enter the Password as 'crmsfa'
When click on the Login button
Then Home page is displayed

Scenario: Login for Positive credentials
Given Enter the username as 'Demosalesmanager'
And Enter the Password as 'crmsf'
When click on the Login button
But error is displayed




