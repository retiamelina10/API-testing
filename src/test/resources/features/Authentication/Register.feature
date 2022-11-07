@Register
Feature: Register
  As a user
  I want to Register
  So I can login

  Scenario Outline: Register
    Given I set url register
    And I set body data name "<full name>" email "<email>" and password "<password>"
    When I request to register
    Then  I can validate the response "<response>"
    And I get status code <code>
    Examples:
      |email                  |password   |full name      |response|code|
      |retiamelina094@gmail.com|Retiaah10 |Retia Melina   |body data|200|
      |retiamelina10@gmail.com|Retiaah10  |              |error: full name is required|400|
      |retiamelina10@gmail.com|           |Retia Melina  |error: password is required|400 |
      |                       |Retiaah10  |Retia Melina  |error: email is required   |400 |
      |                       |           |Retia Melina  |error: email is required   |400 |
      |                       |Retiaah10  |              |error: email is required   |400 |
      |retiamelina10@gmail.com|           |              |error: password is required|400 |
      |                       |           |              |error: email is required   |400 |



