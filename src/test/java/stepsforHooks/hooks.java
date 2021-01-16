package stepsforHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class hooks {
	
	WebDriver driver = null;
	
	@Before
	public void initiatebrowser() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/BrowserDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {

	  
	}

	@When("user enter valid username and password")
	public void uiser_eneter_valid_username_and_password() {

	  
	}

	@When("Clicks on Login button")
	public void clicks_on_Login_button() {

	  
	}

	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() {

	  
	}
}
