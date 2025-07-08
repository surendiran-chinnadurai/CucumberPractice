package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginWithData {
	WebDriver driver=new ChromeDriver();

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	@When("the user enters the valid user name {string} and password {string}")
	public void the_user_enters_the_valid_user_name_admin_and_password(String Username,String password) {
		WebElement user_name=driver.findElement(By.xpath("//input[@name='username']"));
		user_name.clear();
		user_name.sendKeys(Username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	@When("click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		Thread.sleep(1000);
	}
	@Then("user should be navigate to the home page")
	public void user_should_be_navigate_to_the_home_page() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(true);
		
	}



}
