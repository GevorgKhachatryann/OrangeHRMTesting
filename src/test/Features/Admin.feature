@test
@add
Feature:Check Admin page functionality (add,delete,search)

  Background: User is Logged In
    Given Login page is opened and URL should contain "orangehrmlive"
    And   I type "Admin" as username
    And   I type "admin123" as password
    When  I click on Login button
    Then  URL should contain "dashboard"
    And   I click on Admin button


 Scenario: check Add and delete user functionality
   Given  Admin page is opened and URL should contain "viewSystemUsers"
   And   I click on checkbox
   And   I click on delete button
   And   I click on OK button
   And   I click on Add button
   And   I select User Role
   And   I type "Charlie Carter" as employee name
   And   I  select employee name
   And   I type  "AaaaaaaaaNS" as new username
   And   I select status
   And   I type "orange1234" as new password
   And   I type "orange1234" as confirm password
   And   I click Save button
   Then  Admin page is opened and URL should contain "orangehrmlive"
   And   assert that username is "AaaaaaaaaNS"
   And   assert that user role is displayed

  Scenario: check search user functionality
   Given  Admin page is opened and URL should contain "viewSystemUsers"
    And I type "Admin" as username for search
    And I select User Role for search
    And I type "PaulMark Collings" as employee name for search
    And I select status for search
    And I click on Search Btn
    Then assert the username "Admin"

  Scenario: check Reset Button functionality
    Given  Admin page is opened and URL should contain "viewSystemUsers"
    And I type "Admin" as username for search
    And I select User Role for search
    And I type "PaulMark Collings" as employee name for search
    And I select status for search
    And I click on Reset Button
    Then assert that username box is empty

    Scenario: check search button functionality with  invalid data
      Given  Admin page is opened and URL should contain "viewSystemUsers"
      And I type "Adminkdfg" as username for search
      And I select User Role for search
      And I type "Pau" as employee name for search
      And I select status for search
      And I click on Search Btn
      Then assert that no records found

