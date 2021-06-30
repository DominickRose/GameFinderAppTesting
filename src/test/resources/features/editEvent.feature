Feature: Users can edit their own events

  Scenario: Editing an Event
    Given The User is logged in
    Given The User is on the Event Details page for an Event they created
    When The User presses the Edit button
    Then They are redirected to the Update page for that Event
    When The User enters new information into the Event fields
    When The User presses the Update Event button
    Then They receive an alert that the Event was updated

  Scenario: Editing an Event with missing parameters
    Given The User is logged in
    Given The User is on the Event Details page for an Event they created
    When The User presses the Edit button
    Then They are redirected to the Update page for that Event
    When The User enters new information into the Event fields but leaves a field blank
    When The User presses the Update Event button
    Then An alert tells the User to ensure all fields are filled out

  Scenario: Editing an Event with invalid parameters
    Given The User is logged in
    Given The User is on the Event Details page for an Event they created
    When The User presses the Edit button
    Then They are redirected to the Update page for that Event
    When The User enters invalid information into an Event field
    When The User presses the Update Event button
    Then An alert tells the User to ensure all fields are correct

  Scenario: Closing an Event
    Given The User is logged in
    Given The User is on the Event Details page for an Event they created
    When The User presses the Close button
    Then The User is redirected to the Dashboard