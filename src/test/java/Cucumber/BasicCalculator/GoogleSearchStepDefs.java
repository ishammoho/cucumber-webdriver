package Cucumber.BasicCalculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchStepDefs {

	public WebDriver browser;
	
	@Given("^Google is open in Firefox$")
	public void openGoogleInFirefox() {
		this.browser=new FirefoxDriver();
		browser.get("https://www.google.co.nz");
	}

	
	@When("^I type '(.*)' in search field$")
	public void typeSearchItem(String searchItem) {
	    	
	}
	
	
	@When("^I click the search button$")
	public void clickSearch() {		
	
   	}

	
	@Then("^I see the results for '(.*)'$")
	public void verifyResults(String result) {
		
	}
}
