package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
	
	  private static WebElement element = null;
	  
	  public static WebElement lnk_MyAccount(WebDriver driver) {	  
	     element = driver.findElement(By.id("account"));	  
	     return element;
	  }
}