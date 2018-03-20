package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	
	@Test
	public void mouseHover() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Webdrivers\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement ele = driver.findElement(By.xpath("//div[@class='dropdown']//button"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		int total_count = links.size();
		
		for(int i=0; i<total_count; i++) {
			WebElement element = links.get(i);
			String text = element.getAttribute("innerHTML");
			System.out.println("Links name is: " + text);
		}
		
	}

}
