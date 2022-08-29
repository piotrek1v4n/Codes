package com.sda.zdtestpol105.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentiocationStepdefs {
    @Given("Homepage is opened")
    public void homepageIsOpened() {
        System.out.println("");
    }

    @And("User {string} is registered")
    public void userIsRegistered(String emailAddress) {
    }

    @When("I click Sign in link in top right menu")
    public void iClickSignInLinkInTopRightMenu() {
        
    }

    @And("I provide login {string}")
    public void iProvideLogin(String emailAddress) {
    }

    @And("I provide password {string}")
    public void iProvidePassword(String password) {
    }

    @And("I click green sign in button")
    public void iClickGreenSignInButton() {
        
    }

    @Then("I see page for authenticated user")
    public void iSeePageForAuthenticatedUser() {

    }


    @Then("I see error message {string}")
    public void iSeeErrorMessage(String errorMessage) {
    }

    }
