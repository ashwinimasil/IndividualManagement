Feature: DeleteIndividual functionality of Salesforce Application

Scenario Outline: Multiple datas for DeleteIndividual function

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