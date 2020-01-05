@Pay_Bill
Feature: Pay Bills Navigation

  Background:

    Given user is on the login page
    Then User can login with username "username" and password "password"
    And user can click on login button
    When user navigates to "Pay Bills"


 Scenario:Page title "Pay Bills" verification
   And user verifies that "Zero - Pay Bills" page title displayed.

  Scenario:Succesfully fill out the form

    Then user adds payment information :
      | Payee  | Account | Amount | Date       | Description    |
      | Apple | Savings | 30     | 01/01/2020 | Extra payment |
    And user verifies that "The payment was successfully submitted." message is displayed on screen

  Scenario: Without amonut
    Then user adds payment information :
      | Payee  | Account | Amount | Date       | Description    |
      | Sprint | Savings |      | 01/01/2020 | Extra payment |
    And user verifies that validation message is displayed

  Scenario:Without date
    When user navigates to "Pay Bills"
    Then user adds payment information :
      | Payee  | Account | Amount | Date       | Description    |
      | Sprint | Savings | 30     |  | Extra payment |
    And user verifies that validation message is displayed without date

