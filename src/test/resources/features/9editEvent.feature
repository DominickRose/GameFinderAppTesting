Feature: Users can edit their own events

  Scenario: Editing an Event
    Given The User is logged in
    Given The User is on the Event Details page for an Event they created
    When The User presses the Edit button
    Then They are redirected to the Update page for that Event
    When User types a different event name into the appropriate text box
    When User types a valid city name into the appropriate text box
    When User types a valid number of players into the appropriate text box
    When User selects a state from the dropdown menu
    When User selects a type from the dropdown menu
    When User selects a skill level from the dropdown menu
    When User types a valid description into the appropriate text box
    When The User presses the Update Event button
    Then The User should be redirected to the Event Details page for that event

  Scenario: Editing an Event with missing parameters
    Given The User is logged in
    Given The User is on the Event Details page for an Event they created
    When The User presses the Edit button
    Then They are redirected to the Update page for that Event
    When The User enters new information into the Event fields but leaves a field blank
    When The User presses the Update Event button
    Then An alert tells the User to ensure all fields are filled in

  Scenario: Editing an Event with invalid parameters
    Given The User is logged in
    Given The User is on the Event Details page for an Event they created
    When The User presses the Edit button
    Then They are redirected to the Update page for that Event
    When User types a different event name into the appropriate text box
    When User types a valid event date into the appropriate text box
    When User types a valid number of players into the appropriate text box
    When User selects a state from the dropdown menu
    When User selects a type from the dropdown menu
    When User selects a skill level from the dropdown menu
    When User types a valid description into the appropriate text box
    When User types a number into the city text box
    When The User presses the Update Event button
    Then An alert tells the user to check their information and try again

  Scenario: Cancelling event updating
    Given The User is logged in
    Given The User is on the Event Details page for an Event they created
    When The User presses the Edit button
    Then They are redirected to the Update page for that Event
    When The User presses the Cancel button
    Then The User should be redirected to the Profile Page

  Scenario: Closing an event
    Given The User is logged in
    Given The User is on the Event Details page for an Event they created
    When The User presses the Delete button
    Then The User is redirected to the My Events tab of the Profile page