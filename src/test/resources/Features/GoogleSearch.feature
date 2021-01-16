#Autor
#Date
@tag
Feature: Feature to test Google Search

  @tag1
  Scenario: Validate Google Search is working
    Given user opens Browser
    And user is on google search page
    When user enters "text" in serach box
    And some other action
    And hits enter
    Then user is navigated to serach results
  
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |