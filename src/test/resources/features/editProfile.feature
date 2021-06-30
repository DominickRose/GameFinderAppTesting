Feature: Users can edit their profile information, change visibility status, and close their account

  Scenario: Change profile visibility to Public
    Given The User is logged in
    Given The User is on the Profile page
    When The User clicks on the Settings tab
    Then The Settings menu is displayed
    When The User clicks on the Public button
    Then The User is notified that their visibility status was updated

  Scenario: Change profile visibility to Private
    Given The User is logged in
    Given The User is on the Profile page
    When The User clicks on the Settings tab
    Then The Settings menu is displayed
    When The User clicks on the Private button
    Then The User is notified that their visibility status was updated

  Scenario: Close account
    Given The User is logged in on a dummy account
    Given The User is on the Profile page
    When The User clicks on the Settings tab
    Then The Settings menu is displayed
    When The User clicks on the Close Account button
    When The User clicks on the Confirm button
    Then They are redirected to the Dashboard

  Scenario: Cancel closing an account
    Given The User is logged in
    Given The User is on the Profile page
    When The User clicks on the Settings tab
    Then The Settings menu is displayed
    When The User clicks on the Close Account button
    When The User clicks on the Cancel button
    Then The Close Account prompt should close

  Scenario: Updating User Information
    Given The User is logged in
    Given The User is on the Profile page
    When The User clicks on the Settings tab
    Then The Settings menu is displayed
    When The User enters information into the fields under the Update Profile Info section
    When The User presses the Update Profile button
    Then The User is notified that their account was updated successfully

  Scenario: Updating User Information with Invalid Information
    Given The User is logged in
    Given The User is on the Profile page
    When The User clicks on the Settings tab
    Then The Settings menu is displayed
    When The User enters invalid information into the fields under the Update Profile Info section
    When The User presses the Update Profile button
    Then An alert tells the User to review their information and try again