@CreateProduct
Feature: Create Product Feature
	I want to use this template for my feature file

  @CreateProduct.P1
  Scenario Outline: User want to create new products using valid HTTP Method request
    Given User Set method to POST P1
    When User Set URL https://alta-shop.herokuapp.com/api/products P1
    And User input HTTP Body P1
    And User click button Test Request P1
    Then Show the verify result 200 OK P1
    
  @CreateProduct.P2
  Scenario Outline: User want to create new products without data usage
    Given User Set method to POST P2
    When User Set URL https://alta-shop.herokuapp.com/api/products P2
    And User input HTTP Body P2
    And User click button Test Request P2
    Then Show the verify result 400 Bad Request P2
    
  @CreateProduct.P3
  Scenario Outline: User want to create new products using invalid HTTP Method request
    Given User Set method to GET P3
    When User Set URL https://alta-shop.herokuapp.com/api/products P3
    And User input HTTP Body P3
    And User click button Test Request P3
    Then Show the verify result 405 Method not Allowed P3