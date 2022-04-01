@test
@Pim
Feature:Check PIM page functionality (search,reset)

  Background: User is Logged In
    Given Login page is opened and URL should contain "orangehrmlive"
    And   I type "Admin" as username
    And   I type "admin123" as password
    When  I click on Login button
    Then  URL should contain "dashboard"
    And I click on PIM button


  Scenario: check search user functionality with invalid data
    Given  Pim page is opened and URL should contain "viewEmployeeList"
    And I type "Garry White"  as new employee name
    And I type "0099"  as ID
    And I select Employment status
    And I select Current Employees only
    And I type "Shinchan S Shin" as Supervisor name
    And I select Job Title
    And I click on Sub Unit Btn
    And I click on search button
    Then assert that all of the boxes are empty

  Scenario: check Reset button functionality
    Given  Pim page is opened and URL should contain "viewEmployeeList"
    And I type "Garry White"  as new employee name
    And I type "0099"  as ID
    And I select Employment status
    And I select Current Employees only
    And I type "Shinchan S Shin" as Supervisor name
    And I select Job Title
    And I click on Sub Unit Btn
    And I click on Reset Btn
    Then assert that employee name box is empty

    Scenario: check search button functionality with  incomplete information
      Given  Pim page is opened and URL should contain "viewEmployeeList"
      And I type "0099"  as ID
      And I select Current Employees only
      And I click on Sub Unit Btn
      And I click on search button
      Then assert that all of the boxes are empty

