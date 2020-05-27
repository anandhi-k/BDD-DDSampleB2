package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HookStepDef {
	
	@Before(order=1)
	public void setup() {
		System.out.println("Created Driver");
	}
	@Before(order=2)
	public void setupDB() {
		System.out.println("Created DBConnection");
	}
	@Given("^User is on Contact page$")
	public void user_is_on_Contact_page() throws Throwable {
		System.out.println("User is on Contact page");
	}

	@When("^User fills the contact details$")
	public void user_fills_the_contact_details() throws Throwable {
		System.out.println("User fills the Contact details");
	}

	@Then("^Contact is created$")
	public void contact_is_created() throws Throwable {
	  System.out.println("Contact is created");
	 // Assert.assertFalse(true);
	}
	
	@Given("^User is on deals page$")
	public void user_is_on_deals_page() throws Throwable {
		System.out.println("user is on deals page");
	}

	

	@After(order=2)
	public void teardown() {
		System.out.println("Destroyed Driver");
	}
	@After(order=1)
	public void teardownDB() {
		System.out.println(" DBConnection");
	}
	

}
