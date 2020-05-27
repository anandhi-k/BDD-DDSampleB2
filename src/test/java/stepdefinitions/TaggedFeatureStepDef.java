package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedFeatureStepDef {

	@Before("@First")
	public void setupFirst() {
		System.out.println("Before setup First");
	}
	@Before("@Second")
	public void setupSecond() {
		System.out.println("Before setup Second");
	}
	
	@Given("^This is the first step$")
	public void this_is_the_first_step() throws Throwable {
		System.out.println("First step");
	}

	@When("^This is the second step$")
	public void this_is_the_second_step() throws Throwable {
		System.out.println("Second step");
	}

	@Then("^This is the Third step$")
	public void this_is_the_Third_step() throws Throwable {
		System.out.println("Third step");
	}
	@After("@First")
	public void teardownFirst() {
		System.out.println("After First");
	}
	@After("@Second")
	public void teardownSecond() {
		System.out.println("After Second");
	}
}
