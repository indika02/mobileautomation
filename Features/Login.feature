Feature: Login page test cases
  
  @login @valid_login
  Scenario: Login to the FB Account
    Given Load the App
    Then Enter the email as 0767291539
    Then Enter the Password as Iit19002indika12@#
    Then Click Login button
    Then Click Ok for save the login info

  @login @invalid_login
  Scenario: Verify the invalid login error message
    Given Load the App
    Then Enter the email as 0767291534
    Then Enter the Password as Iit19002indika2@#
    Then Click Login button
    Then Verify the error message as Invalid username or password

  @login @password_validation_msg
  Scenario: Verify the validation message when user don't enter the password.
    Given Load the App
    Then Enter the email as 0767291534
    Then Click Login button
    Then Verify the error message as Enter your password to continue.

  @login @forgot_password_page
  Scenario: Verify the forgot password page is available
    Given Load the App
    Then Click the Forgot password link






