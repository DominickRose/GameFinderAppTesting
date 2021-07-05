package com.ismadoro.steps;

import com.ismadoro.runners.BasicRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class createEventSteps {

    @When("User types a valid event name into the appropriate text box")
    public void userTypesAValidEventNameIntoTheAppropriateTextBox() {
        BasicRunner.newEventPage.inputName.sendKeys("Test");
    }

    @When("User types a valid city name into the appropriate text box")
    public void userTypesAValidCityNameIntoTheAppropriateTextBox() {
        BasicRunner.newEventPage.inputCity.sendKeys("Place");
    }

    @When("User types a valid event date into the appropriate text box")
    public void userTypesAValidEventDateIntoTheAppropriateTextBox() {
        BasicRunner.newEventPage.inputWhen.sendKeys("11/12/2002:06:00 AM");
    }

    @When("User types a valid number of players into the appropriate text box")
    public void userTypesAValidNumberOfPlayersIntoTheAppropriateTextBox() {
        BasicRunner.newEventPage.inputPlayers.sendKeys("4");
    }

    @When("User selects a state from the dropdown menu")
    public void userSelectsAStateFromTheDropdownMenu() {
        BasicRunner.newEventPage.inputState.sendKeys("f");
    }

    @When("User selects a type from the dropdown menu")
    public void userSelectsATypeFromTheDropdownMenu() {
        BasicRunner.newEventPage.inputType.sendKeys("2");
    }

    @When("User selects a skill level from the dropdown menu")
    public void userSelectsASkillLevelFromTheDropdownMenu() {
        BasicRunner.newEventPage.inputSkill.sendKeys("e");
    }

    @When("User types a valid description into the appropriate text box")
    public void userTypesAValidDescriptionIntoTheAppropriateTextBox() {
        BasicRunner.newEventPage.floatingTextArea.sendKeys("another cool event");
    }

    @When("User clicks the submit button")
    public void userClicksTheSubmitButton() {
        BasicRunner.newEventPage.buttonSubmit.click();
    }

    @Then("The User should be redirected to the Event Details page for that event")
    public void theUserShouldBeRedirectedToTheEventDetailsPageForThatEvent() throws InterruptedException {
        Thread.sleep(2000);
        BasicRunner.navbarPage.banner.click();
        Thread.sleep(500);
        BasicRunner.navbarPage.dropDownMenu.click();
        BasicRunner.navbarPage.myEventsButton.click();
        Thread.sleep(2000);
        BasicRunner.profilePage.createTableRow1.click();
        Thread.sleep(1000);
        assert BasicRunner.driver.getTitle().equals("Event View");
        BasicRunner.navbarPage.dropDownMenu.click();
        BasicRunner.navbarPage.logoutButton.click();
        Thread.sleep(500);
    }

    @Then("An alert tells the User to ensure all fields are filled in")
    public void anAlertTellsTheUserToEnsureAllFieldsAreFilledIn() throws InterruptedException {
        Thread.sleep(500);
        String x = BasicRunner.newEventPage.newEventError.getText();
        assert x.equals("Make sure all fields are filled properly!");
        BasicRunner.navbarPage.dropDownMenu.click();
        BasicRunner.navbarPage.logoutButton.click();
        Thread.sleep(500);
    }

    @When("User types a number into the city text box")
    public void userTypesANumberIntoTheCityTextBox() {
        BasicRunner.newEventPage.inputCity.sendKeys("8");
    }

    @Then("An alert tells the user to check their information and try again")
    public void anAlertTellsTheUserToCheckTheirInformationAndTryAgain() throws InterruptedException {
        String x = BasicRunner.newEventPage.newEventError.getText();
        assert x.equals("Make sure all fields are filled properly!");
        BasicRunner.navbarPage.dropDownMenu.click();
        BasicRunner.navbarPage.logoutButton.click();
        Thread.sleep(500);
    }


    @When("The User presses the Cancel button")
    public void theUserPressesTheCancelButton() {
        BasicRunner.newEventPage.buttonCancel.click();
    }

    @When("The User presses the New Event button")
    public void theUserPressesTheNewEventButton() throws InterruptedException {
        //BasicRunner.action.sendkeys
        Thread.sleep(500);
        BasicRunner.profilePage.buttonNewEvent.click();
    }

    @Then("They are redirected to the New Event page")
    public void theyAreRedirectedToTheNewEventPage() throws InterruptedException {
        Thread.sleep(500);
        assert BasicRunner.newEventPage.inputName.isDisplayed();
    }
}
