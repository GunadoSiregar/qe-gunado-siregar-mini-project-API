@CategoryID
Feature: Category By ID Feature
	I want to use this template for my feature file

  @categoryID.Y1
  Scenario Outline: User want to see category by ID using valid HTTP Method request
    Given User Set method to GET Y1
    When User Set URL https://alta-shop.herokuapp.com/api/categories/2 Y1
    And User click button Test Request Y1
    Then Show the verify result 200 OK Y1
    
  @categoryID.Y2
  Scenario Outline: User want to see category by ID using invalid HTTP Method request
    Given User Set method to POST Y1
    When User Set URL https://alta-shop.herokuapp.com/api/categories/2 Y2
    And User click button Test Request Y2
    Then Show the verify result 405 Method not Allowed Y2