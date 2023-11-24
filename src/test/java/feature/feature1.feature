Feature: Calculator claire2dayto

  Scenario: Add two numbers
    Given I have a calculator
    When I add 5 and 7
    Then the result should be 12
