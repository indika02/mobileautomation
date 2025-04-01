Feature: Dashboard test cases

  @dashboard @search_user
  Scenario: Searching a user account
    Given Load the App
    Then Enter the email as 0767291539
    Then Enter the Password as Iit19002indika12@#
    Then Click Login button
    Then Click Ok for save the login info
    Then Click the search icon
    Then Enter the user's name as Indika

  @dashboard @friends_tab
  Scenario: Check the Availability of friends tab
    Given Load the App
    Then Enter the email as 0767291539
    Then Enter the Password as Iit19002indika12@#
    Then Click Login button
    Then Click Ok for save the login info
    Then Click on the friends tab
    Then Verify the tab title as Friends

  @dashboard @story_swipe
  Scenario: Swipe a facebook story
    Given Load the App
    Then Enter the email as 0767291539
    Then Enter the Password as Iit19002indika12@#
    Then Click Login button
    Then Click Ok for save the login info
    Then Swipe a facebook story

  @dashboard @view_story
  Scenario: View a story
    Given Load the App
    Then Enter the email as 0767291539
    Then Enter the Password as Iit19002indika12@#
    Then Click Login button
    Then Click Ok for save the login info
    Then Click on the Story
