package com.example;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {
    private int result;
    private List<Map<String, Integer>> numberPairs;

    @Given("I have the following numbers:")
    public void iHaveTheFollowingNumbers(DataTable dataTable) {
        this.numberPairs = dataTable.asMaps(String.class, Integer.class);
    }

    @When("I multiply the numbers")
    public void iMultiplyTheNumbers() {
        result = numberPairs.stream()
                .mapToInt(pair -> pair.get("Number1") * pair.get("Number2"))
                .reduce(1, Math::multiplyExact);
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int expected) {
        assertEquals(expected, result);
    }
}
