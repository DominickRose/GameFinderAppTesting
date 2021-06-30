Feature: Users can create and edit events for others to join

  Scenario: Creating an Event
    Given The User is logged in
    Given The User is on the New Event page
    When User types a valid event name into the appropriate text box
    When User types a valid city name into the appropriate text box
    When User types a valid event date into the appropriate text box
    When User types a valid number of players into the appropriate text box
    When User selects a state from the dropdown menu
    When User selects a type from the dropdown menu
    When User selects a skill level from the dropdown menu
    When User types a valid description into the appropriate text box
    When User clicks the submit button
    Then The User should be redirected to the Event Details page for that event

  Scenario: Creating an Event with a blank field
    Given The User is logged in
    Given The User is on the New Event page
    When User types a valid event name into the appropriate text box
    When User types a valid city name into the appropriate text box
    When User types a valid number of players into the appropriate text box
    When User selects a state from the dropdown menu
    When User selects a type from the dropdown menu
    When User selects a skill level from the dropdown menu
    When User types a valid description into the appropriate text box
    When User clicks the submit button
    Then An alert tells the User to ensure all fields are filled in

  Scenario: Creating an Event with invalid information
    Given The User is logged in
    Given The User is on the New Event page
    When User types a valid event name that is too long into the appropriate text box
    When User types a valid city name into the appropriate text box
    When User types a valid event date into the appropriate text box
    When User types a valid number of players into the appropriate text box
    When User selects a state from the dropdown menu
    When User selects a type from the dropdown menu
    When User selects a skill level from the dropdown menu
    When User types a valid description into the appropriate text box
    When User clicks the submit button
    Then An alert tells the user to check their information and try again