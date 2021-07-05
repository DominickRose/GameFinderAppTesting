package com.ismadoro.steps;

import com.ismadoro.runners.BasicRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class editProfileSteps {

    @When("The User clicks on the Settings tab")
    public void the_User_clicks_on_the_Settings_tab() {
        BasicRunner.profilePage.settingsTab.click();
    }
    @Then("The Settings menu is displayed")
    public void the_Settings_menu_is_displayed() throws InterruptedException {
        Thread.sleep(500);
        assert BasicRunner.profilePage.buttonPrivate.isDisplayed();
    }
    @When("The User clicks on the Public button")
    public void theUserClicksOnThePublicButton() {
        BasicRunner.profilePage.buttonPublic.click();
    }
    @Then("The User is notified that their visibility status is public")
    public void theUserIsNotifiedThatTheirVisibilityStatusIsPublic() throws InterruptedException {
        Thread.sleep(2000);
        String x = BasicRunner.profilePage.visibilityText.getText();
        assert x.equals("Your profile is visible");
        BasicRunner.navbarPage.dropDownMenu.click();
        BasicRunner.navbarPage.logoutButton.click();
        Thread.sleep(500);
    }
    @When("The User clicks on the Private button")
    public void theUserClicksOnThePrivateButton() {
        BasicRunner.profilePage.buttonPrivate.click();
    }
    @Then("The User is notified that their visibility status is private")
    public void theUserIsNotifiedThatTheirVisibilityStatusIsPrivate() throws InterruptedException {
        Thread.sleep(2000);
        String x = BasicRunner.profilePage.visibilityText.getText();
        assert x.equals("Your profile is not visible");
        BasicRunner.navbarPage.dropDownMenu.click();
        BasicRunner.navbarPage.logoutButton.click();
        Thread.sleep(500);
    }
    @When("The User enters information into the fields under the Update Profile Info section")
    public void theUserEntersInformationIntoTheFieldsUnderTheUpdateProfileInfoSection() {
        BasicRunner.profilePage.inputCity.clear();
        BasicRunner.profilePage.inputCity.sendKeys("Albuquerque");
    }

    @When("The User presses the Update Profile button")
    public void theUserPressesTheUpdateProfileButton() throws InterruptedException {
        BasicRunner.profilePage.updateButton.click();
        Thread.sleep(500);
    }

    @Then("The User is notified that their account was updated successfully")
    public void theUserIsNotifiedThatTheirAccountWasUpdatedSuccessfully() throws InterruptedException {
        BasicRunner.profilePage.profileTab.click();
        Thread.sleep(1000);
        String x = BasicRunner.profilePage.cityStateText.getText();
        assert x.equals("Albuquerque, VA");
        BasicRunner.navbarPage.dropDownMenu.click();
        BasicRunner.navbarPage.logoutButton.click();
        Thread.sleep(500);
    }

}
