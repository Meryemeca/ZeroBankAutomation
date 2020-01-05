
@deneme
Feature: messga

  Scenario: Authorized User is able to login with valid credentials
    Given user is on the login page
    Then User can login with username "username" and password "password"
    Then user can click on login button
    And user verifies that "Zero - Account Summary" page title displayed.