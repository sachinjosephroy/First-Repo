package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ModalWindow {
	
	@Test
	public static void handleModalWindow() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		driver.switchTo().frame("authiframe");
		driver.findElement(By.xpath("//input[@id='authMobile']")).sendKeys("Sachin");
		
	}

}
