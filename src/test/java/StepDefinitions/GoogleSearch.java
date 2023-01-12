package StepDefinitions;

import java.awt.TextField;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {

	WebDriver driver = null;
	
	@Given("Browser is open")
	public void browser_is_open() throws InterruptedException {
		System.out.println("Browser is open");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sainath.dabhade\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.manage().window().maximize();

	}

	@And("User is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("User is on the google search page");
		driver.get("https://www.google.com/");
	}

	@When("User enter the text in the search box")
	public void user_enter_the_text_in_the_search_box() throws InterruptedException {
		System.out.println("User enter the text in the text box");
		driver.findElement(By.xpath("//div/input[@class = 'gLFyf gsfi']")).sendKeys("Automation step by step");
		Thread.sleep(4000);
	}

	@And("Hits the enter button")
	public void hits_the_enter_button() throws InterruptedException {
		System.out.println("Hits the enter button");
		driver.findElement(By.xpath("//div/input[@class = 'gLFyf gsfi']")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
	}

	@Then("User is navigated to the search results page")
	public void user_is_navigated_to_the_search_results_page() {
		System.out.println("User navgate to the search results page");
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}

}
