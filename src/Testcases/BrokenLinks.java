package Testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
	
	@Test
	public void findBrokenLinks() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.in");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are: " + links.size());
		
		for(int i=0; i<links.size(); i++) {
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			verifyLinkActive(url);
		}
		
	}
	
	public static void verifyLinkActive(String linkUrl) {
		
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(3000);
			httpURLConnect.connect();
			
			if(httpURLConnect.getResponseCode()==200) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseCode());
			}
			if(httpURLConnect.getResponseCode()==httpURLConnect.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseCode() + " - " + HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {
			System.out.println("There's an error: " + e.getMessage());
		}
		
	}

}
