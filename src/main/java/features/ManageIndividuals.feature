Feature: Verify the individual creation

Scenario Outline: To Create an individual and verify it

And Enter the UserName as 'ashwinimasil@gmail.com'
And Enter the Password as 'Rajash123$'
Then Click the loginbutton
And Click on the toggle menu button from the left corner
And Click the View All button
And Scroll the party consent link
And Click the Individuals link
And Click on the New Individuals tab
Given Enter the LastName <LName>
Then Click the save button
And Verify the first name as <fstName>
 
Examples:
|LName|
|Gowtham|
|Arun|

Scenario Outline: Edit an indvidual in salesforce

And Click on the toggle menu button from the left corner
And Click View All
And click Individuals from App Launcher
And Click on the Individuals tab
And Search the Individuals <Name>
And Click on the Dropdown icon 
And Select Edit
And Select Salutation
And Enter the first name as <fName>
And Click on Save
Then Verify the first name as <fstName>

Examples:
|Name|fName|fName|
|Kumars|Ganesh|Ganesh Kumars|

Scenario Outline: Multiple data for DeleteIndividual function

And Click on the toggle menu button from the left corner
And Click View All
And click Individuals from App Launcher
And Click on the Individuals tab
And Search the Individuals <Name>
And Click on the Dropdown icon
And Select Delete
And Click on the Delete option in the displayed popup window
And The Individual has been deleted
Then Verify Whether Individual is Deleted using <lName>
And Search the deleted name in search textbox
Then Verify again

Examples:
|Name|lName|
|Kumars|Kumars|