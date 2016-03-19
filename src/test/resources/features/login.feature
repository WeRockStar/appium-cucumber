Feature: Login
  Scenario: Member login with e-mail successful
    Given I am on "Login" page
    When  I fill in "editText" with ""
    And   I fill in "editText" with ""
    And   I press "submit" button
    Then  I should be on "MemberActivity" page