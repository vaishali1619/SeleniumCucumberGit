Feature: check Login
@tag
Scenario:

Given User is on login page
When user enter valid username and password
And Clicks on Login button
Then user navigated to the home page
