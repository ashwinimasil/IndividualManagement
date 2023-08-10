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

@Regression
Scenario: Create New Oppurtunity and verify its name
Given Enter the username 'ashwinimasil@gmail.com'
And Enter the password 'Rajash123$'
When click on the login button
And Click on toggle menu button from the left corner 
And Click view All and click Sales from App Launcher
And Click on Opportunity tab 
And Click on New button
Given Choose Close date as Tomorrow Date
And Enter Opportunity name as 'Salesforce Automation' by Your Name Get the text and store it
And Select Stage as Needs Analysis
When Click on save
And VerifyOppurtunity Name

@Regression
Scenario: Create Opportunity without Mandatory fields
Given Enter the username 'ashwinimasil@gmail.com'
And Enter the password 'Rajash123$'
When click on the login button
When Click on toggle menu button from the left corner 
And Click view All and click Sales from App Launcher
And Click on Opportunity tab 
And Click on New button
Given Choose Close date as Tomorrow Date
When Click on save
And Verify the Alert message displayed for Name and Stage

@Regression
Scenario: Create Dashboard in Salesforce Application
Given Enter the username 'ashwinimasil@gmail.com'
And Enter the password 'Rajash123$'
When click on the login button
When Click on toggle menu button from the left corner 
And Click view All and click Dashboards from App Launcher
And Click on the New Dashboard option 
Given Enter Name as Salesforce Automation by Your Name and Click on Create
When Click on Save and Verify Dashboard name




