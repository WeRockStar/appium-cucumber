Feature: Login
  Scenario: Member login with e-mail successful
    Given I am on "Login" page
    When  I fill in username with "root"
    And   I fill in password with "root"
    And   I press "LOGIN" button
    Then  I should see message "Welcome"