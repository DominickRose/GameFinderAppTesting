package com.ismadoro.steps;

import com.ismadoro.runners.BasicRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchEventsSteps {

    @When("The User presses the Events option")
    public void the_User_presses_the_Events_option() {
        BasicRunner.navbarPage.eventSearchOption.click();
    }
    @When("The User presses the Events button")
    public void the_User_presses_the_Events_button() {
        BasicRunner.navbarPage.navbarSearch.click();
    }
    @Then("The Search page should appear with no results")
    public void the_Search_page_should_appear_with_no_results() throws InterruptedException {
        Thread.sleep(500);
        assert BasicRunner.searchPage.numSearchResults.getText().equals("No Search results!");
    }
    @When("The User selects a state from the dropdown menu in the Refine Search panel")
    public void the_User_selects_a_state_from_the_dropdown_menu_in_the_Refine_Search_panel() {
        BasicRunner.searchPage.inputState.sendKeys("f");
    }
    @When("The User presses the Filter Results button")
    public void the_User_presses_the_Filter_Results_button() {
        BasicRunner.searchPage.filterResultsButton.click();
    }
    @Then("The search updates to only shown events from that state")
    public void the_search_updates_to_only_shown_events_from_that_state() throws InterruptedException {
        Thread.sleep(1000);
        assert !BasicRunner.searchPage.numSearchResults.getText().equals("No Search results!");
    }

    @When("The User types something in the search bar")
    public void the_User_types_something_in_the_search_bar() {
        BasicRunner.navbarPage.navbarSearchQuery.sendKeys("Test");
    }
    @Then("The User should be on the Search page with all event that match the search")
    public void the_User_should_be_on_the_Search_page_with_all_event_that_match_the_search() {
        assert !BasicRunner.searchPage.numSearchResults.getText().equals("No Search results!");
    }


    @Then("The Search page should appear with no results and the test ends")
    public void theSearchPageShouldAppearWithNoResultsAndTheTestEnds() throws InterruptedException {
        Thread.sleep(500);
        assert BasicRunner.searchPage.numSearchResults.getText().equals("No Search results!");
        BasicRunner.navbarPage.banner.click();
        Thread.sleep(500);
    }

    @When("The User selects a type from the dropdown menu in the Refine Search panel")
    public void theUserSelectsATypeFromTheDropdownMenuInTheRefineSearchPanel() {
        BasicRunner.searchPage.inputType.sendKeys("2");
    }

    @Then("The search updates to only shown events from that type")
    public void theSearchUpdatesToOnlyShownEventsFromThatType() throws InterruptedException {
        Thread.sleep(1000);
        assert !BasicRunner.searchPage.numSearchResults.getText().equals("No Search results!");
    }

    @When("The User selects a skill from the dropdown menu in the Refine Search panel")
    public void theUserSelectsASkillFromTheDropdownMenuInTheRefineSearchPanel() {
        BasicRunner.searchPage.inputSkill.sendKeys("e");
    }

    @Then("The search updates to only shown events from that skill")
    public void theSearchUpdatesToOnlyShownEventsFromThatSkill() throws InterruptedException {
        Thread.sleep(1000);
        assert !BasicRunner.searchPage.numSearchResults.getText().equals("No Search results!");
    }

    @When("The User selects a date from the dropdown menu in the Refine Search panel")
    public void theUserSelectsADateFromTheDropdownMenuInTheRefineSearchPanel() {
        BasicRunner.searchPage.inputWhen.sendKeys("03/04/2003:11:12 AM");
    }

    @Then("The search updates to only shown events before that date")
    public void theSearchUpdatesToOnlyShownEventsBeforeThatDate() throws InterruptedException {
        Thread.sleep(1000);
        assert !BasicRunner.searchPage.numSearchResults.getText().equals("No Search results!");
    }
}