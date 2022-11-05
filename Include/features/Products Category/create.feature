@CreateCategory
Feature: Create Product Category Feature
	I want to use this template for my feature file

  @CreateCategory.C1
  Scenario Outline: User want create a new product category using valid HTTP Method request
    Given User Set method to POST C1
    When User Set URL https://alta-shop.herokuapp.com/api/categories C1
    And User input HTTP Body C1
    And User click button Test Request C1
    Then Show the verify result 200 OK C1
    
  @CreateCategory.C2
  Scenario Outline: User want create a new product category using invalid HTTP Method request
    Given User Set method to GET C2
    When User Set URL https://alta-shop.herokuapp.com/api/categories C2
    And User input HTTP Body C2
    And User click button Test Request C2
    Then Show the verify result 405 Method not Allowed C2