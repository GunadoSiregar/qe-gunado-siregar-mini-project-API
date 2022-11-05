@OrderID
Feature: Order By ID Feature
	I want to use this template for my feature file

  @OrderID.O1
  Scenario Outline: User want to see order by ID using valid HTTP Method request
    Given User Set method to GET O1
    When User Set URL https://alta-shop.herokuapp.com/api/orders/1 O1
    And User click button Test Request O1
    Then Show the verify result 200 OK O1
    
  @OrderID.O2
  Scenario Outline: User want to see order by ID using invalid HTTP Method request
    Given User Set method to POST O1
    When User Set URL https://alta-shop.herokuapp.com/api/orders/1 O1
    And User click button Test Request O1
    Then Show the verify result 405 Method not Allowed O1