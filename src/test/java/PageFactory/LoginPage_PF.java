package PageFactory;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_PF {
	WebDriver driver;
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(id ="name")
	WebElement txt_userName;
	
	@FindBy(id ="Password")
	WebElement txt_password;
	
	@FindBy(id ="login")
	WebElement btn_submit;
	
	public void enteruserName(String UserName) {
		txt_userName.sendKeys("");
	}
	public void enterPwd(String Password) {
		txt_password.sendKeys("");
	}
	public void clickSubmit() {
		btn_submit.click();
	}
}
