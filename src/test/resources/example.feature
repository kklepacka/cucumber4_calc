Feature: Multiplication
  Scenario: Multiply two numbers
    Given I have two numbers: <number1> and <number2>
    When I multiply the numbers
    Then the result should be <result>

  Examples:
    | number1 | number2 | result |
    | 2       | 3       | 6      |
    | 5       | 6       | 30     |
    | 10      | 2       | 20     |