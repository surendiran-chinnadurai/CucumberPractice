package stepDefinition;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithExamples {

	WebDriver driver=DriverManager.getDriver();

	@When("your enters the valid user {string} name and password {string}")
	public void your_enters_the_valid_user_name_and_password(String username, String password) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		System.out.println(username + password);
		Thread.sleep(5000);
	}
	

}
