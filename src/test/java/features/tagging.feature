@FunctionalTest
Feature: Free CRM application testing

@RegressionTest @SmokeTest
Scenario: Login with valid credential
Given Valid Login Test

@SmokeTest
Scenario: Login with invalid credential
Given Invalide Login Test


Scenario: Create a contact
Given Create a contact test case

@RegressionTest
Scenario Outline: Create a Deal
Given Create a <sample> deal
	
Examples: 
	| sample |
	| testdeal1 |
	| testdeal2 |
	| testdeal3 |
@SmokeTest
Scenario: Create a task
Given Create a new task

@SmokeTest @RegressionTest
Scenario: Application Logout
Given User is on Main Page