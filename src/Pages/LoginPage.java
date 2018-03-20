package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver){
		this.driver = ldriver;
	}
	
	/*@FindBy(id="user_login")
	@CacheLookup
	WebElement username;*/
	
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	@CacheLookup
	WebElement username;
	
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Login']")
	@CacheLookup
	WebElement submit_button;
	
	@FindBy(how = How.LINK_TEXT, using = "Forget Password")
	@CacheLookup
	WebElement forgot_password_link;
	
	public void login_wordpress(String uid, String pass) {
		username.sendKeys(uid);
		password.sendKeys(pass);
		submit_button.click();
	}
}
