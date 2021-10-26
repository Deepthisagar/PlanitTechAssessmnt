@ContactPage
Feature: Contact Page Validation


  @type=testcase1
  Scenario: Validating contact page errors with and without entering mandatory fields
    Given user launches the jupiter toys website
    And user verifies home page is displayed
    And user maximizes the window
    And user navigates to "contact page"
    And user verifies contact page is loaded
    And at contact page - user clicks on submit button without entering the mandatory fields
    And at contact page - user validates the errors
    And at contact page - user enters "Forename" as "testuser1"
    And at contact page - user enters "email" as "testuser1@gmail.com"
    And at contact page - user enters "message" as "Testing Message box"
    And at contact page - user validates if errors are gone
