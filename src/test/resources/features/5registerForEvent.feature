Feature: Users can register for events

  Scenario: Registering for an Event while logged in
    Given The User is logged in
    Given The User is on the Event Details page
    When The User clicks on the Register button
    Then The User is notified that they have successfully joined the Event

  Scenario: Anonymous User tries to register for an Event
    Given The User is on the Event Details page
    Then The Register button is disabled