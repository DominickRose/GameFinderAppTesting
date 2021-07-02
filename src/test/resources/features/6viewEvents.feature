Feature: Users can view events in several places throughout the site, including past events

  Scenario:Viewing an event from the Search page
    Given The User is on the Search page with search results
    When The User clicks on an event
    Then The User should be on the Event Details page for that event


  Scenario: Viewing an event from the Dashboard
    Given The User is on the Dashboard
    When The User clicks on an event
    Then The User should be on the Event Details page for that event


  Scenario: Viewing an event from the My Events tab in the Profile
    Given The User is logged in
    Given The User is on the Profile page
    When The User clicks on the My Events tab
    Then The My Events tab comes into view
    When The User clicks on an event from either table
    Then The User should be on the Event Details page for their event


  Scenario: Viewing an event from the Recent Events section of the Profile
    Given The User is logged in
    Given The User is on the Profile page
    When The User clicks on an event from the Recent Events tab
    Then The User should be on the Event Details page for their event

