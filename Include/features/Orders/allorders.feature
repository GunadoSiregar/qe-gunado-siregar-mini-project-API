@AllOrders
Feature: All Orders Feature
	I want to use this template for my feature file

  @AllOrders.S1
  Scenario Outline: User want to see all orders using valid HTTP Method request
    Given User Set method to GET S1
    When User Set URL https://alta-shop.herokuapp.com/api/orders S1
    And User click button Test Request S1
    Then Show the verify result 200 OK S1
    
  @AllOrders.A2
  Scenario Outline: User want to see all orders using invalid HTTP Method request
    Given User Set method to GET S2
    When User Set URL https://alta-shop.herokuapp.com/api/orders S2
    And User click button Test Request S2
    Then Show the verify result 405 Method not Allowed S2