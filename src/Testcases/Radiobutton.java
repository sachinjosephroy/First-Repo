package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radiobutton {
	
	@Test
	public void handleRadioButtons() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Webdrivers\\ChromeDriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
	    List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
	    
	    for(int i=0; i < radio.size(); i++) {
	    	WebElement local_radio = radio.get(i);
	    	String value = local_radio.getAttribute("value");
	    	System.out.println("Values from radio buttons are: " + value);
	    	
	    	if(value.equalsIgnoreCase("RUBY")) {
	    		local_radio.click();
	    		break;
	    	}
	    }

	}
}