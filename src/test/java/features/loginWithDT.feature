Feature: Free CRM Login feature

Scenario: Free CRM Login test Scenaio
	Given User is already on login page
	When Title of login page is Free CRM
	Then User enters credential
		| username | password |
		| anandhi_k | crmpro@123 |
	Then User clicks login button
	Then User is on Home Page
	Then Close the browser
	

	
	
	
	