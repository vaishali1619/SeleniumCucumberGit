package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
			if(!driver.getTitle().equals("")) 
			{
			throw new IllegalStateException("Not Login Page");	
			}
			
		}
	
	By txt_userName = By.id("name");
	By txt_Password = By.id("password");
	By btn_submit = By.id("login");
	
	public void enterUserName() {}
	public void enterUserPassword() {}
	public void clickSubmit() {}

}
