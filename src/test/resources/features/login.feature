Feature: Users can log in to access their Player account

  Scenario: Logging in
    Given The User is on the Fly-out menu
    When The User inputs a valid Username into the appropriate text box
    When The User inputs a valid password into the appropriate text box
    When The User presses the Login button
    Then The User should be redirected to the Dashboard

  Scenario: Logging in with an invalid Username or Password
    Given The User is on the Fly-out menu
    When The User inputs an invalid Username into the appropriate text box
    When The User inputs an invalid password into the appropriate text box
    When The User presses the Login button
    Then An alert notifies the User that their username or password is incorrect

  Scenario: Logging in with a blank Username or Password
    Given The User is on the Fly-out menu
    When The User inputs a valid Username into the appropriate text box
    When The User leaves the Password field empty
    When The User presses the Login button
    Then An alert notifies the User that their username or password is incorrect

  Scenario: Closing the Fly-out menu before logging in
    Given The User is on the Fly-out menu
    When The User inputs a valid Username into the appropriate text box
    When The User inputs a valid password into the appropriate text box
    When The User closes the Fly-out menu
    Then The Fly-out menu closes
    When The User presses the sandwich in the corner of the Nav bar
    Then The Password and Username fields should be empty