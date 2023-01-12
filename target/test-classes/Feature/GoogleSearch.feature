Feature: Feature to test the google search functionality

  Scenario: Validate the google seacrh functionality
    Given Browser is open
    And User is on google search page
    When User enter the text in the search box
    And Hits the enter button
    Then User is navigated to the search results page
