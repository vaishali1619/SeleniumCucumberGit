package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Googlesearch {
	WebDriver driver = null;
	@Given("user opens Browser")
	public void user_opens_browser() {
		System.out.println("Hi");
		String projectpath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/BrowserDriver/chromedriver.exe");
		driver = new ChromeDriver();

	}
@ When("^user enters (.*) in serach box$")
public void entervalue(String text){
	
}
}
