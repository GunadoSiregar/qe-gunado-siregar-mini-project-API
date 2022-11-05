@info
Feature: Info Feature
	I want to use this template for my feature file

  @info.I1
  Scenario Outline: GET user Info with valid HTTP Method and valid API URL
    Given User Set method to GET I1
    When User Set URL https://alta-shop.herokuapp.com/api/auth/info I1
    And User click button test Request I1
    Then Show the verify result 200 OK I1

  @Info.I2
  Scenario Outline: GET user info with valid HTTP Method and invalid API URL
    Given User Set method to GET I2
    When User Set URL https://alta-shop.herokuapp.com/api/auth/inf I2
    And User click button test Request I2
    Then Show the verify result 400 not found I2