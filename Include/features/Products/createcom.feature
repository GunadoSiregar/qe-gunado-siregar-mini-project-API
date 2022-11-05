@CreateCom
Feature: Create Comment Feature
	I want to use this template for my feature file

  @CreateCom.B1
  Scenario Outline: User want to create a comment for product using valid HTTP Method request
    Given User Set method to POST B1
    When User Set URL https://alta-shop.herokuapp.com/api/products/13/comments B1
    And User input HTTP Body B1
    And User click button Test Request B1
    Then Show the verify result B200 OK B1
    
  @CreateCom.EB2
  Scenario Outline: User want to create a comment for product using invalid HTTP Method request
    Given User Set method to GET EB2
    When User Set URL https://alta-shop.herokuapp.com/api/products/13/comments EB2
    And User input HTTP Body EB2
    And User click button Test Request EB2
    Then Show the verify result 405 Method not Allowed EB2