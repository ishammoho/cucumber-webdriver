package Cucumber.BasicCalculator;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleCalculatorStepDefs {

	public WebDriver browser;
	
	@Given("^Google Caclculator is open in Firefox$")
	public void Google_is_open_in_InternetExplorer() throws Throwable {
		this.browser=new FirefoxDriver();
		browser.get("https://www.google.co.nz/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=online+calculator");
	}

	
	@When("^I click plus$")
	public void clickPlus() {
	    browser.findElement(By.xpath("//div[@id='cwbt46']/div/span")).click();			
	}
	
	
	@When("^I enter '(.*)'$")
	public void enterNumber(Integer number) {		
		switch (number) {
			case 1:
				browser.findElement(By.id("cwbt33")).click();
				break;
			case 2:
				browser.findElement(By.id("cwbt34")).click();
				break;
			case 3:
				browser.findElement(By.id("cwbt35")).click();
				break;
			case 4:
				browser.findElement(By.id("cwbt23")).click();
				break;
			case 5:
				browser.findElement(By.id("cwbt24")).click();
				break;
			case 6:
				browser.findElement(By.id("cwbt25")).click();
				break;
			case 7:
				browser.findElement(By.id("cwbt13")).click();
				break;
			case 8:
				browser.findElement(By.id("cwbt14")).click();
				break;
			case 9:
				browser.findElement(By.id("cwbt15")).click();
				break;
			default:
				break;
		}
   	}

	
	@When("^I calculate the total$")
	public void calculateTotal() {
		browser.findElement(By.xpath("//div[@id='cwbt45']/div/span")).click();
	}
	
	
	@Then("^I can see '(.*)' in the results$")
	public void verifyResults(int result) {
		String actualResult = browser.findElement(By.id("cwos")).getText();
		Assert.assertEquals(Integer.parseInt(actualResult), result);
		browser.quit();
	}
}
