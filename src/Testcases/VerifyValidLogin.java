package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import Pages.LoginPage;

public class VerifyValidLogin {
	
	@Test
	public void checkValidUser() {
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.phptravels.net/login");
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		login_page.login_wordpress("user@phptravels.com", "demouser");
	}

}
