Feature: Login Functionality k

  Scenario: User logs in with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    Then the user should be logged in successfully

  Scenario: User receives an error for invalid credentials
    Given the user is on the login page
    When the user enters invalid username or password
    Then the user should see an error message
