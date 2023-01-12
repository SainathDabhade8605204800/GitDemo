package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
	WebDriver driver;
	
	By txt_username = By.id("name");
	
	By txt_password = By.id("password");
	
	By btn_logIn = By.id("login");
	
	By btn_logout = By.id("logout");

	public LogInPage(WebDriver driver) {  
		this.driver = driver;	  // Creating the constructor 
	}
	
	public void enterusername( String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterpassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogInButton() {
		driver.findElement(btn_logIn).click();
	}
	
	public void clickOnLogOutisdisplay() {
		driver.findElement(btn_logout).isDisplayed();
	}
}
