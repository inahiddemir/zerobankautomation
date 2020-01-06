Feature: Navigating to specific accounts in Accounts Activity

  Scenario: Savings account redirect
    Given the user is logged in
    When the user clicks on "Savings" link on the "Zero - Account Summary" page
    Then the "Zero - Account Activity" page should be displayed
    And Account dropdown should have "Savings" selected

  Scenario: Brokerage account redirect
    Given the user is logged in
    When the user clicks on "Brokerage" link on the "Zero - Account Summary" page
    Then the "Zero - Account Activity" page should be displayed
    And Account dropdown should have "Brokerage" selected