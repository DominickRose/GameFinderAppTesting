Feature: Users can create their own Player account to register for events and keep track of events they've participated in

  Scenario: Creating an Account
    Given The User is on the Dashboard
    When The User presses the sandwich in the corner of the Nav bar
    Then The Flyout window appears
    When The User presses the Sign Up button
    Then The User is redirected to the Register page
    When The User enters info into the Username field
    When The User enters info into the Password field
    When The User enters info into the Profile Name field
    When The User enters info into the Email field
    When The User enters info into the Phone Number field
    When The User enters info into the Location field (zipcode)
    When The User presses the Register button
    Then An alert notifies them that their account was made