@Products
Feature: Get all products Feature
	I want to use this template for my feature file

  @Products.U1
  Scenario Outline: User want to see all product using valid HTTP Method request
    Given User Set method to GET U1
    When User Set URL https://alta-shop.herokuapp.com/api/products U1
    And User click button Test Request U1
    Then Show the verify result 200 OK U1
    
  @Products.U2
  Scenario Outline: User want to see all product using invalid HTTP Method request
    Given User Set method to POST U2
    When User Set URL https://alta-shop.herokuapp.com/api/products U2
    And User click button Test Request U2
    Then Show the verify result 405 Method not Allowed U2