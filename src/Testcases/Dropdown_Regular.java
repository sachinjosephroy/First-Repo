package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_Regular {
	@Test
	public void regular() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement month_dropdown = driver.findElement(By.id("month"));
		
		Select month_dd = new Select(month_dropdown);
		month_dd.selectByIndex(3);
		Thread.sleep(3000);
		month_dd.selectByValue("10");
		Thread.sleep(3000);
		month_dd.selectByVisibleText("Aug");
	}
}
