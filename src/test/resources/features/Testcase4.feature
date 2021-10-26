Feature: Contact Page Validation
  @type=testcase3

  Scenario: Validating error messages upon entering invalid data

    Given user launches the jupiter toys website
    And user verifies home page is displayed
    And user maximizes the window
    And user navigates to "contact page"
    And user verifies contact page is loaded
    And at contact page - user enters "Forename" as "   "
    And at contact page - user enters "email" as "testuser1"
    And at contact page - user enters "message" as "  "
    And at contact page - user validates the errors