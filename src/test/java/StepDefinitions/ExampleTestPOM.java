package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleTestPOM {

	WebDriver driver = null;
	LogInPage login;

	
	@Given("user Browser is open")
	public void user_Browser_is_open() throws InterruptedException {
		System.out.println("Browser is open");
		System.out.println("I am exited to see the POM pattern");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sainath.dabhade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@And("User is on the log in page")
	public void user_is_on_the_log_in_page() throws InterruptedException {
		System.out.println("User is on the log in page");
		driver.get("https://example.testproject.io/web/");
		
	}

	@When("^User enter (.*) and (.*)$")
	public void user_enter_the_valid_credetials(String useranme, String password) throws InterruptedException {
		System.out.println("User enter the valid credentials");
		login = new LogInPage(driver);
		login.enterusername(useranme);
		Thread.sleep(5000);
		login.enterpassword(password);
		Thread.sleep(5000);
	}

	@And("User click on the Log in button")
	public void user_click_on_the_log_in_button() {
		System.out.println("User click on the log in button");
		login.clickLogInButton();
	
	}

	@Then("User navigate to the Home page")
	public void user_navigate_to_the_home_page() {
		System.out.println("User navigate to the home page");
		//driver.getPageSource().contains("Logout");
		login.clickOnLogOutisdisplay();
		
	}

}
