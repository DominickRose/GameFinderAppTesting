Feature: Users can search and view registered player profiles

  Scenario: Viewing a public profile
    Given The User is on the Dashboard
    When The User types the name of a player in the search bar
    When The User presses the Search button dropdown
    When The User presses the Players option
    When The User presses the Players button
    Then The User is taken to the Search Results page with a list of all players matching their search
    When The User clicks on a name from the search results
    Then They are taken to that Player's Profile page


  Scenario: Viewing a private profile
    Given The User is on the Dashboard
    When The User types the name of another player in the search bar
    When The User presses the Search button dropdown
    When The User presses the Players option
    When The User presses the Players button
    Then The User is taken to the Search Results page with a list of all players matching their search
    When The User clicks on a name from the search results
    Then They are taken to a private version of that Player's Profile page