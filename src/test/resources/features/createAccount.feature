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
    Then The User is automatically logged in and redirected to the Dashboard

  Scenario: Creating an Account with missing information
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
    When The User presses the Register button
    Then alert tells the User to fill in all blank fields

  Scenario: Creating an Account with invalid information
    Given The User is on the Dashboard
    When The User presses the sandwich in the corner of the Nav bar
    Then The Flyout window appears
    When The User presses the Sign Up button
    Then The User is redirected to the Register page
    When The User enters invalid information in one or more fields
    When The User presses the Register button
    Then An alert tells the User to verify their information and try again