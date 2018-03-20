package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;
	
	public ConfigReader() {
		
		try {
			File src = new File("./Configuration/Config.property");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("There's an error: " + e.getMessage());
		} 
		
	}
	
	public String getChromePath() {
		
		String path = prop.getProperty("ChromeDriver");
		return path;
		
	}
	
	public String getURL() {
		return prop.getProperty("URL");
	}
	
}