@Index
Feature: index Feature
	I want to use this template for my feature file

  @Index.X1
  Scenario Outline: User want to see index using valid HTTP Method request
    Given User Set method to GET X1
    When User Set URL https://alta-shop.herokuapp.com/api/hello X1
    And User click button Test Request X1
    Then Show the verify result 200 OK X1
    
  @Index.X2
  Scenario Outline: User want to see index using invalid HTTP Method request
    Given User Set method to POST X2
    When User Set URL https://alta-shop.herokuapp.com/api/hello X2
    And User click button Test Request X2
    Then Show the verify result 405 Method not Allowed X2