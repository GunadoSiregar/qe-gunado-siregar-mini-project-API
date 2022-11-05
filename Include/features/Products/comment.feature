@Comment
Feature: Get Product Comment Feature
	I want to use this template for my feature file

  @Comment.M1
  Scenario Outline: User want to see product comment using valid HTTP Method request
    Given User Set method to GET M1
    When User Set URL https://alta-shop.herokuapp.com/api/products/13/ratings M1
    And User click button Test Request M1
    Then Show the verify result 200 OK M1
    
  @Comment.M2
  Scenario Outline: User want to see product comment using invalid HTTP Method request
    Given User Set method to POST M2
    When User Set URL https://alta-shop.herokuapp.com/api/products/13/ratings M2
    And User click button Test Request M2
    Then Show the verify result 405 Method not Allowed M2