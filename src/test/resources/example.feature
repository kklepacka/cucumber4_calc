Feature: Multiplication
  In order to perform calculations
  As a user
  I want to multiply numbers

  Scenario: Multiply two numbers
    Given I have the following numbers:
      | Number1 | Number2 |
      | 2       | 3       |
    When I multiply the numbers
    Then the result should be 6
