Feature: register
  As a user, user wants to register into the account
  so that user can use account facility as registered user
  Scenario: user should be able to register successfully with valid email address
  Given user is on the home page
  When user click on the register button,user should be on register page
  When user enters all required registration details
  Then user should be able to click on Register button
  And user should be able to see, Your registration completed message