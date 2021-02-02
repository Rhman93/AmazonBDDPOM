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
Feature: Home Page Link Functionality
  User should able to click to the link of  Home page 

  @tag1
  Scenario: Home Page Link Functionality
  
    Given User is in the homepage
    When User should click to the SignIn link
    Then User should be in the SignIn Page
    When User should click to the Return&Order Link
    Then User should be in the Return&Order Page
    When User should click to the Cart link
    Then User should be in the Cart Page
    When User should click to the ALL Manu link
    Then User Should see all link of the page

 