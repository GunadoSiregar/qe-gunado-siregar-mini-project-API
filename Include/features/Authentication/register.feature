@Register
Feature: register Feature
	I want to use this template for my feature file

  @register.R1
  Scenario Outline: User register a new account with valid all input
    Given User Set method to POST R1
    When User Set URL https://alta-shop.herokuapp.com/api/auth/register R1
    And User input HTTP Body R1
    And User click button Test Request R1
    Then Show the verify result 200 OK R1
    
  @register.R2
  Scenario Outline: User register a new account by blank the Nama lengkap field
    Given User Set method to POST R2
    When User Set URL https://alta-shop.herokuapp.com/api/auth/register R2
    And User input HTTP Body R2
    And User click button Test Request R2
    Then Show the verify result 400 Bad Request R2
    
  @register.R3
  Scenario Outline: User register a new account by blank the Email field
    Given User Set method to POST R3
    When User Set URL https://alta-shop.herokuapp.com/api/auth/register R3
    And User input HTTP Body R3
    And User click button Test Request R3
    Then Show the verify result 400 Bad Request R3
    
  @register.R4
  Scenario Outline: User register a new account by blank the Password field
    Given User Set method to POST R4
    When User Set URL https://alta-shop.herokuapp.com/api/auth/register R4
    And User input HTTP Body R4
    And User click button Test Request R4
    Then Show the verify result 400 Bad Request R4
    
  @register.R5
  Scenario Outline: User register a new account by blank Nama Lengkap and Email field
    Given User Set method to POST R5
    When User Set URL https://alta-shop.herokuapp.com/api/auth/register R5
    And User input HTTP Body R5
    And User click button Test Request R5
    Then Show the verify result 400 Bad Request R5
    
  @register.R6
  Scenario Outline: User register a new account by blank Nama Lengkap and Password field
    Given User Set method to POST R6
    When User Set URL https://alta-shop.herokuapp.com/api/auth/register R6
    And User input HTTP Body R6
    And User click button Test Request R6
    Then Show the verify result 400 Bad Request R6
    
  @register.R7
  Scenario Outline: User register a new account by blank Email and Password field
    Given User Set method to POST R7
    When User Set URL https://alta-shop.herokuapp.com/api/auth/register R7
    And User input HTTP Body R7
    And User click button Test Request R7
    Then Show the verify result 400 Bad Request R7
    
  @register.R8
  Scenario Outline: User register a new account with invalid Nama Lengkap
    Given User Set method to POST R8
    When User Set URL https://alta-shop.herokuapp.com/api/auth/register R8
    And User input HTTP Body R8
    And User click button Test Request R8
    Then Show the verify result 400 Bad Request R8
    
  @register.R9
  Scenario Outline: User register a new account with invalid Email
    Given User Set method to POST R9
    When User Set URL https://alta-shop.herokuapp.com/api/auth/register R9
    And User input HTTP Body R9
    And User click button Test Request R9
    Then Show the verify result 400 Bad Request R9
    
  @register.R10
  Scenario Outline: User register a new account with invalid Password
    Given User Set method to POST R10
    When User Set URL https://alta-shop.herokuapp.com/api/auth/register R10
    And User input HTTP Body R10
    And User click button Test Request R10
    Then Show the verify result 400 Bad Request R10
    
  @register.R11
  Scenario Outline: User register a new account with invalid Nama lengkap and invalid Email
    Given User Set method to POST R11
    When User Set URL https://alta-shop.herokuapp.com/api/auth/register R11
    And User input HTTP Body R11
    And User click button Test Request R11
    Then Show the verify result 400 Bad Request R11
    
  @register.R12
  Scenario Outline: User register a new account with invalid Nama lengkap and invalid Password
    Given User Set method to POST R12
    When User Set URL https://alta-shop.herokuapp.com/api/auth/register R12
    And User input HTTP Body R12
    And User click button Test Request R12
    Then Show the verify result 400 Bad Request R12
    
  @register.R13
  Scenario Outline: User register a new account with invalid Email and invalid password
    Given User Set method to POST R13
    When User Set URL https://alta-shop.herokuapp.com/api/auth/register R13
    And User input HTTP Body R13
    And User click button Test Request R13
    Then Show the verify result 400 Bad Request R13
    
  @register.R14
  Scenario Outline: User register a new account using Email that already registered
    Given User Set method to POST R14
    When User Set URL https://alta-shop.herokuapp.com/api/auth/register R14
    And User input HTTP Body R14
    And User click button Test Request R14
    Then Show the verify result 400 Bad Request R14
    
  @register.R15
  Scenario Outline: User register a new account using invalid request method
    Given User Set method to GET R15
    When User Set URL https://alta-shop.herokuapp.com/api/auth/register R15
    And User input HTTP Body R15
    And User click button Test Request R15
    Then Show the verify result 405 Method not Allowed R15