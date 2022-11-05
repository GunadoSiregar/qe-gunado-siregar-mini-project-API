@Rating
Feature: Get Index Feature
	I want to use this template for my feature file

  @Index.G1
  Scenario Outline: User want to see products rating using valid HTTP Method request
    Given User Set method to GET G1
    When User Set URL https://alta-shop.herokuapp.com/api/products/13/ratings G1
    And User click button Test Request G1
    Then Show the verify result 200 OK G1
    
  @Index.G2
  Scenario Outline: User want to see products rating using invalid HTTP Method request
    Given User Set method to POST G2
    When User Set URL https://alta-shop.herokuapp.com/api/products/13/ratings G2
    And User click button Test Request G2
    Then Show the verify result 405 Method not Allowed G2