Feature: Dashboard test cases

  @login @search_user
  Scenario: Searching a user account
    Given Load the App
    Then Enter the email as 0767291539
    Then Enter the Password as Iit19002indika12@#
    Then Click Login button
    Then Click Ok for save the login info
    Then Enter the user name as Indika
