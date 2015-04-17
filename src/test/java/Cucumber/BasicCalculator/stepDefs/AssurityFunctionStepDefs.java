package Cucumber.BasicCalculator.stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import pageObjects.GoogleHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.NoSuchElementException;

public class AssurityFunctionStepDefs {

	public WebDriver driver;

	@Given("^I go to Assuirty Home page$")
	public void goToAssuirtyHomepage() {
		this.driver=new FirefoxDriver();
		driver.get("http://www.assurity.co.nz");
	}

	@Then("^I can see Assurity Logo in the Home page$")
	public void verifyLogoIsDisplayed() {
		try {
			driver.findElement(By.xpath("//a/img[@alt='Assurity - Confidence in software']")).isDisplayed();
		}catch (NoSuchElementException e){
			e.printStackTrace();
		}
		driver.quit();
	}

}