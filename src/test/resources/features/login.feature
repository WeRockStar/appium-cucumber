Feature: Login
  Scenario: Member login with e-mail successful
    Given I am on "Login" page
    When  I fill in username with "user"
    And   I fill in password with "password"
    And   I press "LOGIN" button
    Then  I should be on Member page