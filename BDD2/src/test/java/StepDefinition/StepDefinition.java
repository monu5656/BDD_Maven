package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	//String path = "E:\\Gecofriver for BDD Firefox\\";
	WebDriver driver;
	String title;
	@Given("^login Application should be available$")
	public void login_Application_should_be_available() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver", "E:\\Gecofriver for BDD Firefox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com/");
		String Title=driver.getTitle();
	}

	@When("^Validate Login Application$")
	public void validate_Login_Application() {
	    // Write code here that turns the phrase above into concrete actions
		//title = driver.getTitle();
		System.out.println("Title");
		
	    //throw new PendingException();
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("successful");
		
	}
}
