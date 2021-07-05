Feature: Users can edit their profile information and change visibility status

  Scenario: Change profile visibility to Private
    Given The User is logged in on a dummy account
    When The User clicks on the Settings tab
    Then The Settings menu is displayed
    When The User clicks on the Private button
    Then The User is notified that their visibility status is private

  Scenario: Change profile visibility to Public
    Given The User is logged in
    When The User clicks on the Settings tab
    Then The Settings menu is displayed
    When The User clicks on the Public button
    Then The User is notified that their visibility status is public

  Scenario: Updating User Information
    Given The User is logged in
    When The User clicks on the Settings tab
    Then The Settings menu is displayed
    When The User enters information into the fields under the Update Profile Info section
    When The User presses the Update Profile button
    Then The User is notified that their account was updated successfully
