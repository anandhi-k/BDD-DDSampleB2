Feature: Free CRM Create Deals

Scenario: Free CRM Create New Deals Scenaio

	Given User is already on Login Page
	When Title of login page is Free CRM
	Then User enters credential
		| username | password |
		| anandhi_k | crmpro@123 |
	Then User clicks login button
	Then User is on Home Page
	Then User moves to New Deal Page
	Then User enters deal details
		| title | amount | probability | commission |
		| test deals11 | 3000 | 40 | 15 |
		| test deals12 | 4000 | 30 | 10 |
		| test deals13 | 6000 | 25 | 20 |
	Then Close the browser