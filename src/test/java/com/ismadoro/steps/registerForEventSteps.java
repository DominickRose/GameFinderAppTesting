package com.ismadoro.steps;

import com.ismadoro.runners.BasicRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerForEventSteps {

    @When("The User clicks on the Register button")
    public void the_User_clicks_on_the_Register_button() {
        BasicRunner.eventPage.registerEventButton.click();
    }

    @Then("The User is notified that they have successfully joined the Event")
    public void theUserIsNotifiedThatTheyHaveSuccessfullyJoinedTheEvent() throws InterruptedException {
        String x = BasicRunner.eventPage.registerInfo.getText();
        assert x.equals("Successfully registered!");
        BasicRunner.navbarPage.dropDownMenu.click();
        BasicRunner.navbarPage.logoutButton.click();
        Thread.sleep(500);
    }

    @Then("The Register button is disabled")
    public void theRegisterButtonIsDisabled() {
        assert !BasicRunner.eventPage.registerEventButton.isEnabled();
        BasicRunner.navbarPage.banner.click();
    }
}
