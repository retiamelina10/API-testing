Feature: Get product by id
  As a user
  I want to get my product by id
  So I can get my product

  Scenario: Get product by valid id
    Given I set url get product and valid id
    When I request get product
    Then I get status code 400

  Scenario: Get product with invalid id
    Given I set url get product and invalid id
    When I request get product with invalid id
    Then I get status code 400

  Scenario: Get product with string id
    Given I set url get product and string id
    When I request get product with string id
    Then I get status code 400

  Scenario: Get product with char id
    Given I set url get product and char is
    When i request get product with char id
    Then I get status code 200

    Scenario: Get product with boolean id
      Given I set url get product and boolean id
      When I request get product with boolean id
      Then I get status code 400


