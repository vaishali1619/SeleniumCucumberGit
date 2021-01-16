Feature: Login feature
@test1
Scenario: Login application
Given Browser is open
When user enter "user" and "password"
Then click submit button

@test2
Scenario: Login application
Given 1Browser is open
When 1user enter "user" and "password"
Then 1click submit button
