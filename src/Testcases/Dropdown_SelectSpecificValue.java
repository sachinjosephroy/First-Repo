package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_SelectSpecificValue {
	@Test
	public void regular() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement month_dropdown = driver.findElement(By.id("month"));
		
		Select month_dd = new Select(month_dropdown);
		WebElement selected_value = month_dd.getFirstSelectedOption();
		System.out.println("Before selection, the value is: " + selected_value.getText());
		month_dd.selectByIndex(3);
		WebElement selected_value_1 = month_dd.getFirstSelectedOption();
		System.out.println("After selection, the value is: " + selected_value_1.getText());
	}
}
