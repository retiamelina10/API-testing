Feature: Delete product
  As a user
  I want to delete product
  So I can manage my products

  Scenario: delete product
    Given I set url delete product
    When I request delete product
    Then I get status code 400