package com.ismadoro.steps;

import com.ismadoro.runners.BasicRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

    @When("The User inputs a valid Username into the appropriate text box")
    public void theUserInputsAValidUsernameIntoTheAppropriateTextBox() {
        BasicRunner.navbarPage.usernameInput.sendKeys("dahlman26");
    }

    @When("The User inputs a valid password into the appropriate text box")
    public void theUserInputsAValidPasswordIntoTheAppropriateTextBox() {
        BasicRunner.navbarPage.passwordInput.sendKeys("floppygiant8");
    }

    @When("The User presses the Login button")
    public void theUserPressesTheLoginButton() {
        BasicRunner.navbarPage.loginButton.click();
    }

    @Then("The User should be redirected to the Profile Page")
    public void theUserShouldBeRedirectedToTheProfilePage() throws InterruptedException {
        Thread.sleep(1000);
        assert BasicRunner.driver.getTitle().equals("Your Profile");
        BasicRunner.navbarPage.dropDownMenu.click();
        assert BasicRunner.navbarPage.uCenterText.getText().equals("Ronald Dahl");
        BasicRunner.navbarPage.logoutButton.click();
    }

    @When("The User inputs an invalid Username into the appropriate text box")
    public void theUserInputsAnInvalidUsernameIntoTheAppropriateTextBox() {
        BasicRunner.navbarPage.usernameInput.sendKeys("dahlman2");
    }

    @When("The User inputs an invalid password into the appropriate text box")
    public void theUserInputsAnInvalidPasswordIntoTheAppropriateTextBox() {
        BasicRunner.navbarPage.passwordInput.sendKeys("floppygiant");

    }

    @Then("An alert notifies the User that their username or password is incorrect")
    public void anAlertNotifiesTheUserThatTheirUsernameOrPasswordIsIncorrect() {
        String x = BasicRunner.navbarPage.loginError.getText();
        assert x.equals("No user matches those login credentials");
    }

    @When("The User leaves the Password field empty")
    public void theUserLeavesThePasswordFieldEmpty() {
    }

    @Then("An alert notifies the User that their username or password is empty")
    public void anAlertNotifiesTheUserThatTheirUsernameOrPasswordIsEmpty() {
        String x = BasicRunner.navbarPage.loginError.getText();
        assert x.equals("Please fill out all fields");
    }


}
