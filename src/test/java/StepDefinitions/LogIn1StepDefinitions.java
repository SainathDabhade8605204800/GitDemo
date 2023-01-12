package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogIn1StepDefinitions {

	@Given("User is on the netbanking landing page")
	public void user_is_on_the_netbanking_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is on the netbanking landing page");
	}

	@When("User log in into the application with username and passwords.")
	public void user_log_in_into_the_application_with_username_and_passwords() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User log in into the application with username and passwords.");
	}

	@Then("Home page displays")
	public void home_page_displays() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Home page displays");
	}

	@And("Cards are display")
	public void cards_are_display() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are display");
	}

}
