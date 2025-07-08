package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver==null) {
			driver=new ChromeDriver();
		}
		return driver;
		
	}
	public static void quitDriver() {
		if(driver!=null) {
			driver.quit();
			driver=null;
		}
	}

}
