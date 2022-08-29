package com.sda.zdtestpol105.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepdefs {
    @Given("Google page opened")
    public void googlePageOpened() {
        System.out.println("Google page presented to the user");
    }

    @When("I click Accept all button in the popup window")
    public void iClickAcceptAllButtonInThePopupWindow() {
        System.out.println("User clicks accept all button");
    }

    @And("I search for {string} in the search bar")
    public void iSearchForInTheSearchBar(String searchPhrase) {
        System.out.println("User searches for: " + searchPhrase);
    }

    @Then("I get search results")
    public void iGetSearchResults() {
        System.out.println("Dude sees seqarch results");
    }

    @And("I left search bar empty")
    public void iLeftSearchBarEmpty() {
        System.out.println("Search bar left empty");
    }

    @Then("I do not see any search results")
    public void iDoNotSeeAnySearchResults() {
        System.out.println("I dont see any search results");
    }
}
