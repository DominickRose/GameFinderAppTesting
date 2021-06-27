Feature: Users can search for specific events and filter them based on certain criteria

  Scenario: Search for events by location
    Given The User is on the Dashboard
    When The User presses the Search button
    When The User presses the Events button
    Then The Search page should appear with no results
    When The User selects a state from the dropdown menu in the Refine Search panel
    When The User presses the Filter Results button
    Then The search updates to only shown events from that state
    When The User enters a city name in the City field
    When The User presses the Filter Results button
    Then The search updates to only show events from that city


  Scenario: Search events by name
    Given The User is on the Dashboard
    When The User types something in the search bar
    When The User presses the Search button
    When The User presses the Events button
    Then The User should be on the Search page with all event that match the search


    Scenario: Blank search
      Given The User is on the Dashboard
      When The User presses the Search button
      When The User presses the Events button
      Then The Search page should appear with no results


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
      Then The User should be on the Event Details page for that event


    Scenario: Viewing an event from the Recent Events section of the Profile
      Given The User is logged in
      Given The User is on the Profile page
      When The User clicks on an event from the Recent Events tab
      Then The User should be on the Event Details page for that event

