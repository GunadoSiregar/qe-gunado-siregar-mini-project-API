@Assign
Feature: Assign Feature
	I want to use this template for my feature file

  @Assign.A1
  Scenario Outline: User want to assing a product rating using valid HTTP Method request
    Given User Set method to POST A1
    When User Set URL https://alta-shop.herokuapp.com/api/products/13/ratings A1
    And User input HTTP Body A1
    And User click button Test Request A1
    Then Show the verify result 200 OK A1
    
  @Assign.A2
  Scenario Outline: User want to assing a product rating using invalid HTTP Method request
    Given User Set method to POST A2
    When User Set URL https://alta-shop.herokuapp.com/api/products/13/ratings A2
    And User input HTTP Body A2
    And User click button Test Request A2
    Then Show the verify result 405 Method not Allowed A2