@BackgroundTag
Feature: CRM Background sample
The purpose of this feature is to test the background keyword

Background: User is logged in
Given User is already on Login Page
	When Title of login page is Free CRM
	Then User enters credential
		| username | password |
		| anandhi_k | crmpro@123 |
	Then User clicks login button
	Then User is on Home Page

Scenario: Create a deal 
	Then User moves to New Deal Page
	Then User enters deal details
		| title | amount | probability | commission |
		| test deals31 | 3000 | 40 | 15 |

Scenario: Create a Contact
	Then User moves to New Contact Page
	Then User enters contact details
		| firstname | surname |
		| Tom | Peter |
	