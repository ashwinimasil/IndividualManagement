Feature: Verify the individual creation

Scenario Outline: To Create an individual and verify it

And Enter the UserName as 'ashwinimasil@gmail.com'
And Enter the Password as 'Rajash123$'
Then Click the loginbutton
And Click the Waffle button
And Click the View All button
And Scroll the party consent link
And Click the Individuals link
And Click on the New Individuals tab
Given Enter the LastName <LName>
Then Click the save button
And Verify the Individual created
 
Examples:
|LName|
|Gowtham|
|Arun|