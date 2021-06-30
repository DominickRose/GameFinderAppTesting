Feature: Users can create their own Player account to register for events and keep track of events they've participated in

  Scenario Outline: Creating an Account
    Given The User is on the Dashboard
    When The User presses the sandwich in the corner of the Nav bar
    Then The Flyout window appears
    When The User presses the Sign Up button
    Then The User is redirected to the Register page
    When The User enters <username> into the Username field
    When The User enters <password> into the Password field
    When The User enters <firstName> into the First Name field
    When The User enters <lastName> into the Last Name field
    When The User enters info into the Email field
    When The User enters info into the Phone Number field
    When The User enters info into the City field
    When The User enters info into the State field
    When The User enters info into the Description field
    When The User presses the Register button
    Then The User is automatically logged in and redirected to the Dashboard

    Examples:
      | username  | password     | firstName | lastName |
      | dahlman26 | floppygiant8 | Ronald    | Dahl     |
      | mrprivate | sus          | Hidden    | Guy      |


  Scenario: Creating an Account with missing information
    Given The User is on the Dashboard
    When The User presses the sandwich in the corner of the Nav bar
    Then The Flyout window appears
    When The User presses the Sign Up button
    Then The User is redirected to the Register page
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