Feature: Login functionality for OrangeHRM

  Scenario Outline: Successful login with valid credentials
    Given the orangrhrm website is loaded
    When the user enters valid username and password
    And clicks on the login button
    Then the page redirects to the home page
    
    
