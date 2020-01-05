@Account-Summary
Feature: Account Summary Navigation
  User	should	be	able to	navigate in Account Summary page.

#  Account Activity page should have the title Zero – Account activity.
#In the Account drop down default option should be Savings.
# Account drop down should have the following options:
# Savings, Checking, Loan, Credit Card, Brokerage.
# Transactions table should have column names Date, Description, Deposit, Withdrawal.
  Background:

  Scenario: Authorized User is able to login with valid credentials
    Given user is on the login page
    Then User can login with username "username" and password "password"
    Then user can click on login button
    And user verifies that "Zero - Account Summary" page title displayed.

#  Scenario:
#    Given user is on the login page
#    Then User can login with username "username" and password "password"
#    And user can click on login button
#    When user navigates to "Account Activity"
#    And user verifies that "Zero - Account Activity" page title displayed.


  Scenario Outline:User verifies that <module> has  <title>
    Given user is on the login page
    Then User can login with username "username" and password "password"
    And user can click on login button
    When user navigates to "<module>"
    And user verifies that "<title>" page title displayed.
    Examples:
      | module            | title                    |
      | Account Summary   | Zero - Account Summary   |
      | Account Activity  | Zero - Account Activity  |
      | Transfer Funds    | Zero - Transfer Funds    |
      | Pay Bills         | Zero - Pay Bills         |
      | My Money Map      | Zero - My Money Map      |
      | Online Statements | Zero - Online Statements |


  Scenario: Verify all Account Types are displayed
    Given  user is on the login page
    Then User can login with username "username" and password "password"
    And user can click on login button
    When user navigates to "Account Summary"
    And user verifies that account types are displayed
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

  Scenario: Verify Credit Accounts table's column names
    Given  user is on the login page
    Then User can login with username "username" and password "password"
    And user can click on login button
    When user navigates to "Account Summary"
    And user verifies that Credit Accounts tables column names are displayed

      | Account     |
      | Credit Card |
      | Balance     |


