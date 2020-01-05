@AccountActivity
Feature: Account Activity Navigation
  User should be able to navigate in Account Activity Page.

  Scenario:Account Activity page havee the title of "Zero - Account Activity"
    Given user is on the login page
    Then User can login with username "username" and password "password"
    And user can click on login button
    When user navigates to "Account Activity"
    And user verifies that "Zero - Account Activity" page title displayed.


  Scenario: In the Account dropdown default option should be Savings.
    Given user is on the login page
    Then User can login with username "username" and password "password"
    And user can click on login button
    When user navigates to "Account Activity"
    When Account drop down should be clickable
    Then "Savings" option should be selected.

  Scenario: In the Account dropdown default option should be Savings.
    Given user is on the login page
    Then User can login with username "username" and password "password"
    And user can click on login button
    When user navigates to "Account Activity"
    When Account drop down should be clickable
    Then Account drop down should have following fields
      | Savings     |
      | Checking    |
      |Savings      |
      | Loan        |
      | Credit Card |
      | Brokerage   |
@a
  Scenario: Transaction table should have Date, Description, Deposit, Withdrawal
    Given user is on the login page
    Then User can login with username "username" and password "password"
    And user can click on login button
    When user navigates to "Account Activity"
    And Transactions table should have following columns
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |


