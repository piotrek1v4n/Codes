Feature: Authentication to e-shop

  Background:
    Given Homepage is opened

  Scenario: Authentication - positive flow
    And User "test@test.pl" is registered
    When I click Sign in link in top right menu
    And I provide login "test@test.pl"
    And I provide password "123qwerty"
    And I click green sign in button
    Then I see page for authenticated user

#  Scenario: Empty login and password form - negative flow
#    When I click Sign in link in top right menu
#    And I click green sign in button
#    Then I see error message "An email address is required"
#
#  Scenario: Invalid email address - negative flow
#    When I click Sign in link in top right menu
#    And I provide login "tes123"
#    And I click green sign in button
#    Then I see error message "Invalid email address"
#
#  Scenario: Empty password - negative flow
#    When I click Sign in link in top right menu
#    And I provide login "tes@gmail.com"
#    And I click green sign in button
#    Then I see error message "Password is required."
#
#  Scenario: User not registered - negative flow
#    When I click Sign in link in top right menu
#    And I provide login "tes@gmail.com"
#    And I provide password "jakistam"
#    And I click green sign in button
#    Then I see error message "Authentication failed."

#  Wszystko to co na górze odpalamy tym na dole
    Scenario Outline: Authentication - negative flow
      When I click Sign in link in top right menu
      And I provide login "<emailAddress>"
      And I provide password "<password>"
      And I click green sign in button
      Then I see error message "<errorMessage>"
      Examples:
      | emailAddress | password | errorMessage               |
      |              |          |An email address is required|
      |tes123        |          |Invalid email address       |
      |tes@gmail.com |          |Password is required.       |
      |tes@gmail.com |jakistam  |Authentication failed.      |