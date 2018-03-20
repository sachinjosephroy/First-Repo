package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown_TotalElements {
	@Test
	public void regular() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement month_dropdown = driver.findElement(By.id("month"));
		
		Select month_dd = new Select(month_dropdown);
		List<WebElement> month_list = month_dd.getOptions();
		int total_month = month_list.size();
		Assert.assertEquals(total_month, 13);
		System.out.println("Total month count is " + total_month);
		
		for(WebElement ele: month_list) {
			String month_name = ele.getText();
			System.out.println("Months are = " + month_name);
		}
	}
}
