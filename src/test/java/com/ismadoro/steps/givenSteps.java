package com.ismadoro.steps;

import com.ismadoro.runners.BasicRunner;
import io.cucumber.java.en.Given;

public class givenSteps {

    @Given("The User is on the Dashboard")
    public void The_User_is_on_the_Dashboard() {
        BasicRunner.driver.get("http://localhost:63342/DomGameFinderApp/pages/home.html");
        BasicRunner.navbarPage.banner.click();
    }

    @Given("The User is on the Search page with search results")
    public void the_User_is_on_the_Search_page_with_search_results() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The User is logged in")
    public void the_User_is_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The User is on the Profile page")
    public void the_User_is_on_the_Profile_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The User is on the Event Details page")
    public void the_User_is_on_the_Event_Details_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The User is logged in on a dummy account")
    public void the_User_is_logged_in_on_a_dummy_account() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Given("The User is on the Event Details page for an Event they created")
    public void theUserIsOnTheEventDetailsPageForAnEventTheyCreated() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The User is on the Fly-out menu")
    public void theUserIsOnTheFlyOutMenu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The User is on the New Event page")
    public void theUserIsOnTheNewEventPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
