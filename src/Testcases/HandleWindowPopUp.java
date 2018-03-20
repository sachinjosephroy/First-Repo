package Testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naukri.com");
		String parent = driver.getWindowHandle();
		System.out.println("Parent window ID is: " + parent);
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("Total widow: " + count);
		
		for(String child: allWindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("Child window title is: + driver.getTitle()");
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		System.out.println("Parent window title is: " + driver.getTitle());
		
	}

}
