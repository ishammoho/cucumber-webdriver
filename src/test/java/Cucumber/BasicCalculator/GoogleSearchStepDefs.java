package Cucumber.BasicCalculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import pageObjects.GoogleHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchStepDefs {

	public WebDriver driver;
	
	@Given("^Google is open in Firefox$")
	public void openGoogleInFirefox() {
		this.driver=new FirefoxDriver();
		driver.get("https://www.google.co.nz");
		
//		GoogleHomePage.lnk_MyAccount(driver).click();
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

	@Then("^I can see the following text in the Google Search results Page snippet for '(.*?)':$")
	public void checkPageSnippetText(String text) {

	}
}
