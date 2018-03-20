package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Scroll {
	
	WebDriver driver;
	JavascriptExecutor je;
	
	@Test (priority=1)
	public void simpleScroll() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Webdrivers\\ChromeDriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.goibibo.com/");
		   
		   je = (JavascriptExecutor)driver;
		   je.executeScript("scroll(0, 400)");
		
	}
		
	@Test (priority=2)
	public void scrollIntoView() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Webdrivers\\ChromeDriver.exe");
		   driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("http://jquery.com/");
	       
	       WebElement element = driver.findElement(By.xpath("//img[@src='//jquery.com/jquery-wp-content/themes/jquery/content/books/jquery-in-action.jpg']"));
	       je = (JavascriptExecutor)driver;
	       je.executeScript("arguments[0].scrollIntoView(true)", element);
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
