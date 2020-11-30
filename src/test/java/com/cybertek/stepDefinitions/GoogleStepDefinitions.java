package com.cybertek.stepDefinitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleStepDefinitions {




    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://www.google.com");
    }




    @Then("User should be able to see the title is Google")
    public void user_should_be_able_to_see_the_title_is_google() {
        // Write code here that turns the phrase above into concrete actions

    }

}
