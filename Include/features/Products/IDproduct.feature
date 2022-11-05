@IDproduct
Feature: Get Product By ID Feature
	I want to use this template for my feature file

  @IDproduct.T1
  Scenario Outline: User want to see product by ID using valid HTTP Method request
    Given User Set method to GET T1
    When User Set URL https://alta-shop.herokuapp.com/api/products/13 T1
    And User click button Test Request T1
    Then Show the verify result 200 OK T1
    
  @IDproduct.T2
  Scenario Outline: User want to see product by ID using invalid HTTP Method request
    Given User Set method to POST T2
    When User Set URL https://alta-shop.herokuapp.com/api/products/13 T2
    And User click button Test Request T2
    Then Show the verify result 405 Method not Allowed T2