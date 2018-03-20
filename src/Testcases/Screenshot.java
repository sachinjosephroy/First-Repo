package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Utility.ScreenshotHelper;

public class Screenshot {
	
	WebDriver driver;
	
	@Test
	public void testScreenshot() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("Sachin");
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		
		if(result.getStatus() == ITestResult.FAILURE) {
			ScreenshotHelper.captureScreenshot(driver, result.getName());
			System.out.println("Please check the Screenshots folder for more details");
		}
		
	}

}
