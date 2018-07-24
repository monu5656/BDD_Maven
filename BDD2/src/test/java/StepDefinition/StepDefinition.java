package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	String title;
	@Given("^login Application should be available$")
	public void login_Application_should_be_available() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	   // throw new PendingException();
	}

	@When("^Validate Login Application$")
	public void validate_Login_Application() {
	    // Write code here that turns the phrase above into concrete actions
		title = driver.getTitle();
		System.out.println(title);
	    //throw new PendingException();
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("OrangeHRM", title);
	    //throw new PendingException();
	}
}
