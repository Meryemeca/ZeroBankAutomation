Feature: Login
  As a authorized	users	should	be	able	to	login to the application.



  Scenario: Authorized User is able to login with valid credentials
    Given user is on the login page
    Then User can login with username "username" and password "password"
    Then user can click on login button
    And user verifies that "Zero - Account Summary" page title displayed.


  Scenario: Verify that warning message is displayed when username is not correct
    Given user is on the login page
    Then  Then User can login with username "wrong_user" and password "password"
    Then user can click on login button
    And user verifies that "Invalid user name or password." message is displayed



  Scenario: Verify that warning message is displayed when password is not correct
    Given user is on the login page
    Then user enters "username" username and "Wrongpassword" password
    Then user can click on login button
    And user verifies that "Invalid user name or password." message is displayed



  Scenario: Verify that warning message is displayed when blank username
    Given user is on the login page
    Then user enters "" username and "password" password
    Then user can click on login button
    And user verifies that "Invalid user name or password." message is displayed

  Scenario: Verify that warning message is displayed when blank password
    Given user is on the login page
    Then user enters "username" username and "" password
    Then user can click on login button
    And user verifies that "Invalid user name or password." message is displayed

