package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInSteps {
	@Given("^user is on the log in page$")
	public void user_is_on_the_log_in_page() {
	    System.out.println("User is on the log in page");
	}

	@When("user enter the username and passwords")
	public void user_enter_the_username_and_passwords() {
	    System.out.println("User enter the username and passwords ");	}

	@And("clicks on the log in button")
	public void clicks_on_the_log_in_button() {
		System.out.println("User click on the login button");
	}

	@Then("user navigate to the home page")
	public void user_navigate_to_the_home_page() {
	    System.out.println("User should navigate on the home page");
	}

}
