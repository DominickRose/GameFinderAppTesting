Feature: Users can close their account when it is no longer needed

  Scenario: Close dummy account
    Given The User is logged in on a dummy account
    Given The User is on the Profile page
    When The User clicks on the Settings tab
    Then The Settings menu is displayed
    When The User clicks on the Close Account button
    Then They are redirected to the Dashboard

  Scenario: Close account
    Given The User is logged in
    Given The User is on the Profile page
    When The User clicks on the Settings tab
    Then The Settings menu is displayed
    When The User clicks on the Close Account button
    Then They are redirected to the Dashboard