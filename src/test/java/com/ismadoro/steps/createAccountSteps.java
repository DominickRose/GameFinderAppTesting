package com.ismadoro.steps;

import com.ismadoro.runners.BasicRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;

public class createAccountSteps {

    @When("The User presses the sandwich in the corner of the Nav bar")
    public void the_User_presses_the_sandwich_in_the_corner_of_the_Nav_bar() {
        BasicRunner.navbarPage.dropDownMenu.click();
    }
    @Then("The Flyout window appears")
    public void the_Flyout_window_appears() throws InterruptedException {
        Thread.sleep(1000);
        assert BasicRunner.navbarPage.signUpButton.isDisplayed();
    }
    @When("The User presses the Sign Up button")
    public void the_User_presses_the_Sign_Up_button() {
        BasicRunner.navbarPage.signUpButton.click();
    }
    @Then("The User is redirected to the Register page")
    public void the_User_is_redirected_to_the_Register_page() throws InterruptedException {
        Thread.sleep(1000);
        assert BasicRunner.driver.getTitle().equals("New User");
    }
    @When("The User enters info into the Username field")
    public void the_User_enters_info_into_the_Username_field() {
        BasicRunner.registerPage.inputUsername.sendKeys("dahlman26");
    }
    @When("The User enters info into the Password field")
    public void the_User_enters_info_into_the_Password_field() {
        BasicRunner.registerPage.inputPassword.sendKeys("floppygiant8");
    }
    @When("The User enters info into the Email field")
    public void the_User_enters_info_into_the_Email_field() {
        BasicRunner.registerPage.inputEmail.sendKeys("dronald@gmail.com");
    }
    @When("The User enters info into the Phone Number field")
    public void the_User_enters_info_into_the_Phone_Number_field() {
        BasicRunner.registerPage.inputPhone.sendKeys("996-456-9876");
    }
    @When("The User enters info into the First Name field")
    public void theUserEntersInfoIntoTheFirstNameField() {
        BasicRunner.registerPage.inputFirstName.sendKeys("Ronald");
    }

    @When("The User enters info into the Last Name field")
    public void theUserEntersInfoIntoTheLastNameField() {
        BasicRunner.registerPage.inputLastName.sendKeys("Dahl");
    }

    @When("The User enters info into the City field")
    public void theUserEntersInfoIntoTheCityField() {
        BasicRunner.registerPage.inputCity.sendKeys("Charleston");
    }

    @When("The User enters info into the State field")
    public void theUserEntersInfoIntoTheStateField() {
        BasicRunner.registerPage.inputState.sendKeys("VA");
    }
    @When("The User enters info into the Description field")
    public void theUserEntersInfoIntoTheDescriptionField() {
        BasicRunner.registerPage.floatingTextArea.sendKeys("Test bio");
    }
    @When("The User presses the Register button")
    public void the_User_presses_the_Register_button() {
        BasicRunner.registerPage.buttonSubmit.click();
    }
    @Then("The User is automatically logged in and redirected to the Dashboard")
    public void the_User_is_automatically_logged_in_and_redirected_to_the_Dashboard() throws InterruptedException {
        Thread.sleep(1000);
        BasicRunner.navbarPage.dropDownMenu.click();
        BasicRunner.navbarPage.logoutButton.click();
        assert BasicRunner.driver.getTitle().equals("Ismadoro");
    }


    @Then("An alert tells the User to fill in all blank fields")
    public void anAlertTellsTheUserToFillInAllBlankFields() {
        String x = BasicRunner.registerPage.newUserError.getText();
        assert x.equals("Make sure all fields are filled properly!");
    }

    @When("The User enters invalid information in one or more fields")
    public void theUserEntersInvalidInformationInOneOrMoreFields() {
        BasicRunner.registerPage.inputPhone.sendKeys("error");

    }

    @Then("An alert tells the User to verify their information and try again")
    public void anAlertTellsTheUserToVerifyTheirInformationAndTryAgain() {
        String x = BasicRunner.registerPage.newUserError.getText();
        assert x.equals("Make sure all fields are filled properly!");
    }

    @Then("alert tells the User to fill in all blank fields")
    public void alertTellsTheUserToFillInAllBlankFields() {
        String x = BasicRunner.registerPage.newUserError.getText();
        assert x.equals("Make sure all fields are filled properly!");
    }


}
