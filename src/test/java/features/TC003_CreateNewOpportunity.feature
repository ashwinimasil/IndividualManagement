Feature: Work in the Sales Force Application

#Background: 
#Given Load the browser
#And Enter the url

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
