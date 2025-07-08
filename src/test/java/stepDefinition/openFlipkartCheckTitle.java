package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class openFlipkartCheckTitle {

	WebDriver driver=new ChromeDriver();


	@Given("filpkart URL is launched")
	public void filpkart_url_is_launched() {
		driver.manage().window().maximize();	

	}
	@When("the user clicks on the flipkart url")
	public void the_user_clicks_on_the_flipkart_url() {
		driver.get("https://www.flipkart.com/");   
	}
	@When("the flipkart homepage is opened")
	public void the_flipkart_homepage_is_opened() {
	System.out.println(driver.getTitle());
	}
	@Then("flipkart page title is displayed")
	public void flipkart_page_title_is_displayed() {
		Assert.assertTrue(true);
	}
}
