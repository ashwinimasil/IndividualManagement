Feature: Create Lead in the Leaf Taps application

Background:
Given Open the chrome browser
And Load the url

@sanity
Scenario Outline:
Given Enter the username as 'Demosalesmanager'
And Enter the Password as 'crmsfa'
When click on the Login button
Then Home page is displayed
When Click on the CRMSFA button
And Click on the Leads tab
And Click on the Create Lead tab
Given Enter the company Name as <cName>
And Enter the First Name as <fName>
And Enter the Last Name as <lName>
When Click on the submit button
Then A Lead is created as <cName>

Examples:
|lName|fName|cName|
|Masilamani|Ashwini|CTS|
