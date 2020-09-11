package com.tutorial;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class StepDefinitions {

    private LocalDate today;
    private String answer;

    @Given("today is Year {int}, Month {int}, Day {int}")
    public void today_is_Year_Month_Day(Integer year, Integer month, Integer day) {
        // Write code here that turns the phrase above into concrete actions
        this.today = LocalDate.of(year,month,day);
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        this.answer = TGIFUtil.isItFriday(this.today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(this.answer, expectedAnswer);
    }
}
