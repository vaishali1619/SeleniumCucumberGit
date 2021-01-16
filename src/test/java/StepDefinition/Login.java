package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver = null ;
	LoginPage login ;	
	
	@Given("Browser is open")
	public void user_opens_browser() {
		System.out.println("Hi");
		String projectpath = System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/BrowserDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}
	@When("^user enter (.*) and (.*)$")
	public void usier_enter_usrename_and_password(String usrename,String password) {

		login.enterUserName();
		login.enterUserPassword();
	}

	@Then("click submit button")
	public void click_submit_button() {
		login.clickSubmit();
	}
}
