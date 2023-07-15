Feature:Edit an indvidual

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

