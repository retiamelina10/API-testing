Feature: GET all product
  As a user
  I want to get all my product
  So I can manege my product

  Scenario: Get all product with valid token
    Given I set url get all product and valid token
    When I request get all product
    Then I get status code 200

  Scenario: Get all product with invalid token
    Given I set url get all product and invalid token
    When I request get all product
    Then  I get status code 200