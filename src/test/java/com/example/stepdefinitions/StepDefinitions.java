package com.example.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {
    private int number1;
    private int number2;
    private int result;

    @Given("I have two numbers: {int} and {int}")
    public void iHaveTwoNumbers(int num1, int num2) {
        this.number1 = num1;
        this.number2 = num2;
    }

    @When("I multiply the numbers")
    public void iMultiplyTheNumbers() {
        this.result = number1 * number2;
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int expected) {
        Assert.assertEquals(expected, result);
    }
}
