Feature: Free CRM Login feature

Scenario Outline: Free CRM Login test Scenaio
	Given User is already on login page
	When Title of login page is Free CRM
	Then User enters "<username>" and "<password>"
	Then User clicks login button
	Then User is on Home Page
	Then Close the browser
	
Examples:
	| username | password |
	| anandhi_k | crmpro@123 |
	| tom	| test456 |
	
	
	
	