Feature: Login page test cases
  
  @login @valid_login
  Scenario: Login to the FB Account
    Given Load the App
    Then Enter the email as 0767291539
    Then Enter the Password as Iit19002indika12@#
    Then Click Login button
    Then Click Ok for save the login info


