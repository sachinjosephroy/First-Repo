package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Wait {
	
	WebDriver driver;
	
	@Test
	public void explicitWait() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		boolean status = element.isDisplayed();
		
		if(status) {
			System.out.println("Element is displayed");
		}
		else {
			System.out.println("Element is not displayed");
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

}
