package stepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class DataTableExample {

	WebDriver driver=DriverManager.getDriver();

	@Given("you are on the login page")
	public void you_are_on_the_login_page() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("your enters the valid user name and password")
	public void your_enters_the_valid_user_name_and_password(DataTable dataTable) {
//		List<String> input=dataTable.asList(String.class);
//		String username=input.get(0);
//		String password=input.get(1);
		
		List<Map<String,String>> map=dataTable.asMaps(String.class,String.class);
		String username1=null;
		String password1=null;
		for(Map<String,String> input:map) {
			username1=input.get("username");
			password1=input.get("password");
		}
		System.out.println(username1 + password1);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username1);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password1);
	}
	@When("you click on the login button")
	public void you_click_on_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}
	@Then("you should be navigate to the home page")
	public void you_should_be_navigate_to_the_home_page() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(true);
		DriverManager.quitDriver();
	}




}
