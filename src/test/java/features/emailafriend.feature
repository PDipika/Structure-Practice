Feature: email a friend
  user wants to refer a product to a friend via email

  Scenario: registered user should be able to refer a product to a friend via email
    Given user is on the email a friend page
    When  user enters all details to refer a product to a friend
    And user click on send email button
    Then email should sent
    And Your message has been sent message should display

  Scenario: non registered user should not be able to refer a product to a friend via email
    Given user is on the email a friend page
    When  user enters all details to refer a product to a friend
    And user click on send email button
    Then Only registered customers can use email a friend feature message should display

