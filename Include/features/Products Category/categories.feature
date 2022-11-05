@Categories
Feature: categories Feature
	I want to use this template for my feature file

  @Categories.F1
  Scenario Outline: User want see all categories using valid HTTP Method request
    Given User Set method to GET F1
    When User Set URL https://alta-shop.herokuapp.com/api/categories F1
    And User click button Test Request F1
    Then Show the verify result 200 OK F1
    
  @Categories.F2
  Scenario Outline: User want see all categories using invalid HTTP Method request
    Given User Set method to POST F2
    When User Set URL https://alta-shop.herokuapp.com/api/categories F2
    And User click button Test Request F2
    Then Show the verify result 405 Method not Allowed F2