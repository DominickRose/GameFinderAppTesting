package com.ismadoro.steps;

import com.ismadoro.runners.BasicRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class viewProfileSteps {

    @When("The User types the name of a player in the search bar")
    public void the_User_types_the_name_of_a_player_in_the_search_bar() {
        BasicRunner.navbarPage.navbarSearchQuery.sendKeys("Ronald");
    }
    @When("The User presses the Search button dropdown")
    public void the_User_presses_the_Search_button_dropdown() {
        BasicRunner.navbarPage.navbarSearchOption.click();
    }
    @When("The User presses the Players option")
    public void the_User_presses_the_Players_option() {
        BasicRunner.navbarPage.playerSearchOption.click();
    }
    @When("The User types the name of another player in the search bar")
    public void theUserTypesTheNameOfAnotherPlayerInTheSearchBar() {
        BasicRunner.navbarPage.navbarSearchQuery.sendKeys("Hidden");
    }
    @When("The User presses the Players button")
    public void the_User_presses_the_Players_button() {
        BasicRunner.navbarPage.navbarSearch.click();
    }
    @Then("The User is taken to the Search Results page with a list of all players matching their search")
    public void the_User_is_taken_to_the_Search_Results_page_with_a_list_of_all_players_matching_their_search() throws InterruptedException {
        Thread.sleep(1000);
        assert BasicRunner.driver.getTitle().equals("Search Results");
    }
    @When("The User clicks on a name from the search results")
    public void the_User_clicks_on_a_name_from_the_search_results() {
        BasicRunner.searchPage.playerResult1.click();
    }
    @Then("They are taken to that Player's Profile page")
    public void they_are_taken_to_that_Player_s_Profile_page() throws InterruptedException {
        Thread.sleep(1000);
        assert BasicRunner.driver.getTitle().equals("Your Profile");
    }

    @Then("They are taken to a private version of that Player's Profile page")
    public void they_are_taken_to_a_private_version_of_that_Player_s_Profile_page() throws InterruptedException {
        Thread.sleep(1000);
        assert BasicRunner.profilePage.privateNotice.getText().equals("This users profile is private");
    }



}
