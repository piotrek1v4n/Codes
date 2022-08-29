package com.sda.zdtestpol105.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario){

        System.out.println("The name of the scenario is: " + scenario.getName());

//  Start Sellenium here

    }
    @After
    public void afterScenario(Scenario scenario){
        System.out.println("Status of scenario: " + scenario.getStatus());

//  Kill Sellenium
    }

}