@Delete
Feature: Delete Feature
	I want to use this template for my feature file

  @Delete.E1
  Scenario Outline: User want to delete a product using valid HTTP Method request
    Given User Set method to DELETE E1
    When User Set URL https://alta-shop.herokuapp.com/api/products/1 E1
    And User click button Test Request E1
    Then Show the verify result 200 OK E1
    
  @Delete.E2
  Scenario Outline: User want to delete a product using invalid HTTP Method request
    Given User Set method to DELETE E2
    When User Set URL https://alta-shop.herokuapp.com/api/products/1 E2
    And User click button Test Request E2
    Then Show the verify result 405 Method not Allowed E2