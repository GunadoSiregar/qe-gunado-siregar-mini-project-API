@Login
Feature: Login Feature
	I want to use this template for my feature file

  @login.L1
  Scenario Outline: User login with valid input
    Given User Set method to POST L1
    When User Set URL https://alta-shop.herokuapp.com/api/auth/login L1
    And User input HTTP Body L1
    And User click button Test Request L1
    Then Show the verify result 200 OK L1

	@login.L2
  Scenario Outline: User login by blank Email field
    Given User Set method to POST L2
    When User Set URL https://alta-shop.herokuapp.com/api/auth/login L2
    And User input HTTP Body L2
    And User click button Test Request L2
    Then Show the verify result 400 Bad Request L2
    
	@login.L3
  Scenario Outline: User login by blank Password field
    Given User Set method to POST L3
    When User Set URL https://alta-shop.herokuapp.com/api/auth/login L3
    And User input HTTP Body L3
    And User click button Test Request L3
    Then Show the verify result 400 Bad Request L3

	@login.L4
  Scenario Outline: User login by blank Email and Password field
    Given User Set method to POST L4
    When User Set URL https://alta-shop.herokuapp.com/api/auth/login L4
    And User input HTTP Body L4
    And User click button Test Request L4
    Then Show the verify result 400 Bad Request L4
    
	@login.L5
  Scenario Outline: User login using invalid Email
    Given User Set method to POST L5
    When User Set URL https://alta-shop.herokuapp.com/api/auth/login L5
    And User input HTTP Body L5
    And User click button Test Request L5
    Then Show the verify result 400 Bad Request L5
    
	@login.L6
  Scenario Outline: User login using invalid Password
    Given User Set method to POST L6
    When User Set URL https://alta-shop.herokuapp.com/api/auth/login L6
    And User input HTTP Body L6
    And User click button Test Request L6
    Then Show the verify result 400 Bad Request L6
    
	@login.L7
  Scenario Outline: User login using invalid Email and invalid Password
    Given User Set method to POST L7
    When User Set URL https://alta-shop.herokuapp.com/api/auth/login L7
    And User input HTTP Body L7
    And User click button Test Request L7
    Then Show the verify result 400 Bad Request L7
    
	@login.L8
  Scenario Outline: User login using unregistered Email
    Given User Set method to	POST L8
    When User Set URL https://alta-shop.herokuapp.com/api/auth/login L8
    And User input HTTP Body L8
    And User click button Test Request L8
    Then Show the verify result 400 Bad Request L8
    
	@login.L9
  Scenario Outline: User login using invalid request method
    Given User Set method to POST L9
    When User Set URL https://alta-shop.herokuapp.com/api/auth/login L9
    And User input HTTP Body L9
    And User click button Test Request L9
    Then Show the verify result 405 Method not Allowed L9