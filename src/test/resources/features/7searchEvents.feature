Feature: Users can search for specific events and filter them based on certain criteria

  Scenario: Search for events by location
    Given The User is on the Dashboard
    When The User presses the Search button dropdown
    When The User presses the Events option
    When The User presses the Events button
    Then The Search page should appear with no results
    When The User selects a state from the dropdown menu in the Refine Search panel
    When The User presses the Filter Results button
    Then The search updates to only shown events from that state


  Scenario: Search for events by type
    Given The User is on the Dashboard
    When The User presses the Search button dropdown
    When The User presses the Events option
    When The User presses the Events button
    Then The Search page should appear with no results
    When The User selects a type from the dropdown menu in the Refine Search panel
    When The User presses the Filter Results button
    Then The search updates to only shown events from that type


  Scenario: Search for events by skill
    Given The User is on the Dashboard
    When The User presses the Search button dropdown
    When The User presses the Events option
    When The User presses the Events button
    Then The Search page should appear with no results
    When The User selects a skill from the dropdown menu in the Refine Search panel
    When The User presses the Filter Results button
    Then The search updates to only shown events from that skill


  Scenario: Search for events by date
    Given The User is on the Dashboard
    When The User presses the Search button dropdown
    When The User presses the Events option
    When The User presses the Events button
    Then The Search page should appear with no results
    When The User selects a date from the dropdown menu in the Refine Search panel
    When The User presses the Filter Results button
    Then The search updates to only shown events before that date


  Scenario: Search events by name
    Given The User is on the Dashboard
    When The User types something in the search bar
    When The User presses the Search button dropdown
    When The User presses the Events option
    When The User presses the Events button
    Then The User should be on the Search page with all event that match the search


    Scenario: Blank search
      Given The User is on the Dashboard
      When The User presses the Search button dropdown
      When The User presses the Events option
      When The User presses the Events button
      Then The Search page should appear with no results and the test ends