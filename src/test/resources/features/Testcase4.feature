Feature: Contact Page Validation
  @type=testcase4

  Scenario: Validating error messages upon entering invalid data

    Given user launches the jupiter toys website
    And user verifies home page is displayed
    And user maximizes the window
    And user navigates to "shop page"
    And user verifies shop page is loaded
    And at shop page - user clicks on buy button 2 times on "Funny Cow" item
    And at shop page - user clicks on buy button 1 time on "Fluffy bunny" item
    And at shop page - user clicks on cart menu
    And in the cart menu - user verifies if 2 FunnyCow and 1 FluffyBunny items are displayed