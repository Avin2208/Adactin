Feature: Feature to test login fuctionality

@Smoketest
Scenario Outline: Check login is successful with valid credentials
Given user in on login page
When user enters username "<username>" 
And user enters password "<pasword>"
And clicks on login button
Then user is navigate to the home page

Examples: 
|username|password|
|AAA|111|
|BBB|222|
|CCC|333|
|Avin2208|220897|
