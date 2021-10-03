Feature: ANZ Home Loan Calculator
  @type=calc
  Scenario Outline: Validating Home Loan Calculator

    Given user navigates to ANZ Home Loan Calculator
    And user enters the required Details "<income>","<other_income>","<living_expense>","<current_home_loan>","<otherloan_repay>","<other_comms>","<cclimit>"
    And at calculator page - user clicks on calculate button
    And at calculator page - user verifies the  Estiamted amount "<Estimate>"
    And at calculator page - clicks on start over button
    And at calculator page - user verifies fields
    And at calculator page - user enters livining expense as "1"
    And at calculator page - a message should be displayed

    Examples:
      | income | other_income | living_expense| current_home_loan | otherloan_repay | other_comms| cclimit |  Estimate|
      | 80000    | 10000         | 500       |        0          | 100           |   0        |    10000   |   508,000|
