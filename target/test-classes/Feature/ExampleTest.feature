Feature: Test Log in fucntionality

  Scenario: Check login functionality with valid creadentials
    Given user Browser is open
    And User is on the log in page
    When User enter <username> and <password> 
    And User click on the Log in button
    Then User navigate to the Home page
    
    Examples:
    |username|password|
    |Raghav  |12345   |
    |Ele     |12345   |
   
