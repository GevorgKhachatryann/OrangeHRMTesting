@test
@login
Feature: As a user, I want to be able to login into app

  Scenario: Login with valid credentials
    Given Login page is opened and URL should contain "orangehrmlive"
    And   I type "Admin" as username
    And   I type "admin123" as password
    When  I click on Login button
    Then  URL should contain "dashboard"

  Scenario: Login with invalid credentials
    Given Login page is opened and URL should contain "orangehrmlive"
    And   I type "Admin1" as username
    And   I type "admin12" as password
    When  I click on Login button
    Then  URL should not contain "dashboard"
