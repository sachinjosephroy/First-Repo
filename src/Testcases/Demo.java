package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Helper;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Webdrivers\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		WebElement username = driver.findElement(By.id("email"));
		Helper.highLightElement(driver, username);
		username.sendKeys("sachin");
		
		
		WebElement password = driver.findElement(By.id("pass"));
		Helper.highLightElement(driver, password);
		password.sendKeys("roy");
		
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		Helper.highLightElement(driver, loginButton);
		loginButton.click();
	}

}
