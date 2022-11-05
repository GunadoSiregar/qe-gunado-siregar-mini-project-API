@NewOrder
Feature: New Order Feature
	I want to use this template for my feature file

  @NewOrder.N1
  Scenario Outline: User want to create a new order using valid HTTP Method request
    Given User Set method to POST N1
    When User Set URL https://alta-shop.herokuapp.com/api/orders N1
    And User input HTTP Body N1
    And User click button Test Request N1
    Then Show the verify result 200 OK N1
    
  @NewOrder.N2
  Scenario Outline: User want to create a new order using invalid HTTP Method request
    Given User Set method to GET N2
    When User Set URL https://alta-shop.herokuapp.com/api/orders N2
    And User input HTTP Body N2
    And User click button Test Request N2
    Then Show the verify result 405 Method not Allowed N2