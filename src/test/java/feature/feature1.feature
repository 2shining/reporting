Feature: Calculator claire2

  Scenario: Add two numbers
    Given I have a calculator
    When I add 5 and 7
    Then the result should be 12
