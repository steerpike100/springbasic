Feature: Login Feature

#  Scenario: Login with correct username and password
#    Given I click login in Home Page
#    And I enter the following for login
#      | username | password |
#      | admin   | password |


  Scenario: Login with correct username and password2
    Given I click in Home Page
    And I click login in Home Page
    And I enter the following for login
      | username | password  |
      | admin    | password |
    And I click login button
    Then I should see the userform page