package com.ismadoro.steps;

import com.ismadoro.runners.BasicRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class editEventSteps {

    @When("The User presses the Edit button")
    public void theUserPressesTheEditButton() throws InterruptedException {
        Thread.sleep(500);
        BasicRunner.eventPage.updateEventButton.click();
    }

    @Then("They are redirected to the Update page for that Event")
    public void theyAreRedirectedToTheUpdatePageForThatEvent() throws InterruptedException {
        Thread.sleep(2000);
        assert BasicRunner.driver.getTitle().equals("Event Information");

    }

    @When("The User enters new information into the Event fields")
    public void theUserEntersNewInformationIntoTheEventFields() {
        BasicRunner.newEventPage.inputState.sendKeys("ks");
    }

    @When("The User presses the Update Event button")
    public void theUserPressesTheUpdateEventButton() throws InterruptedException {
       Thread.sleep(500);
       BasicRunner.newEventPage.buttonSubmit.click();
       Thread.sleep(2000);
    }

    @When("The User enters new information into the Event fields but leaves a field blank")
    public void theUserEntersNewInformationIntoTheEventFieldsButLeavesAFieldBlank() throws InterruptedException {
        BasicRunner.newEventPage.inputCity.clear();
        BasicRunner.newEventPage.inputName.clear();
        BasicRunner.newEventPage.inputWhen.clear();
        BasicRunner.newEventPage.inputWhen.sendKeys(" ");
        BasicRunner.newEventPage.inputState.sendKeys("ks");
        Thread.sleep(500);
    }

    @When("User types a different event name into the appropriate text box")
    public void userTypesADifferentEventNameIntoTheAppropriateTextBox() {
        BasicRunner.newEventPage.inputName.clear();
        BasicRunner.newEventPage.inputName.sendKeys("AnotherTest");
    }

    @When("The User presses the Delete button")
    public void theUserPressesTheDeleteButton() {
        BasicRunner.eventPage.deleteEventButton.click();
    }

    @Then("The User is redirected to the My Events tab of the Profile page")
    public void theUserIsRedirectedToTheMyEventsTabOfTheProfilePage() throws InterruptedException {
        Thread.sleep(500);
        BasicRunner.navbarPage.dropDownMenu.click();
        BasicRunner.navbarPage.myEventsButton.click();
        Thread.sleep(2000);
        assert BasicRunner.profilePage.buttonNewEvent.isDisplayed();
        BasicRunner.navbarPage.dropDownMenu.click();
        BasicRunner.navbarPage.logoutButton.click();
        Thread.sleep(500);
    }
}
