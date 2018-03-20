package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox {
	
	@Test
	public void handleCheckboxes() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Webdrivers\\ChromeDriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
	    List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    
	    for(int i=0; i < checkbox.size(); i++) {
	    	WebElement local_checkbox = checkbox.get(i);
	    	String id = local_checkbox.getAttribute("id");
	    	System.out.println("Values from checkboxes are: " + id);
	    	
	    	if(id.equalsIgnoreCase("code")) {
	    		local_checkbox.click();
	    		break;
	    	}
	    }

	}
}