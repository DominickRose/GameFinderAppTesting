package com.ismadoro.steps;

import com.ismadoro.runners.BasicRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class viewEventsSteps {

    @When("The User clicks on an event")
    public void the_User_clicks_on_an_event() throws InterruptedException {
        Thread.sleep(2000);
        BasicRunner.searchPage.eventResultRow1.click();
        Thread.sleep(500);
    }
    @Then("The User should be on the Event Details page for that event")
    public void the_User_should_be_on_the_Event_Details_page_for_that_event() throws InterruptedException {
        Thread.sleep(500);
        assert BasicRunner.driver.getTitle().equals("Event View");
        BasicRunner.navbarPage.banner.click();
        Thread.sleep(2000);
    }

    @When("The User clicks on the My Events tab")
    public void the_User_clicks_on_the_My_Events_tab() {
        BasicRunner.profilePage.eventTab.click();
    }
    @Then("The My Events tab comes into view")
    public void the_My_Events_tab_comes_into_view() throws InterruptedException {
        Thread.sleep(500);
        assert BasicRunner.profilePage.buttonNewEvent.isDisplayed();
    }
    @When("The User clicks on an event from either table")
    public void the_User_clicks_on_an_event_from_either_table() {
        BasicRunner.profilePage.createTableRow1.click();
    }

    @Then("The User should be on the Event Details page for their event")
    public void theUserShouldBeOnTheEventDetailsPageForTheirEvent() throws InterruptedException {
        Thread.sleep(500);
        assert BasicRunner.driver.getTitle().equals("Event View");
        BasicRunner.navbarPage.dropDownMenu.click();
        BasicRunner.navbarPage.logoutButton.click();
        Thread.sleep(500);
    }
}
