Feature: Hooks Test

@HookSample
Scenario: Hooks Test Scenario
	Given User is on Contact page
	When User fills the contact details
	Then Contact is created
	
@HookSample
Scenario: Sample Hooks Test Scenario
	Given User is on deals page 
	
	