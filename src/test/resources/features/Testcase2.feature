Feature: Contact Page Validation
  @type=testcase2

  Scenario: Validating successful submission message

    Given user launches the jupiter toys website
    And user verifies home page is displayed
    And user maximizes the window
    And user navigates to "contact page"
    And user verifies contact page is loaded
    And at contact page - user enters "Forename" as "testuser1"
    And at contact page - user enters "email" as "testuser1@gmail.com"
    And at contact page - user enters "message" as "Testing Message box"
    And at contact page - user clicks on submit button
    And at contact page - user validates successful submission message as "Thanks testuser1, we appreciate your feedback."
