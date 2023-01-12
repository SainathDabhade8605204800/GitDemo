56000089
@SmokeFeature
Feature: Feature to test the log in functionality

@SmokeTest
  Scenario: Check log in with the valid credentials
  
    Given user is on the log in page
    When user enter the username and passwords
    And clicks on the log in button
    Then user navigate to the home page

