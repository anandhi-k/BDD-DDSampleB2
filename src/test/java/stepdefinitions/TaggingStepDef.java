package stepdefinitions;

import cucumber.api.java.en.Given;

public class TaggingStepDef {
	@Given("^Valid Login Test$")
	public void valid_Login_Test() throws Throwable {
	    System.out.println("Valid Login Test");
	}

	@Given("^Invalide Login Test$")
	public void invalide_Login_Test() throws Throwable {
	    System.out.println("Invalid Login test");
	}

	@Given("^Create a contact test case$")
	public void create_a_contact_test_case() throws Throwable {
	    System.out.println("Create a contact test case");
	}

	@Given("^Create a new deal$")
	public void create_a_new_deal() throws Throwable {
		System.out.println("Create a new deal");
	}

	@Given("^Create a new task$")
	public void create_a_new_task() throws Throwable {
		System.out.println("Create a new task");
	}

	@Given("^User is on Main Page$")
	public void user_is_on_Main_Page() throws Throwable {
		System.out.println("User is on Main Page");
		 }
}
