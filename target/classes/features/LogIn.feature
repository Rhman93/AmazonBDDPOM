#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Functonality
  Register User should be able to login with valid credentials

  @tag1
  Scenario: Valied Login Functionality
  
    Given User should be in the homepage
    When user should click on Hello Sign in Account & Lists
    Then User should see a Box name Email or Phone Number 
    And A button name Continue
    When User should put Valied Email Address or Phone number
    And User should click on Countinue buttton
    Then User should see a Box name password
    And A button name Sign-In
   When User should put Valied password
    And User should click on Sign-In buttton
    Then User should see User  is login in the Account
    
    Scenario: Invalied Login Functionality
    
    Given User should be in the homepage
    When user should click on Hello Sign in Account & Lists
    Then User should see a Box name Email or Phone Number 
    And A button name Continue
    When User should put Valied Email Address or Phone number
    And User should click on Countinue buttton
    Then User should see a Box name password
    And A button name Sign-In
   When User should put InValied password
    And User should click on Sign-In buttton
    Then User shouldnot loged in the Account
    

 