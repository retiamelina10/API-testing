Feature: Login
  As a user
  I want to login
  So I can manage my account

  Scenario: login with valid account
    Given I set url login
    And I set valid body data account
    When I request to login with valid account
    Then I get status code 200

  Scenario Outline: Login with invalid account
    Given I set url login for invalid account
    And I set "<email>", and "<password>"
    When I request to login with invalid body
    Then I get status code 400
    Examples:
      |email                  |password   |
      |retiamelina10@upi.edu  |Retiaaah10 |
      |retiamelina10@gmail.com|Retiaaah10 |
      |retiamelina10@upi.com  |Retiaah10  |
      |                       |Retiaah10  |
      |retiamelina10@gmail.com|           |
      |                       |           |