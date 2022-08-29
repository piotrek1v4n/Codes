package com.sda.zdtestpol105.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepdefs {
    @Given("given step")
    public void givenStep() {
        System.out.println("Given turirururu");
    }

    @When("when step")
    public void whenStep() {
        System.out.println("When sompting");
    }

    @Then("then")
    public void then() {
        System.out.println("Then stuff happens and everybody is rich");
    }


    @Then("then v_dwa")
    public void thenV_dwa() {
        System.out.println("Then stuff happens again, but differently");
    }
}
