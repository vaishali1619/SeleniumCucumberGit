package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.LoginPage_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_PF {
	WebDriver driver = null ;
	LoginPage_PF loginPage_PF ;	
	
	@Given("1Browser is open")
	public void user_opens_browser() {
		String projectpath = System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/BrowserDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		
	}
	@When("^1user enter (.*) and (.*)$")
	public void usier_enter_usrename_and_password(String username,String password) {
		loginPage_PF.enteruserName(username);
		loginPage_PF.enterPwd(password);
	}

	@Then("1click submit button")
	public void click_submit_button() {
		loginPage_PF.clickSubmit();
	}
}
