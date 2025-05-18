package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class openGoogledefinition {
	WebDriver driver;
	
	@Given("when user in google.co.in page")
	public void when_user_in_google_co_in_page() {
		driver=new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
	
	}
	@When("enter {string} in search field")
	public void enter_in_search_field(String string) {
	   driver.findElement(By.name("p")).sendKeys(string);
	}
	@When("hit search button")
	public void hit_search_button() {
	    driver.findElement(By.name("p")).submit();
	}
	@Then("user get search results of java")
	public void user_get_search_results_of_java() {
	    boolean status=driver.findElement(By.partialLinkText("java")).isDisplayed();
	    if(status==true) {
	    	System.out.println("result displayed");
	    }
	}


	
		
}
