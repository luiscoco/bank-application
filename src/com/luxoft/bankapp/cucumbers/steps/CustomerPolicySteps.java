package com.luxoft.bankapp.cucumbers.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerPolicySteps {

    @Given("the user is on the customer policy page")
    public void theUserIsOnTheCustomerPolicyPage() {
        // TODO: Implement this step
        System.out.println("Navigating to the customer policy page...");
    }

    @When("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String buttonName) {
        // TODO: Implement this step
        System.out.println("Clicking on the '" + buttonName + "' button...");
    }

    @Then("the customer policy details are displayed")
    public void theCustomerPolicyDetailsAreDisplayed() {
        // TODO: Implement this step
        System.out.println("Verifying that customer policy details are displayed...");
    }
}
